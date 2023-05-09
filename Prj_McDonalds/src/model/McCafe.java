package model;

import controller.Constants;

public class McCafe extends Ordine{
    private String bevanda, pasta;

    public McCafe(boolean asporto, String bevanda, String pasta) {
        super(asporto);
        this.bevanda = bevanda;
        this.pasta = pasta;
        
        calcolaPrezzo();
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getPasta() {
        return pasta;
    }
    
    @Override
    public String toString () {
        
        String x = super.toString() + " McCafe [ ";
        
        if (!bevanda.equals("")) x += this.bevanda;
        
        if (!pasta.equals("")) x += ", " + this.pasta;
        
        return x + " ]";
    }

    private void calcolaPrezzo () {
        
        if (!bevanda.equals("")) {
            
            String cercaBevanda = bevanda.toUpperCase();
            
            prezzo += Constants.BEVANDE.get(cercaBevanda);
        }
        
        if (!pasta.equals("")) {
            
            String cercaPasta = pasta.toUpperCase();
            
            prezzo += Constants.PASTE.get(cercaPasta);
        }
    }
}
