package model;

public class HappyMeal extends HappyMenu{
    
    private String sorpresa;
    
    public HappyMeal(String panino, String bevanda, String dessert, String sorpresa) {
        super(panino, bevanda, dessert);
        
        this.sorpresa = sorpresa;
    }

    public String getSorpresa() {
        return sorpresa;
    }
    
    @Override
    public String toString () {
        String x = "HappyMeal [ ";
        
        if (!this.panino.equals("")) x += this.panino;
        
        if (!this.bevanda.equals("")) x += ", " + this.bevanda;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        if (!this.sorpresa.equals("")) x += ", " + this.sorpresa;
        
        return x + " ]";
    }

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
