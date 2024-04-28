package com.edusys.utils;

import com.edusys.dao.NguoiHocDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.ui.ThongKe;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
    public static Workbook printNguoiHocToExcel(javax.swing.JTable tblNguoiHoc, NguoiHocDAO daoNguoiHoc) throws FileNotFoundException, IOException{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Người Học");
        
        List<NguoiHoc> list = daoNguoiHoc.selectAll();
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        //Mã Người Học
        cell = row.createCell(0,CellType.STRING);
        cell.setCellValue("Mã Người Học");
        cell.setCellStyle(style);
        
        //Họ Tên
        cell = row.createCell(1,CellType.STRING);
        cell.setCellValue("Họ Tên");
        cell.setCellStyle(style);
        
        //Ngày Sinh
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Ngày Sinh");
        cell.setCellStyle(style);

        
        
        //Giới Tính
        cell = row.createCell(3,CellType.STRING);
        cell.setCellValue("Giới Tính");
        cell.setCellStyle(style);
        
        //Số Điện Thoại
        cell = row.createCell(4,CellType.NUMERIC);
        cell.setCellValue("Số Điện Thoại");
        cell.setCellStyle(style);
        
        //Email
        cell = row.createCell(5,CellType.STRING);
        cell.setCellValue("Email");
        cell.setCellStyle(style);
        
        //DATA
        for(int i = 0; i < list.size(); i++){
            rownum++;
            row = sheet.createRow(rownum);
            
            //Mã người học
            cell = row.createCell(0,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 0));
            
            //Họ tên
            cell = row.createCell(1,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 1));
            
            //Ngày sinh
            
            cell = row.createCell(2,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 2).toString());
            
            
            //Giới tính
            cell = row.createCell(3,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 3));
            
            //Số điện thoại
            cell = row.createCell(4,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 4));
            
            //Email
            cell = row.createCell(5,CellType.STRING);
            cell.setCellValue((String)tblNguoiHoc.getValueAt(i, 5));
        }
        return workbook;
    }
    
    public static Workbook printThongKeToExcel(javax.swing.JTable tblBangDiem, javax.swing.JComboBox<String> cboKhoaHoc,
            javax.swing.JTable tblNguoiHoc, javax.swing.JTable tblDiemChuyenDe, 
            ThongKeDAO daoThongKe) throws FileNotFoundException, IOException{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Thống Kê");
        
        //Bảng Điểm
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        List<Object[]> listBangDiem = daoThongKe.getBangDiem(khoaHoc.getMaKH());
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        //Mã người học
        cell = row.createCell(0,CellType.STRING);
        cell.setCellValue("Mã Người Học");
        cell.setCellStyle(style);
        
        //Họ tên
        cell = row.createCell(1,CellType.STRING);
        cell.setCellValue("Họ Tên");
        cell.setCellStyle(style);
        
        //Điểm
        cell = row.createCell(2,CellType.NUMERIC);
        cell.setCellValue("Điểm");
        cell.setCellStyle(style);
        
        //Xếp loại
        cell = row.createCell(3,CellType.STRING);
        cell.setCellValue("Xếp Loại");
        cell.setCellStyle(style);
        
        for(int i = 0; i < listBangDiem.size(); i++){
            rownum++;
            row = sheet.createRow(rownum);
            
            //Mã người học
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue((String) tblBangDiem.getValueAt(i, 0));

            //Họ tên
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue((String) tblBangDiem.getValueAt(i, 1));

            //Điểm
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue((Integer) tblBangDiem.getValueAt(i, 2));

            //Xếp loại
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue((String) tblBangDiem.getValueAt(i, 3));
        }
        return workbook;
    }
    
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook){
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
}
