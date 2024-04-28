package com.edusys.dao;

import com.edusys.entity.HocVien;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HocVienDAO extends EduSysDAO<HocVien, Integer>{
    String InsertSQL = "Insert into HocVien(MaKH,MaNH,Diem) Values(?,?,?)";
    String UpdateSQL = "Update HocVien Set MaKH=?,MaNH=?,Diem=? Where MaHV=?";
    String DeleteSQL = "Delete From HocVien Where MaHV=?";
    String Select_All_SQL = "Select * From HocVien";
    String Select_ByID_SQL = "Select * From HocVien Where MaHV=?";
    
    @Override
    public void insert(HocVien entity) {
        try {
            JdbcHelper.update(InsertSQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 
    }

    @Override
    public void update(HocVien entity) {
        try {
            JdbcHelper.update(UpdateSQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem(),entity.getMaHV());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JdbcHelper.update(DeleteSQL, id);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public HocVien selectByID(Integer id) {
        List<HocVien> list = this.selectBySQL(Select_ByID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySQL(Select_All_SQL);
    }

    @Override
    protected List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                HocVien arr = new HocVien();
                arr.setMaHV(rs.getInt("MaHV"));
                arr.setMaKH(rs.getInt("MaKH"));
                arr.setMaNH(rs.getString("MaNH"));
                arr.setDiem(rs.getInt("Diem"));
                list.add(arr);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<HocVien> selectByKhoaHoc(int maKH){
        String sql = "Select * From HocVien Where MaKH=?";
        return this.selectBySQL(sql, maKH);
    }
}
