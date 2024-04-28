package com.edusys.dao;

import com.edusys.entity.NhanVien;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO extends EduSysDAO<NhanVien, String>{
    String InsertSQL = "Insert into NhanVien(MaNV,HoTen,MatKhau,VaiTro) Values(?,?,?,?)";
    String UpdateSQL = "Update NhanVien Set HoTen=?, MatKhau=?, VaiTro=? Where MaNV=?";
    String DeleteSQL = "Delete From NhanVien Where MaNV=?";
    String Select_All_SQL = "Select * From NhanVien";
    String Select_ByID_SQL = "Select * From NhanVien Where MaNV=?";
    
    @Override
    public void insert(NhanVien entity) {
        try {
            JdbcHelper.update(InsertSQL, entity.getMaNV(),entity.getHoTen(),entity.getMatKhau(),entity.getVaiTro());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            JdbcHelper.update(UpdateSQL, entity.getHoTen(),entity.getMatKhau(),entity.getVaiTro(),entity.getMaNV());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcHelper.update(DeleteSQL, id);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public NhanVien selectByID(String id) {
        List<NhanVien> list = this.selectBySQL(Select_ByID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySQL(Select_All_SQL); 
    }

    @Override
    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                NhanVien arr = new NhanVien();
                arr.setMaNV(rs.getString("MaNV"));
                arr.setHoTen(rs.getString("HoTen"));
                arr.setMatKhau(rs.getString("MatKhau"));
                arr.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(arr);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }   
}
