package model;

public abstract class Ordine {
    private static final int numeroOrdine = 0;
    private Orario ora;
    private boolean asporto;
    
    public abstract double Prezzo();

    public static int getNumeroOrdine() {
        return numeroOrdine;
    }

    public Orario getOra() {
        return ora;
    }

    public boolean isAsporto() {
        return asporto;
    }
}
