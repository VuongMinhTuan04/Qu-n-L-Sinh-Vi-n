package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class CuaSoChinh extends javax.swing.JFrame {

    public CuaSoChinh() {
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnChuyenDe = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblClock = new javax.swing.JLabel();
        lblHeThongQuanLy = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mnuDangNhap = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mnuChuyenDe = new javax.swing.JMenuItem();
        mnuKhoaHoc = new javax.swing.JMenuItem();
        mnuNguoiHoc = new javax.swing.JMenuItem();
        mnuHocVien = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mnuBangDiem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuLuongNguoiHoc = new javax.swing.JMenuItem();
        mnuDiemChuyenDe = new javax.swing.JMenuItem();
        mnuDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mnuHuongDanSuDung = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuGioiThieuSanPham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ QUẢN LÝ ĐÀO TẠO EDUSYS");

        jToolBar1.setRollover(true);

        btnChuyenDe.setBackground(new java.awt.Color(153, 153, 255));
        btnChuyenDe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChuyenDe.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\chuyen_de.png")); // NOI18N
        btnChuyenDe.setText("Chuyên Đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnKhoaHoc.setBackground(new java.awt.Color(153, 153, 255));
        btnKhoaHoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhoaHoc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\khoa_hoc.png")); // NOI18N
        btnKhoaHoc.setText("Khóa Học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setBackground(new java.awt.Color(153, 153, 255));
        btnHocVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHocVien.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\hoc_vien.png")); // NOI18N
        btnHocVien.setText("Học Viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocVien);

        btnNguoiHoc.setBackground(new java.awt.Color(153, 153, 255));
        btnNguoiHoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNguoiHoc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\nguoi_hoc.png")); // NOI18N
        btnNguoiHoc.setText("Người Học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnHuongDan.setBackground(new java.awt.Color(153, 153, 255));
        btnHuongDan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\huong_dan.png")); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        btnKetThuc.setBackground(new java.awt.Color(153, 153, 255));
        btnKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\ket_thuc.png")); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);

        btnDangXuat.setBackground(new java.awt.Color(153, 153, 255));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\dang_xuat.png")); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\background.jpg")); // NOI18N
        jLabel1.setOpaque(true);

        lblClock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClock.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\dong_ho.png")); // NOI18N

        lblHeThongQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHeThongQuanLy.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\thong_tin.png")); // NOI18N
        lblHeThongQuanLy.setText("Hệ Quản Lý Đào Tạo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThongQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeThongQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mnuHeThong.setText("Hệ Thống");

        mnuDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangNhap.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\dang_nhap.png")); // NOI18N
        mnuDangNhap.setText("Đăng Nhập");
        mnuDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDangNhap);

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangXuat.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\dang_xuat.png")); // NOI18N
        mnuDangXuat.setText("Đăng Xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDangXuat);
        mnuHeThong.add(jSeparator1);

        mnuDoiMatKhau.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\doi_mat_khau.png")); // NOI18N
        mnuDoiMatKhau.setText("Đổi Mật Khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuDoiMatKhau);
        mnuHeThong.add(jSeparator2);

        mnuKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mnuKetThuc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\ket_thuc.png")); // NOI18N
        mnuKetThuc.setText("Kết Thúc");
        mnuKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mnuKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản Lý");

        mnuChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuChuyenDe.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\chuyen_de.png")); // NOI18N
        mnuChuyenDe.setText("Chuyên Đề");
        mnuChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuChuyenDe);

        mnuKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuKhoaHoc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\khoa_hoc.png")); // NOI18N
        mnuKhoaHoc.setText("Khóa Học");
        mnuKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuKhoaHoc);

        mnuNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNguoiHoc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\nguoi_hoc.png")); // NOI18N
        mnuNguoiHoc.setText("Người Học");
        mnuNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuNguoiHoc);

        mnuHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuHocVien.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\hoc_vien.png")); // NOI18N
        mnuHocVien.setText("Học Viên");
        mnuHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuHocVien);
        mnuQuanLy.add(jSeparator3);

        mnuNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNhanVien.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\nhan_vien.png")); // NOI18N
        mnuNhanVien.setText("Nhân Viên");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống Kê");
        mnuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongKeActionPerformed(evt);
            }
        });

        mnuBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuBangDiem.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\bang_diem.png")); // NOI18N
        mnuBangDiem.setText("Bảng Điểm");
        mnuBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mnuBangDiem);
        mnuThongKe.add(jSeparator5);

        mnuLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuLuongNguoiHoc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\luong_nguoi_hoc.png")); // NOI18N
        mnuLuongNguoiHoc.setText("Lượng Người Học");
        mnuLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mnuLuongNguoiHoc);

        mnuDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuDiemChuyenDe.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\chart.png")); // NOI18N
        mnuDiemChuyenDe.setText("Điểm Chuyên Đề");
        mnuDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mnuDiemChuyenDe);

        mnuDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuDoanhThu.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\doanh_thu.png")); // NOI18N
        mnuDoanhThu.setText("Doanh Thu");
        mnuDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mnuDoanhThu);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ Giúp");

        mnuHuongDanSuDung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuHuongDanSuDung.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\huong_dan.png")); // NOI18N
        mnuHuongDanSuDung.setText("Hướng Dẫn Sử Dụng");
        mnuHuongDanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHuongDanSuDungActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mnuHuongDanSuDung);
        mnuTroGiup.add(jSeparator4);

        mnuGioiThieuSanPham.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\thong_tin.png")); // NOI18N
        mnuGioiThieuSanPham.setText("Giới Thiệu Sản Phẩm");
        mnuGioiThieuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGioiThieuSanPhamActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mnuGioiThieuSanPham);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangNhapActionPerformed
        // TODO add your handling code here:
        DangNhap form = new DangNhap();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuDangNhapActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Bạn chưa đăng nhập nên không đăng xuất được!");
        } else {
            dangXuat();
        }
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        // TODO add your handling code here:
        openDoiMatKhau();
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void mnuKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_mnuKetThucActionPerformed

    private void mnuChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_mnuChuyenDeActionPerformed

    private void mnuKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhoaHocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_mnuKhoaHocActionPerformed

    private void mnuNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNguoiHocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_mnuNguoiHocActionPerformed

    private void mnuHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHocVienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_mnuHocVienActionPerformed

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void mnuBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBangDiemActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        } else {
            this.openThongKe(0);
        }
    }//GEN-LAST:event_mnuBangDiemActionPerformed

    private void mnuLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLuongNguoiHocActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        } else {
            this.openThongKe(1);
        }
    }//GEN-LAST:event_mnuLuongNguoiHocActionPerformed

    private void mnuDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDiemChuyenDeActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        } else {
            this.openThongKe(2);
        }
    }//GEN-LAST:event_mnuDiemChuyenDeActionPerformed

    private void mnuDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoanhThuActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        } else {
            this.openThongKe(3);
        }
    }//GEN-LAST:event_mnuDoanhThuActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Bạn chưa đăng nhập nên không đăng xuất được!");
        } else {
            dangXuat();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mnuGioiThieuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGioiThieuSanPhamActionPerformed
        // TODO add your handling code here:
        GioiThieu form = new GioiThieu();
        form.setVisible(true);
    }//GEN-LAST:event_mnuGioiThieuSanPhamActionPerformed

    private void mnuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuThongKeActionPerformed

    private void mnuHuongDanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHuongDanSuDungActionPerformed
        // TODO add your handling code here:
        openHuongDan();
    }//GEN-LAST:event_mnuHuongDanSuDungActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        openHuongDan();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuaSoChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblHeThongQuanLy;
    private javax.swing.JMenuItem mnuBangDiem;
    private javax.swing.JMenuItem mnuChuyenDe;
    private javax.swing.JMenuItem mnuDangNhap;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDiemChuyenDe;
    private javax.swing.JMenuItem mnuDoanhThu;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JMenuItem mnuGioiThieuSanPham;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenuItem mnuHocVien;
    private javax.swing.JMenuItem mnuHuongDanSuDung;
    private javax.swing.JMenuItem mnuKetThuc;
    private javax.swing.JMenuItem mnuKhoaHoc;
    private javax.swing.JMenuItem mnuLuongNguoiHoc;
    private javax.swing.JMenuItem mnuNguoiHoc;
    private javax.swing.JMenuItem mnuNhanVien;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
    public void init() {
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());

        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss aa");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblClock.setText(sdf.format(new Date()));
            }

        }).start();
    }

    void openDoiMatKhau() {
        if (Auth.isLogin()) {
            DoiMatKhau form = new DoiMatKhau();
            form.setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void dangXuat() {
        Auth.clear();
        new DangNhap().setVisible(true);
        dispose();
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }

    void openNhanVien() {
        if (Auth.isLogin()) {
            new QuanLyNhanVien().setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openHocVien() {
        if (Auth.isLogin()) {
            new QuanLyHocVien().setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openKhoaHoc() {
        if (Auth.isLogin()) {
            new QuanLyKhoaHoc().setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openChuyenDe() {
        if (Auth.isLogin()) {
            new QuanLyChuyenDe().setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openNguoiHoc() {
        if (Auth.isLogin()) {
            new QuanLyNguoiHoc().setVisible(true);
            dispose();
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
            } else {
                ThongKe form = new ThongKe();
                form.setVisible(true);
                form.selectTab(index);
                dispose();
            }
        }
    }

    void openGioiThieu() {
        if (Auth.isLogin()) {
            new GioiThieu().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (IOException e) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn");
        }
    }
}
