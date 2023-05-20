package view;

import controller.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import model.HappyMeal;

public class HappyMeal_frm extends javax.swing.JFrame {
    private String valuePanino = "", valueContorno = "", valueBibita = "", valueDessert = "";
    
    public HappyMeal_frm(Ordine_frm aThis) {
        initComponents();
        
        aggiungiOrdine.setEnabled(false);
        
        sceltaBibite.setModel(new DefaultComboBoxModel<>(caricaBibite()));
        
        aggiungiOrdine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    aThis.go.addOrdine(creaOrdine());
                    aThis.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(McCafe_frm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(HappyMeal_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titolo = new javax.swing.JLabel();
        aggiungiOrdine = new javax.swing.JButton();
        sceltaPanini = new javax.swing.JComboBox<>();
        labelPanino = new javax.swing.JLabel();
        labelContorno = new javax.swing.JLabel();
        sceltaContorni = new javax.swing.JComboBox<>();
        labelBibita = new javax.swing.JLabel();
        sceltaBibite = new javax.swing.JComboBox<>();
        labelDessert = new javax.swing.JLabel();
        sceltaDesserts = new javax.swing.JComboBox<>();

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

        sceltaPanini.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "toast", "hamburger", "chickenburger" }));
        sceltaPanini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaPaniniActionPerformed(evt);
            }
        });

        labelPanino.setText("PANINO:");

        labelContorno.setText("CONTORNO:");

        sceltaContorni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "patatine", "carotine baby" }));
        sceltaContorni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaContorniActionPerformed(evt);
            }
        });

        labelBibita.setText("BIBITA:");

        sceltaBibite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaBibiteActionPerformed(evt);
            }
        });

        labelDessert.setText("DESSERT:");

        sceltaDesserts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mela", "ananas", "formaggio", "actimel" }));
        sceltaDesserts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaDessertsActionPerformed(evt);
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
                        .addComponent(sceltaContorni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBibita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sceltaBibite, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sceltaDesserts, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelPanino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPanino))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelContorno)
                    .addComponent(sceltaContorni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBibita)
                    .addComponent(sceltaBibite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sceltaDesserts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDessert))
                .addGap(46, 46, 46)
                .addComponent(aggiungiOrdine)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private HappyMeal creaOrdine() throws Exception{        
        HappyMeal x = new HappyMeal();
        
        x.setPanino(valuePanino);
        x.setContorno(valueContorno);
        x.setBibita(valueBibita);
        x.setDessert(valueDessert);
        
        return x;
    }
    
    private void aggiungiOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiOrdineActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aggiungiOrdineActionPerformed

    private void sceltaPaniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaPaniniActionPerformed
        //get selected value from the combobox
        valuePanino = sceltaPanini.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaPaniniActionPerformed

    private void sceltaBibiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaBibiteActionPerformed
        //get selected value from the combobox
        valueBibita = sceltaBibite.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaBibiteActionPerformed

    private void sceltaContorniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaContorniActionPerformed
        //get selected value from the combobox
        valueContorno = sceltaContorni.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaContorniActionPerformed

    private void sceltaDessertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaDessertsActionPerformed
        //get selected value from the combobox
        valueDessert = sceltaDesserts.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaDessertsActionPerformed
    
    private String[] caricaBibite () {
        String [] bibite = new String [Constants.BIBITE.size()];
        int c = 0;
        
        for (Map.Entry i: Constants.BIBITE.entrySet()) {
            bibite[c] = ((String) i.getKey()).toLowerCase();
            c++;
        } 
        
        return bibite;
    }
    
    private void controlloAggiungiOrdine () {
        if (!valuePanino.equals("") && !valueContorno.equals("") && !valueBibita.equals("") && !valueDessert.equals("")) {
            aggiungiOrdine.setEnabled(true);
        }
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
                new HappyMeal_frm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiOrdine;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBibita;
    private javax.swing.JLabel labelContorno;
    private javax.swing.JLabel labelDessert;
    private javax.swing.JLabel labelPanino;
    private javax.swing.JComboBox<String> sceltaBibite;
    private javax.swing.JComboBox<String> sceltaContorni;
    private javax.swing.JComboBox<String> sceltaDesserts;
    private javax.swing.JComboBox<String> sceltaPanini;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}