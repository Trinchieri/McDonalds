package view;

import controller.GestoreOrdini;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.Ordine;

public class CheckOrdine extends javax.swing.JFrame {
    private boolean isAsporto = false;
    
    public CheckOrdine(Ordine_frm aThis) {
        initComponents();
        
        if (aThis.go.getOrdini().isEmpty()) continua.setEnabled(false);
        else    continua.setEnabled(true);
        
        this.getContentPane().setBackground(new java.awt.Color(245, 242, 230));
        
        indietro.setBackground(new java.awt.Color(255,240,93));
        continua.setBackground(new java.awt.Color(255,240,93));
        
        listaOrdini.setModel(new DefaultComboBoxModel<>(caricaOrdini(aThis.go)));
        
        
        indietro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                aThis.setVisible(true);
            }
        });
        
        continua.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Scontrino_frm scontrino;
                try {
                    scontrino = new Scontrino_frm(aThis, isAsporto);
                    scontrino.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CheckOrdine.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
        
        prezzo.setText("€ " + aThis.go.calcolaPrezzoTotale());
    }

    private String[] caricaOrdini (GestoreOrdini g) {
        String [] ordini = new String [g.getOrdini().size()];
        int i=0;
        
        for(Ordine x:g.getOrdini()){
            ordini[i] =x.stampaGUI();
            i++;
        }
        
        return ordini;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        titolo = new javax.swing.JLabel();
        continua = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        stampaOrdine = new javax.swing.JScrollPane();
        listaOrdini = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        labelPrezzo = new javax.swing.JLabel();
        prezzo = new javax.swing.JLabel();
        asporto = new javax.swing.JCheckBox();

        jScrollPane2.setViewportView(jTextPane1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        titolo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        titolo.setForeground(new java.awt.Color(219, 16, 32));
        titolo.setText("Check Ordine");

        continua.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        continua.setText("CONTINUA");
        continua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuaActionPerformed(evt);
            }
        });

        indietro.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        indietro.setText("TORNA INDIETRO");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        listaOrdini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 116, 45), 4));
        listaOrdini.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        listaOrdini.setForeground(new java.awt.Color(51, 51, 51));
        listaOrdini.setAutoscrolls(false);
        stampaOrdine.setViewportView(listaOrdini);

        labelPrezzo.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelPrezzo.setText("PREZZO");

        prezzo.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        prezzo.setText("€ 0.00");

        asporto.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(indietro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continua, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titolo)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stampaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asporto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPrezzo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prezzo)
                                .addGap(68, 68, 68))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stampaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrezzo)
                    .addComponent(prezzo))
                .addGap(18, 18, 18)
                .addComponent(asporto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_indietroActionPerformed

    private void continuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_continuaActionPerformed

    private void asportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asportoActionPerformed
        if (asporto.isSelected()) {
            this.isAsporto = true;
        }
    }//GEN-LAST:event_asportoActionPerformed
    
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
            java.util.logging.Logger.getLogger(CheckOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckOrdine(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asporto;
    private javax.swing.JButton continua;
    private javax.swing.JButton indietro;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelPrezzo;
    private javax.swing.JList<String> listaOrdini;
    private javax.swing.JLabel prezzo;
    private javax.swing.JScrollPane stampaOrdine;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
