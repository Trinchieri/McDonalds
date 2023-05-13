package model;

import controller.Constants;
import static controller.Constants.DESSERTS;
import java.util.Map;

public class McMenu extends HappyMenu{
    
    private Patata patatine;
    
    public McMenu(boolean asporto) throws Exception {
        super(asporto);
    }
    
    public String getDessert() {
        return dessert;
    }
    
    public void setDessert(String dessert) {
        if(dessert == ""){
            this.dessert = "";
        }
        else{
            dessert = dessert.toUpperCase();
            
            for(Map.Entry i: DESSERTS.entrySet()){
               if(dessert.equals(i.getKey())){
                   this.dessert = ((String) i.getKey()).toLowerCase();
               }
            }
        }
    }
    
    public Patata getPatatine() {
        return patatine;
    }
    
    public void setPatatine(String patatine) throws Exception {
        this.patatine = new Patata(patatine);
    }
    
    public void setPatatine(String patatine, String salsa) throws Exception {
        this.patatine = new Patata (patatine, salsa);
    }
    
    @Override
    public String toString () {
        String x = super.toString() + "Menu [ " + this.panino.getNome() + ", " + this.patatine + ", " + this.bibita;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        return x + " ]";
    }

    @Override
    public double calcolaPrezzo() {
        double prezzo = panino.getPrezzo() + Constants.BIBITE.get(bibita.toUpperCase()) + Constants.PATATE.get(patatine.getTipo().toUpperCase());
        
        if (!dessert.equals("")) {
            prezzo += Constants.DESSERTS.get(dessert.toUpperCase());
        }
        
        if (patatine.getTipo().equals("classiche")) {
            prezzo += 0.30; //prezzo della salsa
        }
        
        return prezzo;
    } 
}