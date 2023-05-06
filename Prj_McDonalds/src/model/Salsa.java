package model;
import java.util.ArrayList;

public class Salsa {
    private boolean bbq = false, mayo = false, ketchup = false, agrodolce = false, senape = false;
    
    public Salsa (String salsa) throws Exception {
        switch (salsa) {
            case "bbq": {
                this.bbq = true;
                break;
            }
            
            case "mayo": {
                this.mayo = true;
                break;
            }
            
            case "ketchup": {
                this.ketchup = true;
                break;
            }
            
            case "agrodolce": {
                this.agrodolce = true;
                break;
            }
            
            case "senape": {
                this.senape = true;
                break;
            }
            
            default: {
                throw new Exception ("Devi inserire una delle salse presenti");
            }
        }
    }

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