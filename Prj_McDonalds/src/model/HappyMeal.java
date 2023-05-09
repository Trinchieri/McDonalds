package model;

import controller.Constants;

public class HappyMeal extends HappyMenu{
    
    private String sorpresa;
    
    public HappyMeal(boolean asporto, String panino, String bevanda, String dessert, String sorpresa) {
        super(asporto, panino, bevanda, dessert);
        
        this.sorpresa = sorpresa;
        
        prezzo = 5.90;
    }

    public String getSorpresa() {
        return sorpresa;
    }
    
    @Override
    public String toString () {
        String x = super.toString() + "HappyMeal [ ";
        
        if (!this.getNomePanino().equals("")) x += this.panino.getNome();
        
        if (!this.bevanda.equals("")) x += ", " + this.bevanda;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        if (!this.sorpresa.equals("")) x += ", " + this.sorpresa;
        
        return x + " ]";
    }  
}
