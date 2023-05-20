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
    
    public McCafe_frm(Ordine_frm aThis) throws IOException, Exception {
        initComponents();
        
        aggiungiOrdine.setEnabled(false);
        
        sceltaBevande.setModel(new DefaultComboBoxModel<>(caricaBevande()));
        sceltaPaste.setModel(new DefaultComboBoxModel<>(caricaPaste()));
        
        aggiungiOrdine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    aThis.go.addOrdine(creaOrdine());
                } catch (Exception ex) {
                    Logger.getLogger(McCafe_frm.class.getName()).log(Level.SEVERE, null, ex);
                }
                aThis.setVisible(true);
                
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titolo = new javax.swing.JLabel();
        aggiungiOrdine = new javax.swing.JButton();
        labelBevanda = new javax.swing.JLabel();
        labelPasta = new javax.swing.JLabel();
        sceltaBevande = new javax.swing.JComboBox<>();
        sceltaPaste = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titolo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mccafeLogo.png"))); // NOI18N
        titolo.setMaximumSize(new java.awt.Dimension(3840, 2160));
        titolo.setMinimumSize(new java.awt.Dimension(3840, 2160));

        aggiungiOrdine.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        aggiungiOrdine.setText("AGGIUNGI ALL'ORDINE");
        aggiungiOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiOrdineActionPerformed(evt);
            }
        });

        labelBevanda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelBevanda.setText("BEVANDA:");

        labelPasta.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelPasta.setText("PASTA:");

        sceltaBevande.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sceltaBevande.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sceltaBevande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaBevandeActionPerformed(evt);
            }
        });

        sceltaPaste.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aggiungiOrdine)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelBevanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sceltaBevande, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sceltaPaste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(titolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBevanda)
                    .addComponent(sceltaBevande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasta)
                    .addComponent(sceltaPaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(aggiungiOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiOrdineActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aggiungiOrdineActionPerformed
    
    private McCafe creaOrdine() throws Exception{        
        McCafe x = new McCafe();
        
        x.setBevanda(valueBevanda);
        x.setPasta(valuePasta);
        return x;
    }
    
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
    private javax.swing.JLabel labelBevanda;
    private javax.swing.JLabel labelPasta;
    private javax.swing.JComboBox<String> sceltaBevande;
    private javax.swing.JComboBox<String> sceltaPaste;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
