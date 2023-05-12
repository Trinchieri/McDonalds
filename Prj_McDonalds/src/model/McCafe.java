package model;

import controller.Constants;
import static controller.Constants.BEVANDE;
import static controller.Constants.PASTE;
import java.util.Map;

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
        bevanda = bevanda.toUpperCase();
        
        if(bevanda == ""){
            this.bevanda = bevanda;
        }
        else{
            for(Map.Entry i: BEVANDE.entrySet()){
                if(bevanda.equals(i.getKey())){
                    this.bevanda = (String) i.getKey();
                    this.bevanda = this.bevanda.toLowerCase();
                }
            }
        }
    }

    public void setPasta(String pasta) {
        pasta = pasta.toUpperCase();
        
        if(pasta == ""){
            this.pasta = pasta;
        }
        else {
            for(Map.Entry i: PASTE.entrySet()){
                if(pasta.equals(i.getKey())){
                    this.pasta = ((String) i.getKey()).toLowerCase();
                }
            }
        }        
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
