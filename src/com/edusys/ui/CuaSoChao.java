package com.edusys.ui;

import com.edusys.utils.XImage;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;

public class CuaSoChao extends javax.swing.JFrame {

    public CuaSoChao() {
        initComponents();
        init();
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbLoading = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pgbLoading.setBackground(new java.awt.Color(204, 204, 204));
        pgbLoading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pgbLoading.setForeground(new java.awt.Color(255, 102, 51));
        pgbLoading.setStringPainted(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\LamBai\\Làm Lab\\Du An Mau\\EduSys\\src\\com\\edusys\\icon\\background_manhinhchao.jpg")); // NOI18N
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CuaSoChao().setVisible(true);
//            }
//        });
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            new CuaSoChao().setVisible(true);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pgbLoading;
    // End of variables declaration//GEN-END:variables
    Timer t;
    public void init(){
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        
        //Sự Kiện Loading
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = pgbLoading.getValue() + 1;
                pgbLoading.setString(value + "%");
                pgbLoading.setValue(value < 100 ? value : 0);
                
                if(value == 100){
                    t.stop();
                    new DangNhap().setVisible(true);
                    setVisible(false);
                }
            }
        };
            
        t = new Timer(10, a);
        t.start();
    }
}
