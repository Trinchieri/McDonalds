package model;

public class McCafe extends Ordine{
    private String bevanda, pasta;

    public McCafe(boolean asporto, String bevanda, String pasta) {
        super(asporto);
        this.bevanda = bevanda;
        this.pasta = pasta;
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getPasta() {
        return pasta;
    }
    
    @Override
    public String toString () {
        
        String x = super.toString() + " McCafe [ ";
        
        if (!bevanda.equals("")) x += this.bevanda;
        
        if (!pasta.equals("")) x += ", " + this.pasta;
        
        return x + " ]";
    }

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
