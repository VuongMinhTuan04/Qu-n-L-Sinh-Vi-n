package com.edusys.utils;
import java.sql.*;

public class JdbcHelper {
//    public static Connection openConnection() throws Exception{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        
//        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=EDUSYS;" + "encrypt=false";
//        String user = "sa";
//        String pass = "123";
//        
//        Connection con = DriverManager.getConnection(connectionURL,user,pass);
//        return con;
//    }
    
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String connectionURL = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=EDUSYS;";
    static String user = "sa";
    static String pass = "123";
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement getStmt (String sql, Object...args) throws SQLException{
        Connection con = DriverManager.getConnection(connectionURL,user,pass);
        PreparedStatement stmt;
        
        if(sql.trim().startsWith("{")){
            stmt = con.prepareCall(sql);
        }else{
            stmt = con.prepareStatement(sql);
        }
        
        for(int i = 0; i < args.length; i++){
            stmt.setObject(i + 1, args[i]);
        }
        
        return stmt;
        
        /*Ex: String sql = "SQL...?, ?, ?"
              PreparedStatement stmt = JDBCHelper.getStmt(sql, "a1", "a2", "a3")*/
    }
    
    public static ResultSet query(String sql, Object...args) throws SQLException{
        PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
        return stmt.executeQuery();
        
        /*Ex: String sql = "Select * from NhanVien Where MaNV=?" Dung khi co dieu kien
              ResultSet rs = JDBCHelper.query(sql,"TeoNV");
        
              String sql = "{CALL sp_BangDiem(?)}" Dung cho Thong ke
              ResultSet rs = JDBCHelper.query(sql,1000)*/
    }
    
    public static int update(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
        try {
            return stmt.executeUpdate();
        } finally {
            stmt.getConnection().close(); // Khi hoan thanh update se dong ket noi
        }

        /*Ex: String sql = "Insert ... ?,?,?"
                  String sql = "Update ... ?,?,?"
                  String sql = "Deletse ... ?,?,?"
                  JdbcHelper.update(sql,"a1","a2","a3")*/
    }
    
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            
            rs.getStatement().getConnection().close();
            return null;
            /*Ex: String sql = "Select count(*) From NhanVien"
                  int count = (Integer) JdbcHelper.value(sql)
            
                  String sql = "Select HoTen From NhanVien Where MaNV=?"
                  String name = (String) JdbcHelper.value(sql,"TeoNV")*/
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }
}
