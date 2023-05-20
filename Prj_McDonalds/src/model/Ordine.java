package model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Ordine {
    protected String dataOra;

    public Ordine() {
        dataOra = ZonedDateTime.now(ZoneId.of("Europe/Paris")).format(DateTimeFormatter.ofPattern("MM.dd.yyyy, hh.mm.ss", Locale.ITALY));
    }
    
    public abstract double calcolaPrezzo();

    public String getDataOra() {
        return dataOra;
    }
    
    @Override
    public String toString () {
        return dataOra;
    }
    
    public abstract String stampaGUI();
}
