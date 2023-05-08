package model;

public abstract class Panino {
    private String nome, burger, salsa, pane;
    private int formaggio, insalata, cipolla, cetriolo, bacon;
    
    public Panino(String nome, String burger, int formaggio, String salsa, int insalata, int cipolla, int cetriolo, int bacon, String pane) {
        this.nome = nome;
        this.burger = burger;
        this.formaggio = formaggio;
        this.salsa = salsa;
        this.insalata = insalata;
        this.cipolla = cipolla;
        this.cetriolo = cetriolo;
        this.bacon = bacon;
        this.pane = pane;
    }
    
    public String getNome () {
       return this.nome;
    }
    
    @Override
    public String toString () {
        String x = this.nome + " [ ";
        
        if (!this.pane.equals("")) x += this.pane;
        
        if (!this.burger.equals("")) x += ", " + this.burger;
        
        if (this.formaggio != 0) x += ", formaggio: " + this.formaggio;
        
        if (!this.salsa.equals("")) x += ", " + this.salsa;
        
        if (this.insalata != 0) x += ", insalata: " + this.insalata;
        
        if (this.cipolla != 0) x += ", cipolla: " + this.cipolla;
        
        if (this.cetriolo != 0) x += ", cetriolo: " + this.cetriolo;
        
        if (this.bacon != 0) x += ", bacon: " + this.bacon;
        
        return x + " ]";
    }
    /*private int formaggio;
    private Salsa salsa;
    private boolean insalata;
    private boolean pomodori;
    private boolean cipolla;
    private int bacon;

    public Panino(String nome, String pane, String burger, int formaggio, Salsa salsa, boolean insalata, boolean pomodori, boolean cipolla, int bacon) throws Exception {
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
    }*/      

    
}
