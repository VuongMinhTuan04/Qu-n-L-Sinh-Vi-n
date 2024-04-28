package com.edusys.utils;

import com.edusys.entity.NhanVien;

public class Auth {
    public static NhanVien user = null; // Duy trì user đăng nhập vào hệ thống
    
    public static void clear(){
        Auth.user = null;
    }
    
    public static boolean isLogin(){
        return Auth.user != null; //Nếu chưa đăng nhập user sẽ là null
    }
    
    public static boolean isManager(){
        return Auth.isLogin() && user.getVaiTro(); //Kiểm tra có phải quản lý hay không
    }
}
