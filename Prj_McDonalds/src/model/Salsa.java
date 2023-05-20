package model;
import static controller.Constants.SALSE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Salsa {
    private Map<String, Boolean> tipiSalse = new HashMap<String,Boolean>(){
        {
            put("BBQ",false);
            put("Mayo",false);
            put("Ketchup",false);
            put("Agrodolce",false);
            put("Senape",false);
        }
    };
    
    public Salsa (String salsa) throws Exception {
        if (!salsa.equals("")) {
            boolean modified = false;
            salsa=salsa.toUpperCase();
            
            for(Map.Entry i: SALSE.entrySet()){
                if(i.getKey().equals(salsa)){
                    this.tipiSalse.replace((String) i.getValue(), true);
                    modified = true;
                }
            }
            
             if (!modified) throw new Exception ("Salsa non valida");
        }  
    }
    
    public ArrayList<String> getSalse(){
        ArrayList<String> x = new ArrayList<>();
        
        for(Map.Entry i : this.tipiSalse.entrySet()){
            if(i.getValue().equals(true)) x.add((String) i.getKey());
        }
        
        return x;
    }
    
    @Override
    public String toString(){
        String x = "";
        
        for(Map.Entry i : this.tipiSalse.entrySet()){
            if(i.getValue().equals(true)) x += i.getKey() + ", ";
        }
        
        return x;
    }
}