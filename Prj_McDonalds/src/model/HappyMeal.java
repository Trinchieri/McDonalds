package model;

public class HappyMeal extends HappyMenu{
    
    private String sorpresa;
    
    public HappyMeal(boolean asporto, String panino, String bevanda, String dessert, String sorpresa) {
        super(asporto, panino, bevanda, dessert);
        
        this.sorpresa = sorpresa;
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

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
