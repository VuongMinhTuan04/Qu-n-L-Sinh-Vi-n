package com.edusys.entity;

import java.util.Date;

public class KhoaHoc {
    int MaKH;
    String MaCD;
    int HocPhi;
    int ThoiLuong;
    Date NgayKhaiGiang;
    String GhiChu;
    String MaNV;
    Date NgayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int MaKH, String MaCD, int HocPhi, int ThoiLuong, Date NgayKhaiGiang, String GhiChu, String MaNV, Date NgayTao) {
        this.MaKH = MaKH;
        this.MaCD = MaCD;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.NgayKhaiGiang = NgayKhaiGiang;
        this.GhiChu = GhiChu;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public int getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(int HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public Date getNgayKhaiGiang() {
        return NgayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date NgayKhaiGiang) {
        this.NgayKhaiGiang = NgayKhaiGiang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    } 
    
    public String toString() {
        return this.MaCD + "("+this.NgayKhaiGiang+")";
    }
}
