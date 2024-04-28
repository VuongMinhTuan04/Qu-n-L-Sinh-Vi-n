package com.edusys.dao;
import com.edusys.utils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){ //Phục vụ cho các phương thức còn lại
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for(int i = 0; i < cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<Object[]> getBangDiem(Integer makh){
        String sql = "{CALL sp_BangDiem(?)}";
        String[] cols = {"MaNH","HoTen","Diem"};
        return this.getListOfArray(sql, cols, makh);
    }
    
    public List<Object[]> getLuongNguoiHoc(){
        String sql = "{CALL sp_ThongKeNguoiHoc}";
        String[] cols = {"Nam","SoLuong","DauTien","CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDiemChuyenDe(){
        String sql = "{CALL sp_ThongKeDiem}";
        String[] cols = {"TenCD","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(int nam){
        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
        String[] cols = {"TenCD","SoKhoaHoc","SoHocVien","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }    
}
