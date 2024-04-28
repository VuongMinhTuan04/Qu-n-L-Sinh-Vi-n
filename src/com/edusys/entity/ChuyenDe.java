package com.edusys.entity;

public class ChuyenDe {
    String MaCD;
    String TenCD;
    int HocPhi;
    int ThoiLuong;
    String Hinh;
    String MoTaChuyenDe;

    public ChuyenDe() {
    }

    public String getMaCD() {
        return MaCD;
    }

    public ChuyenDe(String MaCD, String TenCD, int HocPhi, int ThoiLuong, String Hinh, String MoTaChuyenDe) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.Hinh = Hinh;
        this.MoTaChuyenDe = MoTaChuyenDe;
    }
    
    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
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

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTaChuyenDe() {
        return MoTaChuyenDe;
    }

    public void setMoTaChuyenDe(String MoTaChuyenDe) {
        this.MoTaChuyenDe = MoTaChuyenDe;
    }
    
    @Override
    public String toString(){ //Lấy tên để hiển thị trong ComboBox
        return this.TenCD;
    }
    
//    @Override
//    public boolean equals(Object obj){ //Lấy mã để so sánh 2 chuyên đề
//        ChuyenDe other = (ChuyenDe) obj;
//        return other.getMaCD().equals(this.getMaCD());
//    }
}
