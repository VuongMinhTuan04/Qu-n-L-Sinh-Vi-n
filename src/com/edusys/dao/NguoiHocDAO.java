package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String>{
    String InsertSQL = "Insert Into NguoiHoc(MaNH,HoTen,NgaySinh,GioiTinh,DienThoai,Email,GhiChu,MaNV,NgayDangKy) Values(?,?,?,?,?,?,?,?,?)";
    String UpdateSQL = "Update NguoiHoc Set HoTen=?,NgaySinh=?,GioiTinh=?,DienThoai=?,Email=?,GhiChu=?,MaNV=?,NgayDangKy=? Where MaNH=?";
    String DeleteSQL = "Delete From NguoiHoc Where MaNH=?";
    String Select_All_SQL = "Select * From NguoiHoc";
    String Select_ByID_SQL = "Select * From NguoiHoc Where MaNH=?";
    
    @Override
    public void insert(NguoiHoc entity) {
        try {
            JdbcHelper.update(InsertSQL, entity.getMaNH(),
                    entity.getHoTen(),
                    new java.sql.Date(entity.getNgaySinh().getTime()),
                    entity.getGioiTinh(),
                    entity.getDienThoai(),
                    entity.getEmail(),
                    entity.getGhiChu(),
                    entity.getMaNV(),
                    new java.sql.Date(entity.getNgayDangKy().getTime())
                    );
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(NguoiHoc entity) {
        try {
            JdbcHelper.update(UpdateSQL, entity.getHoTen(),entity.getNgaySinh(),entity.getGioiTinh(),entity.getDienThoai(),entity.getEmail(),entity.getGhiChu(),entity.getMaNV(),entity.getNgayDangKy(),entity.getMaNH());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcHelper.update(DeleteSQL,id);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public NguoiHoc selectByID(String id) {
       List<NguoiHoc> list = this.selectBySQL(Select_ByID_SQL, id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySQL(Select_All_SQL);
    }

    @Override
    protected List<NguoiHoc> selectBySQL(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                NguoiHoc arr = new NguoiHoc();
                arr.setMaNH(rs.getString("MaNH"));
                arr.setHoTen(rs.getString("HoTen"));
                arr.setNgaySinh(rs.getDate("NgaySinh"));
                arr.setGioiTinh(rs.getBoolean("GioiTinh"));
                arr.setDienThoai(rs.getString("DienThoai"));
                arr.setEmail(rs.getString("Email"));
                arr.setGhiChu(rs.getString("GhiChu"));
                arr.setMaNV(rs.getString("MaNV"));
                arr.setNgayDangKy(rs.getDate("NgayDangKy"));
                list.add(arr);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<NguoiHoc> selectByKeyWord(String keyword){
        String sql = "Select * From NguoiHoc Where HoTen Like ?";
        return this.selectBySQL(sql, "%"+keyword+"%");
    }
    
    public List<NguoiHoc> selectNotlnCourse(int maKH, String keyword){
        String sql = "Select * From NguoiHoc Where HoTen Like ? And " 
                + "MaNH Not In (Select MaNH From HocVien Where MaKH=?)";
        return this.selectBySQL(sql, "%"+keyword+"%",maKH);
    }
}
