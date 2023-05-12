package model;

import controller.Constants;

public class McMenu extends HappyMenu{
    
    private Patata patatine;
    
    public McMenu(boolean asporto) throws Exception {
        super(asporto);
    }
    
    public String getDessert() {
        return dessert;
    }
    
    public void setDessert(String dessert) {
        this.dessert = dessert;
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
        String x = super.toString() + "Menu [ " + this.panino.getNome() + ", " + this.patatine;
        
        if (!this.bevanda.equals("")) x += ", " + this.bevanda;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        return x + " ]";
    }

    @Override
    public double calcolaPrezzo() {
        
        /*if (!panino.equals(null)) {
            
            String cercaPanino = panino.getNome().toUpperCase();
            
            prezzo += Constants.PANINI.get(cercaPanino);
        }
        
        if (!bevanda.equals("")) {
            
            String cercaBevanda = bevanda.toUpperCase();
            
            prezzo += Constants.BEVANDE.get(cercaBevanda);
        }
        
        if (!dessert.equals("")) {
            
            String cercaDessert = dessert.toUpperCase();
            
            prezzo += Constants.DESSERT.get(cercaDessert);
        }
        
        if (!patatine.equals(null)) {
            
            String cercaPatatine = patatine.getTipo().toUpperCase();
            
            prezzo += Constants.PATATINE.get(cercaPatatine);
        }*/
        
        return 0;
    } 
}