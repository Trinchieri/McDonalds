package model;
import static controller.Constants.SALSE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Salsa {
    private final Map<String, Boolean> tipiSalse = new HashMap<String,Boolean>(){
        {
            put("BBQ",false);
            put("Mayo",false);
            put("Ketchup",false);
            put("Agrodolce",false);
            put("Senape",false);
        }
    };
    
    public Salsa (String salsa) throws Exception {
        salsa=salsa.toUpperCase();
        for(Map.Entry i: SALSE.entrySet()){
            if(i.getKey().equals(salsa)){
                this.tipiSalse.replace((String) i.getValue(), true);
            }
        }
    }

    /*public Salsa(boolean bbq, boolean mayo, boolean ketchup, boolean agrodolce, boolean senape) {        
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
    }*/
}