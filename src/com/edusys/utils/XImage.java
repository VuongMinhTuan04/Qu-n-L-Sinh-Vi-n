package com.edusys.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/com/edusys/icon/logo.png"); //Tạo ra icon JFrame
        return new ImageIcon(url).getImage();
    }
    
    public static void save(File src){ //Tạo ra thư mục và đưa 1 cái file lưu trữ ảnh vào trong
        File dst = new File("image",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs(); //Tạo thư mục logos nếu chưa tồn tại
        }
        
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING); //Copy file vào thư mục logos và nếu đã tồn tại sẽ thay thế
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName){ //Đọc hình ảnh lên JLabel
        File path = new File("image",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
