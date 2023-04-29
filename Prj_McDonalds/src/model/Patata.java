package model;

import java.util.ArrayList;

public class Patata {
    private boolean classiche,vertigo,cheddar,cheddarEBacon;

    public Patata(boolean classiche,boolean vertigo, boolean cheddar, boolean cheddarEBacon) {
        this.classiche = classiche;
        this.vertigo = vertigo;
        this.cheddar = cheddar;
        this.cheddarEBacon = cheddarEBacon;
    }

    public ArrayList<String> getSalse(){
        ArrayList<String> app = new ArrayList();
        
        if(this.classiche) app.add("Classiche");
        if(this.vertigo) app.add("Vertigo");
        if(this.cheddar) app.add("Cheddar");
        if(this.cheddarEBacon) app.add("Cheddar&Bacon");
        
        return app;
    }
}
