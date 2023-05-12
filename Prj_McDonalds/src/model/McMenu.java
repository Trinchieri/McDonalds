package model;

import controller.Constants;

public class McMenu extends HappyMenu{
    
    private Patata patatine;
    
    public McMenu(boolean asporto, String panino, String bevanda, String dessert, String patatine, String salsa) throws Exception {
        super(asporto);
        
        if (!"classiche".equals(patatine)) {
            this.patatine = new Patata(patatine);
        }
        else {
            this.patatine = new Patata (patatine, salsa);
        }
    }
    
    @Override
    public String toString () {
        String x = super.toString() + "Menu [ " + this.panino.getNome();
        
        if (!this.patatine.equals(null)) x += ", " + this.patatine;
        
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