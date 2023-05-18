package view;

import controller.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import model.McCafe;

public class McCafe_frm extends javax.swing.JFrame {
        
    String valueBevanda = "", valuePasta = "";
    boolean isAsporto;
    
    public McCafe_frm(Ordine_frm aThis) {
        initComponents();
        
        aggiungiOrdine.setEnabled(false);
        
        sceltaBevande.setModel(new DefaultComboBoxModel<>(caricaBevande()));
        sceltaPaste.setModel(new DefaultComboBoxModel<>(caricaPaste()));
        
        aggiungiOrdine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    aThis.go.addOrdine(creaOrdine());
                    aThis.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(McCafe_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titolo = new javax.swing.JLabel();
        aggiungiOrdine = new javax.swing.JButton();
        asporto = new javax.swing.JCheckBox();
        labelBevanda = new javax.swing.JLabel();
        labelPasta = new javax.swing.JLabel();
        sceltaBevande = new javax.swing.JComboBox<>();
        sceltaPaste = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titolo.setText("CAFE");

        aggiungiOrdine.setText("AGGIUNGI ALL'ORDINE");
        aggiungiOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiOrdineActionPerformed(evt);
            }
        });

        asporto.setText("Asporto");
        asporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asportoActionPerformed(evt);
            }
        });

        labelBevanda.setText("BEVANDA:");

        labelPasta.setText("PASTA:");

        sceltaBevande.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaBevande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaBevandeActionPerformed(evt);
            }
        });

        sceltaPaste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaPasteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asporto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelPasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelBevanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sceltaBevande, 0, 112, Short.MAX_VALUE)
                                    .addComponent(sceltaPaste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(aggiungiOrdine))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(titolo)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(titolo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBevanda)
                    .addComponent(sceltaBevande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasta)
                    .addComponent(sceltaPaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(asporto)
                .addGap(26, 26, 26)
                .addComponent(aggiungiOrdine)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiOrdineActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aggiungiOrdineActionPerformed
    
    private McCafe creaOrdine(){        
        McCafe x = new McCafe(isAsporto);
        
        x.setBevanda(valueBevanda);
        x.setPasta(valuePasta);
        return x;
    }
    
    private void asportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asportoActionPerformed
        if (asporto.isSelected()) {
            this.isAsporto = true;
        }
    }//GEN-LAST:event_asportoActionPerformed

    private void sceltaBevandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaBevandeActionPerformed
        //get selected value from the combobox
        if (sceltaBevande.getSelectedItem().toString().equals("-")) valueBevanda = "";
        else valueBevanda = sceltaBevande.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaBevandeActionPerformed

    private void sceltaPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaPasteActionPerformed
        //get selected value from the combobox
        if (sceltaPaste.getSelectedItem().toString().equals("-")) valuePasta = "";
        else valuePasta = sceltaPaste.getSelectedItem().toString();
        
        controlloAggiungiOrdine();
    }//GEN-LAST:event_sceltaPasteActionPerformed
    
    private String[] caricaBevande () {
        String [] bevande = new String [Constants.BEVANDE.size()+1];
        int c = 0;
        
        bevande[0] = "-";
        
        for (Map.Entry i: Constants.BEVANDE.entrySet()) {
            c++;
            bevande[c] = ((String) i.getKey()).toLowerCase();  
        } 
        
        return bevande;
    }
    
    private String[] caricaPaste () {
        String [] paste = new String [Constants.PASTE.size()+1];
        int c = 0;
        
        paste[0] = "-";
        
        for (Map.Entry i: Constants.PASTE.entrySet()) {
            c++;
            paste[c] = ((String) i.getKey()).toLowerCase();  
        } 
        
        return paste;
    }
    
    private void controlloAggiungiOrdine () {
        if (!valueBevanda.equals(null) && !valuePasta.equals(null)) {
            aggiungiOrdine.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiOrdine;
    private javax.swing.JCheckBox asporto;
    private javax.swing.JLabel labelBevanda;
    private javax.swing.JLabel labelPasta;
    private javax.swing.JComboBox<String> sceltaBevande;
    private javax.swing.JComboBox<String> sceltaPaste;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
