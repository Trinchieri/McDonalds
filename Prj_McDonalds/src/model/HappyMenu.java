package model;

public abstract class HappyMenu extends Ordine{
    protected String panino, bevanda, dessert;

    public HappyMenu(String panino, String bevanda, String dessert) {
        this.panino = panino;
        this.bevanda = bevanda;
        this.dessert = dessert;
    }

    public String getPanino() {
        return panino;
    }

    public String getBevanda() {
        return bevanda;
    }

    public String getDessert() {
        return dessert;
    }
}
