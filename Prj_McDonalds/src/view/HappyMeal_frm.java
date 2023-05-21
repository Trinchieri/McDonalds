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
        
        //css
        this.getContentPane().setBackground(new java.awt.Color(245,242,230));
        aggiungiOrdine.setBackground(new java.awt.Color (39, 116, 45));
        aggiungiOrdine.setForeground(new java.awt.Color (255, 255, 255));
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
        setResizable(false);

        titolo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/happyMealLogo.png"))); // NOI18N

        aggiungiOrdine.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        aggiungiOrdine.setText("AGGIUNGI ALL'ORDINE");
        aggiungiOrdine.setPreferredSize(new java.awt.Dimension(233, 43));
        aggiungiOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiOrdineActionPerformed(evt);
            }
        });

        sceltaPanini.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        sceltaPanini.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mctoast", "hamburger", "chickenburger" }));
        sceltaPanini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaPaniniActionPerformed(evt);
            }
        });

        labelPanino.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelPanino.setText("PANINO:");

        labelContorno.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelContorno.setText("CONTORNO:");

        sceltaContorni.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        sceltaContorni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "patate regolari", "carotine baby" }));
        sceltaContorni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaContorniActionPerformed(evt);
            }
        });

        labelBibita.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelBibita.setText("BIBITA:");

        sceltaBibite.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        sceltaBibite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaBibiteActionPerformed(evt);
            }
        });

        labelDessert.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelDessert.setText("DESSERT:");

        sceltaDesserts.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPanino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBibita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelDessert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelContorno, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sceltaContorni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sceltaBibite, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sceltaDesserts, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(titolo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(aggiungiOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titolo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sceltaPanini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPanino))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContorno)
                    .addComponent(sceltaContorni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBibita)
                    .addComponent(sceltaBibite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sceltaDesserts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDessert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(aggiungiOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
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