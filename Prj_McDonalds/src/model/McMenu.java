package model;

public class McMenu extends HappyMenu{
    
    private String patatine;
    
    public McMenu(String panino, String bevanda, String dessert, String patatine) {
        super(panino, bevanda, dessert);
        
        this.patatine = patatine;
    }
    
    @Override
    public String toString () {
        String x = "Menu [ ";
        
        if (!this.panino.equals("")) x += this.panino;
            
        if (!this.patatine.equals("")) x += ", " + this.patatine;
        
        if (!this.bevanda.equals("")) x += ", " + this.bevanda;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        return x + " ]";
    }

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}