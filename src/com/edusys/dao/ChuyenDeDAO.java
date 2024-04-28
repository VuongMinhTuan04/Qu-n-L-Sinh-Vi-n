package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{
    String InsertSQL = "Insert Into ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTaChuyenDe) Values(?,?,?,?,?,?)";
    String UpdateSQL = "Update ChuyenDe Set TenCD=?,HocPhi=?,ThoiLuong=?,Hinh=?,MoTaChuyenDe=? Where MaCD=?";
    String DeleteSQL = "Delete From ChuyenDe Where MaCD=?";
    String Select_All_SQL = "Select * From ChuyenDe";
    String Select_ByID_SQL = "Select * From ChuyenDe Where MaCD=?";
    
    @Override
    public void insert(ChuyenDe entity) {
        try {
            JdbcHelper.update(InsertSQL, entity.getMaCD(),entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTaChuyenDe());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(ChuyenDe entity) {
        try {
            JdbcHelper.update(UpdateSQL, entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTaChuyenDe(),entity.getMaCD());
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
    public ChuyenDe selectByID(String id) {
        List<ChuyenDe> list = this.selectBySQL(Select_ByID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySQL(Select_All_SQL);
    }

    @Override
    protected List<ChuyenDe> selectBySQL(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                ChuyenDe arr = new ChuyenDe();
                arr.setMaCD(rs.getString("MaCD"));
                arr.setTenCD(rs.getString("TenCD"));
                arr.setHocPhi(rs.getInt("HocPhi"));
                arr.setThoiLuong(rs.getInt("ThoiLuong"));
                arr.setHinh(rs.getString("Hinh"));
                arr.setMoTaChuyenDe(rs.getString("MoTaChuyenDe"));
                
                list.add(arr);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }    
}
