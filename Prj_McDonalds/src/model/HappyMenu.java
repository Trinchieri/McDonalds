package model;

import static controller.Constants.BIBITE;
import java.util.Map;

public abstract class HappyMenu extends Ordine{
    protected String bibita, dessert;
    protected Panino panino;

    public HappyMenu() {
    }

    public Panino getPanino() {
        return panino;
    }
    
    public String getBibita() {
        return bibita;
    }

    public void setBibita(String bibita) throws Exception {
        boolean modified = false;
        bibita = bibita.toUpperCase();
        
        for(Map.Entry i: BIBITE.entrySet()){
            if(bibita.equals(i.getKey())){
                this.bibita = ((String) i.getKey()).toLowerCase();
                modified = true;
            }
        }
        
        if (!modified) throw new Exception ("Bibita non valida");
    }
 
    @Override
    public String toString () {
        return super.toString() + " ";
    }
}
