package model;

import java.util.ArrayList;

public class Patata {
    private String tipo;// classiche,vertigo,cheddar,cheddarEBacon;
    private Salsa salsa = null;
    
    public Patata (String tipo) throws Exception {
        tipo=tipo.toLowerCase();
        switch(tipo){
            case "classiche":{
                this.tipo="Classiche";
                break;
            }
            case "vertigo":{
                this.tipo="Vertigo";
                break;
            }
            case "cheddar":{
                this.tipo="Cheddar";
                break;
            }
            case "cheddarEBacon":{
                this.tipo="Cheddar e Bacon";
                break;
            }
            default:{
                throw new Exception("Inserire delle patatine esistenti");
            }
        }
    }
    
    public Patata (String tipo, String salsa)throws Exception {
        tipo=tipo.toLowerCase();
        switch(tipo){
            case "classiche":{
                this.tipo="Classiche";
                this.salsa = new Salsa(salsa);
                break;
            }
            case "vertigo":{
                this.tipo="Vertigo";
                break;
            }
            case "cheddar":{
                this.tipo="Cheddar";
                break;
            }
            case "cheddarEBacon":{
                this.tipo="Cheddar e Bacon";
                break;
            }
            default:{
                throw new Exception("Inserire delle patatine esistenti");
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<String> getSalsa() {
        return salsa.getSalse();
    }
}
