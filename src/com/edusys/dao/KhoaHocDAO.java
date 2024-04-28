package com.edusys.dao;

import com.edusys.entity.KhoaHoc;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer>{
    String InsertSQL = "Insert Into KhoaHoc(MaCD,HocPhi,ThoiLuong,NgayKhaiGiang,GhiChu,MaNV,NgayTao) Values(?,?,?,?,?,?,?)";
    String UpdateSQL = "Update KhoaHoc Set MaCD=?,HocPhi=?,ThoiLuong=?,NgayKhaiGiang=?,GhiChu=?,MaNV=?,NgayTao=? Where MaKH=?";
    String DeleteSQL = "Delete From KhoaHoc Where MaKH=?";
    String Select_All_SQL = "Select * From KhoaHoc";
    String Select_ByID_SQL = "Select * From KhoaHoc Where MaKH=?";
    
    @Override
    public void insert(KhoaHoc entity) {
        try {
            JdbcHelper.update(InsertSQL, entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getNgayKhaiGiang(),entity.getGhiChu(),entity.getMaNV(),entity.getNgayTao());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(KhoaHoc entity) {
        try {
            JdbcHelper.update(UpdateSQL, entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getNgayKhaiGiang(),entity.getGhiChu(),entity.getMaNV(),entity.getNgayTao(), entity.getMaKH());
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
    public KhoaHoc selectByID(Integer id) {
        List<KhoaHoc> list = this.selectBySQL(Select_ByID_SQL,id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return this.selectBySQL(Select_All_SQL);
    }

    @Override
    protected List<KhoaHoc> selectBySQL(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                KhoaHoc arr = new KhoaHoc();
                arr.setMaKH(rs.getInt("MaKH"));
                arr.setMaCD(rs.getString("MaCD"));
                arr.setHocPhi(rs.getInt("HocPhi"));
                arr.setThoiLuong(rs.getInt("ThoiLuong"));
                arr.setNgayKhaiGiang(rs.getDate("NgayKhaiGiang"));
                arr.setGhiChu(rs.getString("GhiChu"));
                arr.setMaNV(rs.getString("MaNV"));
                arr.setNgayTao(rs.getDate("NgayTao"));
                
                list.add(arr);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    } 
    
    public List<KhoaHoc> selectByChuyenDe(String maCD){
        String sql = "Select * From KhoaHoc Where MaCD=?";
        return this.selectBySQL(sql, maCD);
    }
    
    public List<Integer> selectYears(){
        String sql = "Select Distinct year(NgayKhaiGiang) From KhoaHoc Order By year(NgayKhaiGiang) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
