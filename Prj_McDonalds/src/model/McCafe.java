package model;

public class McCafe extends Ordine{
    private String bevanda, pasta;

    public McCafe(String bevanda, String pasta) {
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
        String x = "McCafe [ ";
        
        if (!bevanda.equals("")) x += this.bevanda;
        
        if (!pasta.equals("")) x += ", " + this.pasta;
        
        return x + " ]";
    }

    @Override
    public double Prezzo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
