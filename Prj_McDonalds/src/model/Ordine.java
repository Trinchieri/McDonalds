package model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Ordine {
    private static int numeroOrdine = 0;
    protected String dataOra;
    protected boolean asporto;

    public Ordine(boolean asporto) {
        this.asporto = asporto;
        Ordine.numeroOrdine++;
        
        dataOra = ZonedDateTime.now(ZoneId.of("Europe/Paris")).format(DateTimeFormatter.ofPattern("MM.dd.yyyy, hh.mm.ss", Locale.ITALY));
    }
    
    public abstract double calcolaPrezzo();
    
    public static int getNumeroOrdine() {
        return numeroOrdine;
    }

    public String getDataOra() {
        return dataOra;
    }

    public boolean isAsporto() {
        return asporto;
    }
    
    @Override
    public String toString () {
        return dataOra;
    }
}
