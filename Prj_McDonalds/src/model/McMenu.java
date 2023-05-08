package model;

public class McMenu extends HappyMenu{
    
    private Patata patatine;
    
    public McMenu(boolean asporto, String panino, String bevanda, String dessert, String patatine, String salsa) throws Exception {
        super(asporto, panino, bevanda, dessert);
        
        if (!"classiche".equals(patatine)) {
            this.patatine = new Patata(patatine);
        }
        else {
            this.patatine = new Patata (patatine, salsa);
        }
    }
    
    @Override
    public String toString () {
        String x = super.toString() + "Menu [ ";
        
        if (!this.getNomePanino().equals("")) x += this.panino.getNome();
        
        if (!this.patatine.equals(null)) x += ", " + this.patatine;
        
        if (!this.bevanda.equals("")) x += ", " + this.bevanda;
        
        if (!this.dessert.equals("")) x += ", " + this.dessert;
        
        return x + " ]";
    }

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}