package model;

import controller.Constants;

public class McCafe extends Ordine{
    private String bevanda, pasta;

    public McCafe(boolean asporto) {
        super(asporto);
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getPasta() {
        return pasta;
    }

    public void setBevanda(String bevanda) {
        this.bevanda = bevanda;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }
    
    @Override
    public String toString () {
        
        String x = super.toString() + " McCafe [ ";
        
        if (!bevanda.equals("")) x += this.bevanda;
        
        if (!pasta.equals("")) x += ", " + this.pasta;
        
        return x + " ]";
    }
    
    @Override
    public double calcolaPrezzo () {
        double prezzo = 0;
        
        if (!bevanda.equals("")) {
            
            String cercaBevanda = bevanda.toUpperCase();
            
            prezzo += Constants.BEVANDE.get(cercaBevanda);
        }
        
        if (!pasta.equals("")) {
            
            String cercaPasta = pasta.toUpperCase();
            
            prezzo += Constants.PASTE.get(cercaPasta);
        }
        
        return prezzo;
    }
}
