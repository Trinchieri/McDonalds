package model;

public abstract class Ordine {
    private static final int numeroOrdine = 0;
    private Orario ora;
    private boolean asporto;
    private Salsa sauce;
    
    public abstract double Prezzo();
    
}
