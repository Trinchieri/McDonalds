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
       
}
