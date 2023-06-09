package view;

import controller.GestoreOrdini;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ordine_frm extends javax.swing.JFrame {

    public GestoreOrdini go = new GestoreOrdini();
    
    public Ordine_frm() throws Exception {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(245, 242, 230));
        checkOrdine.setBackground(new java.awt.Color (255,240,93));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        cafe = new javax.swing.JButton();
        happymeal = new javax.swing.JButton();
        checkOrdine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mcmenu.png"))); // NOI18N
        menu.setPreferredSize(new java.awt.Dimension(225, 150));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mccafe.png"))); // NOI18N
        cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeActionPerformed(evt);
            }
        });

        happymeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/happyM.png"))); // NOI18N
        happymeal.setPreferredSize(new java.awt.Dimension(225, 140));
        happymeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                happymealActionPerformed(evt);
            }
        });

        checkOrdine.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        checkOrdine.setText("CHECK ORDINE");
        checkOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrdineActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel1.setText("McDonald's");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(happymeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(checkOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cafe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(happymeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(checkOrdine)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        try {
            Menu_frm menuGUI = new Menu_frm(this);
            menuGUI.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Ordine_frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuActionPerformed
    
    private void cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeActionPerformed
        try {
            McCafe_frm cafeGUI = new McCafe_frm(this);
            cafeGUI.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Ordine_frm.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_cafeActionPerformed

    private void happymealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_happymealActionPerformed
        HappyMeal_frm happyMealGUI = new HappyMeal_frm(this);
        happyMealGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_happymealActionPerformed

    private void checkOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrdineActionPerformed
        CheckOrdine checkGUI = new CheckOrdine(this);
        checkGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkOrdineActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ordine_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordine_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordine_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordine_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ordine_frm().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Ordine_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cafe;
    private javax.swing.JButton checkOrdine;
    private javax.swing.JButton happymeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
