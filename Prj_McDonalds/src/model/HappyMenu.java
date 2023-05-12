package model;

import controller.GestorePanini;

public abstract class HappyMenu extends Ordine{
    protected String bevanda, dessert;
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
    
    public String getBevanda() {
        return bevanda;
    }

    public void setBevanda(String bevanda) {
        this.bevanda = bevanda;
    }
 
    @Override
    public String toString () {
        return super.toString() + " ";
    }
}
