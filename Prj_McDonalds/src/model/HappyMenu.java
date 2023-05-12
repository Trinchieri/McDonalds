package model;

import static controller.Constants.BIBITE;
import controller.GestorePanini;
import java.util.Map;

public abstract class HappyMenu extends Ordine{
    protected String bibita, dessert;
    protected Panino panino;

    public HappyMenu(boolean asporto) {
        super(asporto);
    }

    public Panino getPanino() {
        return panino;
    }
    
    public void setPanino(String nomePanino) {
        this.panino = GestorePanini.getPanino(nomePanino);
    }
    
    public String getBibita() {
        return bibita;
    }

    public void setBibita(String bibita) {
        bibita = bibita.toUpperCase();
        
        for(Map.Entry i: BIBITE.entrySet()){
            if(bibita.equals(i.getKey())){
                this.bibita = ((String) i.getKey()).toLowerCase();
            }
        }
    }
 
    @Override
    public String toString () {
        return super.toString() + " ";
    }
}
