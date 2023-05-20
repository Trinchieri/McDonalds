package view;

import controller.GestoreOrdini;
import javax.swing.DefaultComboBoxModel;
import model.Ordine;

public class Scontrino_frm extends javax.swing.JFrame {

    public Scontrino_frm(Ordine_frm aThis, boolean isAsporto) {
        initComponents();
        
        stampaPrezzo.setText("€" + aThis.go.calcolaPrezzoTotale());
        stampaOrdini.setModel(new DefaultComboBoxModel<>(caricaOrdini(aThis.go)));
        
        
        if (isAsporto)    asporto.setText("ASPORTO: SI");
        else    asporto.setText("ASPORTO: NO");
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

        sottotitolo = new javax.swing.JLabel();
        labelOrdine = new javax.swing.JLabel();
        asporto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stampaPrezzo = new javax.swing.JLabel();
        labelTotale = new javax.swing.JLabel();
        fraseFinale = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stampaOrdini = new javax.swing.JList<>();
        numeroOrdine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sottotitolo.setText("I'm lovin' it");

        labelOrdine.setText("ORDINI:");

        asporto.setText("ASPORTO:");

        stampaPrezzo.setText("€");

        labelTotale.setText("Totale");

        fraseFinale.setText("Grazie della vostra visita, arrivederci!");

        stampaOrdini.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(stampaOrdini);

        numeroOrdine.setText("NUMERO ORDINE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sottotitolo)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(fraseFinale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asporto)
                            .addComponent(labelOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTotale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                                .addComponent(stampaPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)
                            .addComponent(numeroOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(sottotitolo)
                .addGap(39, 39, 39)
                .addComponent(asporto)
                .addGap(18, 18, 18)
                .addComponent(labelOrdine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stampaPrezzo)
                    .addComponent(labelTotale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(numeroOrdine)
                .addGap(29, 29, 29)
                .addComponent(fraseFinale)
                .addGap(50, 50, 50))
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
    private javax.swing.JLabel fraseFinale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelOrdine;
    private javax.swing.JLabel labelTotale;
    private javax.swing.JLabel numeroOrdine;
    private javax.swing.JLabel sottotitolo;
    private javax.swing.JList<String> stampaOrdini;
    private javax.swing.JLabel stampaPrezzo;
    // End of variables declaration//GEN-END:variables
}
