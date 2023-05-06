package model;

import controller.GestorePanini;

public abstract class HappyMenu extends Ordine{
    protected String bevanda, dessert;
    protected Panino panino;

    public HappyMenu(boolean asporto, String nomePanino, String bevanda, String dessert) {
        super(asporto);
        panino = GestorePanini.getPanino(nomePanino);
        this.bevanda = bevanda;
        this.dessert = dessert;
    }

    public String getNomePanino() {
        if (panino != null) return panino.getNome();
        return "";
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getDessert() {
        return dessert;
    }
    
    @Override
    public String toString () {
        return super.toString() + " ";
    }
}
