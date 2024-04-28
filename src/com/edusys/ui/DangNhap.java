package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;

public class DangNhap extends javax.swing.JFrame {

    public DangNhap() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHÂP - EDUSYS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mật Khẩu");

        btnDangNhap.setBackground(new java.awt.Color(153, 153, 255));
        btnDangNhap.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\dang_nhap.png")); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDangNhapMousePressed(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        btnKetThuc.setBackground(new java.awt.Color(153, 153, 255));
        btnKetThuc.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\ket_thuc.png")); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDangNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(txtTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnKetThuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        ketthuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        dangnhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapMousePressed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(checkError()){
               dangnhap(); 
            }
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed

    public static void main(String args[]) {

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DangNhap().setVisible(true);
//            }
//        });
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            new DangNhap().setVisible(true);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
    public void init() {
        setLocationRelativeTo(null);
    }
    NhanVienDAO dao = new NhanVienDAO();

    void dangnhap() {
        String maNV = txtTenDangNhap.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        NhanVien nhanVien = dao.selectByID(maNV);
        Auth.user = dao.selectByID(maNV);

        if (checkError()) {
            if (nhanVien == null) {
                MsgBox.alert(this, "Sai tên đăng nhập và mật khẩu!");
            } else if (!matKhau.equals(nhanVien.getMatKhau())) {
                MsgBox.alert(this, "Sai tên đăng nhập và mật khẩu!");
            } else {
                Auth.user = nhanVien;
                CuaSoChinh form = new CuaSoChinh();
                form.setVisible(true);
                this.dispose();
            }
        }
    }

    void ketthuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }

    boolean checkError() {
        if (txtTenDangNhap.getText().trim().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Tài khoản không được để trống!");
            return false;
        } else if (txtMatKhau.getText().trim().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Mật khẩu không được để trống!");
            return false;
        }
        return true;
    }
}
