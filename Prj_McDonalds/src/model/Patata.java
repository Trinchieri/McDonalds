package model;

import java.util.ArrayList;
import static controller.Constants.PATATE;
import java.util.Map;

public class Patata {
    private String tipo;
    private Salsa salsa = null;
    
    public Patata (String t) throws Exception {
        t=t.toUpperCase();
        
        for(Map.Entry i: PATATE.entrySet()){
            if(t.equals(i.getKey())){
                this.tipo = (String) i.getValue();
            }
        }
    }
    
    public Patata (String t, String salsa)throws Exception {
        t=t.toUpperCase();
       
        for(Map.Entry i: PATATE.entrySet()){
            if(t.equals(i.getKey())){
                this.tipo = (String) i.getValue();
                if(i.getKey().equals("CLASSICHE")){
                    this.salsa = new Salsa(salsa);    
                }
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

   /* public ArrayList<String> getSalsa() {
        return salsa.getSalse();
    }*/
    
    @Override
    public String toString(){
        String x = "Patatine [ "+this.tipo;
        if(this.salsa.equals(null)){
            x += ", "+this.salsa;
        }
        
        return x + " ]";
    }
}
