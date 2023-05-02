package model;
import java.util.ArrayList;

public class Salsa {
    private boolean bbq,mayo,ketchup,agrodolce,senape;

    public Salsa(boolean bbq, boolean mayo, boolean ketchup, boolean agrodolce, boolean senape) {        
        this.bbq = bbq;
        this.mayo = mayo;
        this.ketchup = ketchup;
        this.agrodolce = agrodolce;
        this.senape = senape;
    }
    
    
    public ArrayList<String> getSalse(){
        ArrayList<String> app = new ArrayList();
        
        if(this.bbq) app.add("BBQ");
        if(this.mayo) app.add("Maionese");
        if(this.ketchup) app.add("Ketchup");
        if(this.agrodolce) app.add("Agrodolce");
        if(this.senape) app.add("Senape");
        
        return app;
    }
}