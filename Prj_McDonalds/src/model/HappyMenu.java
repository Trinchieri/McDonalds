package model;

import controller.GestorePanini;

public abstract class HappyMenu extends Ordine{
    protected String bevanda, dessert;
    protected Panino panino;

    public HappyMenu(String nomePanino, String bevanda, String dessert) {
        panino = GestorePanini.getPanino(nomePanino);
        this.bevanda = bevanda;
        this.dessert = dessert;
    }

    public String getNomePanino() {
        return panino.getNome();
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getDessert() {
        return dessert;
    }
}
