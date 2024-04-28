CREATE DATABASE EDUSYS

USE EDUSYS

create table NhanVien(
	MaNV nvarchar(5) not null,
	HoTen nvarchar(50) not null,
	MatKhau nvarchar(50) not null,
	VaiTro bit not null
	PRIMARY KEY(MaNV)
)
GO
create table ChuyenDe(
	MaCD nvarchar(5) not null,
	TenCD nvarchar(50) not null,
	HocPhi int not null,
	ThoiLuong int not null,
	Hinh nvarchar(50) not null,
	MoTaChuyenDe nvarchar(255) not null
	PRIMARY KEY(MaCD)
)
GO
create table KhoaHoc(
	MaKH int identity(1,1) not null,
	MaCD nvarchar(5) not null,
	HocPhi int not null,
	ThoiLuong int not null,
	NgayKhaiGiang date not null,
	GhiChu nvarchar(50) null,
	MaNV nvarchar(5) not null,
	NgayTao date not null,
	PRIMARY KEY(MaKH),
	FOREIGN KEY(MaCD) REFERENCES ChuyenDe(MaCD) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
)
GO
create table NguoiHoc(
	MaNH nvarchar(5) not null,
	HoTen nvarchar(50) not null,
	NgaySinh date not null,
	GioiTinh bit not null,
	DienThoai nvarchar(12) not null,
	Email nvarchar(50) not null,
	GhiChu nvarchar(max) null,
	MaNV nvarchar(5) not null,
	NgayDangKy date not null,
	PRIMARY KEY(MaNH),
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
)
GO
create table HocVien(
	MaHV int identity(1,1) not null,
	MaKH int not null,
	MaNH nvarchar(5) not null,
	Diem int not null,
	PRIMARY KEY(MaHV),
	FOREIGN KEY(MaNH) REFERENCES NguoiHoc(MaNH) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY(MaKH) REFERENCES KhoaHoc(MaKH) ON DELETE CASCADE ON UPDATE NO ACTION
)

--Report: MaNH - HoTen - Diem
CREATE PROC sp_BangDiem(@MaKH INT)
AS 
	BEGIN
		SELECT NguoiHoc.MaNH, HoTen, Diem
		FROM 
			HocVien JOIN NguoiHoc 
			ON NguoiHoc.MaNH = HocVien.MaNH
		WHERE HocVien.MaKH = @MaKH
		ORDER BY HocVien.Diem DESC
	END

--Report: TenChuyenDe - SoHocVien - DiemThapNhat - DiemCaoNhat - DiemTrungBinh
CREATE PROC sp_ThongKeDiem
AS
	BEGIN
		SELECT 
			ChuyenDe.TenCD, 
			Count(MaHV) SoHV,
			MIN(Diem) ThapNhat,
			MAX(Diem) CaoNhat,
			AVG(Diem) TrungBinh
		FROM 
			KhoaHoc Join HocVien 
			ON KhoaHoc.MaKH = HocVien.MaKH
			Join ChuyenDe 
			ON KhoaHoc.MaCD = ChuyenDe.MaCD
		GROUP BY TenCD
	END

--Report: TenCD - SoKhoaHoc - SoHocVien - DoanhThu - ThapNhat - CaoNhat - TrungBinh
CREATE PROC sp_ThongKeDoanhThu (@Year int)
AS 
	BEGIN
		SELECT 
			ChuyenDe.TenCD,
			COUNT(DISTINCT KhoaHoc.MaKH) SoKhoaHoc,
			COUNT(HocVien.MaHV) SoHocVien,
			SUM(KhoaHoc.HocPhi) DoanhThu,
			MIN(KhoaHoc.HocPhi) ThapNhat,
			MAX(KhoaHoc.HocPhi) CaoNhat,
			AVG(KhoaHoc.HocPhi) TrungBinh
		FROM 
			KhoaHoc Join HocVien
			ON KhoaHoc.MaKH =  HocVien.MaKH
			Join ChuyenDe 
			ON ChuyenDe.MaCD = KhoaHoc.MaCD
		WHERE YEAR(NgayKhaiGiang) = @Year
		GROUP BY TenCD
	END

--Report: Nam - SoLuong - DauTien - CuoiCung
CREATE PROC sp_ThongKeNguoiHoc
AS
	BEGIN
		SELECT
			YEAR(NgayDangKy) Nam,
			COUNT(*) SoLuong,
			MIN(NgayDangKy) DauTien,
			MAX(NgayDangKy) CuoiCung
		FROM NguoiHoc
		GROUP BY YEAR(NgayDangKy)
	END