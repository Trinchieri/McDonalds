package view;

import controller.Constants;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.HappyMeal;

public class HappyMeal_frm extends javax.swing.JFrame {
    private String valuePanino, valueContorno, valueBibite, valueDessert;
    private boolean isAsporto;
    
    public HappyMeal_frm() {
        initComponents();
        
        bibita.setModel(new DefaultComboBoxModel<>(caricaBibite()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titolo = new javax.swing.JLabel();
        aggiungiOrdine = new javax.swing.JButton();
        panino = new javax.swing.JComboBox<>();
        labelPanino = new javax.swing.JLabel();
        labelContorno = new javax.swing.JLabel();
        contorno = new javax.swing.JComboBox<>();
        labelBibita = new javax.swing.JLabel();
        bibita = new javax.swing.JComboBox<>();
        labelDessert = new javax.swing.JLabel();
        dessert = new javax.swing.JComboBox<>();
        asporto = new javax.swing.JCheckBox();

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

        titolo.setText("HAPPYMEAL");

        aggiungiOrdine.setText("AGGIUNGI ALL'ORDINE");
        aggiungiOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiOrdineActionPerformed(evt);
            }
        });

        panino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "toast", "hamburger", "chickenburger" }));
        panino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paninoActionPerformed(evt);
            }
        });

        labelPanino.setText("PANINO:");

        labelContorno.setText("CONTORNO:");

        contorno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "patatine", "carotine baby" }));
        contorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contornoActionPerformed(evt);
            }
        });

        labelBibita.setText("BIBITA:");

        bibita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibitaActionPerformed(evt);
            }
        });

        labelDessert.setText("DESSERT:");

        dessert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "mela", "ananas", "formaggio", "actimel" }));

        asporto.setText("Asporto");
        asporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asportoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(aggiungiOrdine)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelContorno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contorno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBibita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bibita, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(asporto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelPanino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(panino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(titolo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titolo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPanino))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelContorno)
                    .addComponent(contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBibita)
                    .addComponent(bibita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDessert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(asporto)
                .addGap(18, 18, 18)
                .addComponent(aggiungiOrdine)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiOrdineActionPerformed
        try {
            McDonaldsGUI nuovoOrdine = new McDonaldsGUI();
            
            nuovoOrdine.setVisible(true);
            
            HappyMeal x = new HappyMeal(isAsporto);
            /*x.setPanino(valuePanino);
            x.setContorno(valueContorno);
            x.setBibita(valueBibite);
            x.setDessert(valueDessert);*/
            
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(HappyMeal_frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aggiungiOrdineActionPerformed

    private void paninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paninoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_paninoActionPerformed

    private void bibitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibitaActionPerformed
        
    }//GEN-LAST:event_bibitaActionPerformed

    private void asportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asportoActionPerformed
        if (asporto.isSelected()) {
            this.isAsporto = true;
        }
    }//GEN-LAST:event_asportoActionPerformed

    private void contornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contornoActionPerformed
    
    private String[] caricaBibite () {
        String [] bibite = new String [Constants.BIBITE.size()+1];
        int c = 0;
        
        bibite[0] = "select";
        
        for (Map.Entry i: Constants.BIBITE.entrySet()) {
            c++;
            bibite[c] = ((String) i.getKey()).toLowerCase();  
        } 
        
        return bibite;
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HappyMeal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HappyMeal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HappyMeal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HappyMeal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HappyMeal_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiOrdine;
    private javax.swing.JCheckBox asporto;
    private javax.swing.JComboBox<String> bibita;
    private javax.swing.JComboBox<String> contorno;
    private javax.swing.JComboBox<String> dessert;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBibita;
    private javax.swing.JLabel labelContorno;
    private javax.swing.JLabel labelDessert;
    private javax.swing.JLabel labelPanino;
    private javax.swing.JComboBox<String> panino;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}