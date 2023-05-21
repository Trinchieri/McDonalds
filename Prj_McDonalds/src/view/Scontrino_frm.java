package view;

import controller.GestoreOrdini;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import model.Ordine;

public class Scontrino_frm extends javax.swing.JFrame {

    public Scontrino_frm(Ordine_frm aThis, boolean isAsporto) throws IOException {
        initComponents();
        
        stampaPrezzo.setText("€" + aThis.go.calcolaPrezzoTotale());
        stampaOrdini.setModel(new DefaultComboBoxModel<>(caricaOrdini(aThis.go)));
        numeroOrdine.setText("NUMERO ORDINE: " + aThis.go.getNumeroOrdine());
        dataOra.setText(aThis.go.getDataOra());
        
        if (isAsporto)    asporto.setText("ASPORTO: SI");
        else    asporto.setText("ASPORTO: NO");
        
        this.getContentPane().setBackground(new java.awt.Color(245, 242, 230));
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

        titolo = new javax.swing.JLabel();
        labelOrdine = new javax.swing.JLabel();
        asporto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stampaPrezzo = new javax.swing.JLabel();
        labelTotale = new javax.swing.JLabel();
        fraseFinale = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stampaOrdini = new javax.swing.JList<>();
        numeroOrdine = new javax.swing.JLabel();
        dataOra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 238, 238));
        setResizable(false);

        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logoScontrino.png"))); // NOI18N

        labelOrdine.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelOrdine.setText("ORDINI:");

        asporto.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        asporto.setText("ASPORTO:");

        stampaPrezzo.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        stampaPrezzo.setText("€");

        labelTotale.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        labelTotale.setText("Totale");

        fraseFinale.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        fraseFinale.setText("Grazie della vostra visita, arrivederci!");

        stampaOrdini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        stampaOrdini.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        stampaOrdini.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(stampaOrdini);

        numeroOrdine.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        numeroOrdine.setText("NUMERO ORDINE:");

        dataOra.setFont(new java.awt.Font("Arial Nova", 0, 16)); // NOI18N
        dataOra.setText("Data e ora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(asporto)
                                    .addComponent(labelOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTotale)
                                    .addComponent(numeroOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataOra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                                .addComponent(stampaPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(fraseFinale)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titolo)
                .addGap(38, 38, 38)
                .addComponent(asporto)
                .addGap(30, 30, 30)
                .addComponent(labelOrdine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotale)
                    .addComponent(stampaPrezzo))
                .addGap(44, 44, 44)
                .addComponent(numeroOrdine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataOra)
                .addGap(38, 38, 38)
                .addComponent(fraseFinale)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scontrino_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scontrino_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scontrino_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scontrino_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asporto;
    private javax.swing.JLabel dataOra;
    private javax.swing.JLabel fraseFinale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelOrdine;
    private javax.swing.JLabel labelTotale;
    private javax.swing.JLabel numeroOrdine;
    private javax.swing.JList<String> stampaOrdini;
    private javax.swing.JLabel stampaPrezzo;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
