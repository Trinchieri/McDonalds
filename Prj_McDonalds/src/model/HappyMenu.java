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

    public String getBevanda() {
        return bevanda;
    }

    public String getDessert() {
        return dessert;
    }

    public void setBevanda(String bevanda) {
        this.bevanda = bevanda;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setPanino(String nomePanino) {
        this.panino = GestorePanini.getPanino(nomePanino);
    }
     
    @Override
    public String toString () {
        return super.toString() + " ";
    }
}
