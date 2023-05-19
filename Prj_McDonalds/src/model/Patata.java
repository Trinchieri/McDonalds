package model;

import static controller.Constants.PATATE;
import java.util.Map;

public class Patata {
    private String tipo;
    private Salsa salsa;
    
    public Patata (String t) throws Exception {
        this.salsa = null;
        t=t.toUpperCase();
        
        for(Map.Entry i: PATATE.entrySet()){
            if(t.equals(i.getKey())){
                this.tipo = ((String) i.getKey()).toLowerCase();
            }
        }
    }
    
    public Patata (String t, String salsa)throws Exception {
        this.salsa = null;
        t=t.toUpperCase();
       
        for(Map.Entry i: PATATE.entrySet()){
            if(t.equals(i.getKey())){
                this.tipo = ((String) i.getKey()).toLowerCase();
                if(i.getKey().equals("CLASSICHE")){
                    this.salsa = new Salsa(salsa);    
                }
            }
        }
    }

    public String getTipo() {
        return tipo;
    }
    
    public Salsa getSalsa(){
        return this.salsa;
    }
    
    @Override
    public String toString(){
        String x = "Patatine [ "+this.tipo;
        
        if(this.salsa != null && !this.salsa.toString().equals("")){
            x += ", "+this.salsa;
        }
        
        return x + " ]";
    }
}
