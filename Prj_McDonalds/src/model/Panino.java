package model;

public abstract class Panino {
    private String burger;
    private boolean pane;
    private int formaggio;
    private Salsa salsa;
    private boolean insalata;
    private boolean pomodori;
    private boolean cipolla;
    private int bacon;

    public Panino(String burger, boolean pane, int formaggio, Salsa salsa, boolean insalata, boolean pomodori, boolean cipolla, int bacon) throws Exception {
        if(burger.isEmpty()) throw new Exception("Inserire un burger valido");
        if(formaggio<0 || formaggio>5) throw new Exception("Inserire una quantita' valida di formaggio");
        if(bacon<0 || bacon>5) throw new Exception("Inserire una quantita' valida di bacon");
        
        this.burger = burger;
        this.pane = pane;
        this.formaggio = formaggio;
        this.salsa = salsa;
        this.insalata = insalata;
        this.pomodori = pomodori;
        this.cipolla = cipolla;
        this.bacon = bacon;
    }
    
    public abstract Panino getPanino();

    public String getBurger() {
        return burger;
    }

    public boolean isPane() {
        return pane;
    }

    public int getFormaggio() {
        return formaggio;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public boolean isInsalata() {
        return insalata;
    }

    public boolean isPomodori() {
        return pomodori;
    }

    public boolean isCipolla() {
        return cipolla;
    }

    public int getBacon() {
        return bacon;
    }        
}
