package view;

import controller.Constants;
import controller.GestorePanini;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import model.McMenu;
import model.Panino;

public class Menu_frm extends javax.swing.JFrame {
    String valuePanino = "", valuePatate = "", valueSalsa = "", valueBibita = "", valueDessert = "";
    GestorePanini gp = new GestorePanini();
    
    public Menu_frm(Ordine_frm aThis) throws IOException {
        initComponents();
        
        aggiungiOrdine.setEnabled(false);
        sceltaSalse.setEnabled(false);
        
        aggiungiOrdine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    aThis.go.addOrdine(creaOrdine());
                    aThis.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Menu_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        sceltaPanini.setModel(new DefaultComboBoxModel<>(caricaPanini()));
        sceltaPatate.setModel(new DefaultComboBoxModel<>(caricaPatate()));
        sceltaSalse.setModel(new DefaultComboBoxModel<>(caricaSalse()));
        sceltaBibite.setModel(new DefaultComboBoxModel<>(caricaBibite()));
        sceltaDesserts.setModel(new DefaultComboBoxModel<>(caricaDessert()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titolo = new javax.swing.JLabel();
        labelPanino = new javax.swing.JLabel();
        aggiungiOrdine = new javax.swing.JButton();
        sceltaPanini = new javax.swing.JComboBox<>();
        labelPatate = new javax.swing.JLabel();
        labelSalsa = new javax.swing.JLabel();
        labelBibita = new javax.swing.JLabel();
        labelDessert = new javax.swing.JLabel();
        sceltaPatate = new javax.swing.JComboBox<>();
        sceltaSalse = new javax.swing.JComboBox<>();
        sceltaBibite = new javax.swing.JComboBox<>();
        sceltaDesserts = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titolo.setText("MENU");

        labelPanino.setText("PANINO:");

        aggiungiOrdine.setText("AGGIUNGI ALL'ORDINE");
        aggiungiOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiOrdineActionPerformed(evt);
            }
        });

        sceltaPanini.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaPanini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaPaniniActionPerformed(evt);
            }
        });

        labelPatate.setText("PATATE:");

        labelSalsa.setText("SALSA:");

        labelBibita.setText("BIBITA:");

        labelDessert.setText("DESSERT:");

        sceltaPatate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaPatate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaPatateActionPerformed(evt);
            }
        });

        sceltaSalse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaSalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaSalseActionPerformed(evt);
            }
        });

        sceltaBibite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaBibite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaBibiteActionPerformed(evt);
            }
        });

        sceltaDesserts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(titolo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelSalsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelBibita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPatate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPanino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDessert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sceltaDesserts, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sceltaBibite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sceltaPatate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sceltaSalse, 0, 120, Short.MAX_VALUE))))))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(aggiungiOrdine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titolo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPanino)
                    .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPatate)
                    .addComponent(sceltaPatate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalsa)
                    .addComponent(sceltaSalse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBibita)
                    .addComponent(sceltaBibite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDessert)
                    .addComponent(sceltaDesserts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(aggiungiOrdine)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sceltaPaniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaPaniniActionPerformed
        //get selected value from the combobox
        valuePanino = sceltaPanini.getSelectedItem().toString();
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaPaniniActionPerformed

    private void sceltaPatateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaPatateActionPerformed
        //get selected value from the combobox
        valuePatate = sceltaPatate.getSelectedItem().toString();
        if (valuePatate.equals("classiche")) sceltaSalse.setEnabled(true);
        else sceltaSalse.setEnabled(false);   
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaPatateActionPerformed

    private void sceltaSalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaSalseActionPerformed
        //get selected value from the combobox
        if (sceltaSalse.getSelectedItem().toString().equals("-")){
            valueSalsa = "";
        }
        else valueSalsa = sceltaSalse.getSelectedItem().toString();
    }//GEN-LAST:event_sceltaSalseActionPerformed

    private void sceltaBibiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaBibiteActionPerformed
        //get selected value from the combobox
        valueBibita = sceltaBibite.getSelectedItem().toString();
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaBibiteActionPerformed

    private void sceltaDessertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaDessertsActionPerformed
        //get selected value from the combobox
        if(!sceltaDesserts.getSelectedItem().toString().equals("-"))valueDessert = sceltaDesserts.getSelectedItem().toString();
        else valueDessert = "";
    }//GEN-LAST:event_sceltaDessertsActionPerformed

    private void aggiungiOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiOrdineActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aggiungiOrdineActionPerformed
    
    private String[] caricaPanini () throws FileNotFoundException, IOException {        
        String[] panini = new String[gp.getPanini().size()];
        int c = 0;
        
        for(Panino s: gp.getPanini()){
            panini[c] = s.getNome();
            c++;
        }
        
        return panini;
    }
    
    private String[] caricaSalse(){
        String [] salse = new String [Constants.SALSE.size()+1];
        int c = 0;
        
        salse[0] = "-";
        
        for (Map.Entry i: Constants.SALSE.entrySet()) {
            c++;
            salse[c] = ((String) i.getKey()).toLowerCase();  
        } 
        
        return salse;
    }
    
    private String[] caricaPatate () {
        String [] patate = new String [Constants.PATATE.size()];
        int c = 0;
        
        for (Map.Entry i: Constants.PATATE.entrySet()) {
            patate[c] = ((String) i.getKey()).toLowerCase();
            c++;
        } 
        
        return patate;
    }
    
    private String[] caricaBibite () {
        String [] bibite = new String [Constants.BIBITE.size()];
        int c = 0;
        
        for (Map.Entry i: Constants.BIBITE.entrySet()) {
            bibite[c] = ((String) i.getKey()).toLowerCase();
            c++;
        } 
        
        return bibite;
    }
    
    private String[] caricaDessert () {
        String [] desserts = new String [Constants.DESSERTS.size()+1];
        int c = 0;
        
        desserts[0] = "-";
        
        for (Map.Entry i: Constants.DESSERTS.entrySet()) {
            c++;
            desserts[c] = ((String) i.getKey()).toLowerCase();  
        } 
        
        return desserts;
    }
    
    private McMenu creaOrdine() throws Exception{
        McMenu x = new McMenu();
        x.setPanino(valuePanino);
        
        if(valuePatate.equals("classiche")) x.setPatatine(valuePatate,valueSalsa);
        else {
            x.setPatatine(valuePatate);
        }
        
        x.setBibita(valueBibita);
        x.setDessert(valueDessert);
        
        return x;
    }
    
    private void controlloAggiungiOrdine () {
        if (!valueBibita.equals("") && !valuePanino.equals("") && !valuePatate.equals("")) {
            aggiungiOrdine.setEnabled(true);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Menu_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu_frm(null).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiOrdine;
    private javax.swing.JLabel labelBibita;
    private javax.swing.JLabel labelDessert;
    private javax.swing.JLabel labelPanino;
    private javax.swing.JLabel labelPatate;
    private javax.swing.JLabel labelSalsa;
    private javax.swing.JComboBox<String> sceltaBibite;
    private javax.swing.JComboBox<String> sceltaDesserts;
    private javax.swing.JComboBox<String> sceltaPanini;
    private javax.swing.JComboBox<String> sceltaPatate;
    private javax.swing.JComboBox<String> sceltaSalse;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
