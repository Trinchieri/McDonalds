package controller;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final Map<String, String> PATATE = new HashMap<String,String>(){
        {
            put("CLASSICHE","Classiche");
            put("VERTIGO","Vertigo");
            put("CHEDDAR","Cheddar");
            put("CB","Cheddar e Bacon");
        }
    };
    
    public static final Map<String,String> SALSE = new HashMap<String,String>(){
        {
            put("BBQ","BBQ");
            put("MAIONESE","Mayo");
            put("KETCHUP","Ketchup");
            put("AGRODOLCE","Agrodolce");
            put("SENAPE","Senape");
        }  
    };
    
    public static final Map<String,Double> BEVANDE = new HashMap<String,Double>(){
        {
            put("CAPPUCCINO",2.0);
            put("CIOCCOLATA CALDA",1.5);
            put("CAFFE ESPRESSO",2.5);
        }
    };
    
    public static final Map<String,Double> PASTE = new HashMap<String,Double>(){
        {
            put("CROISSANT CON NUTELLA",1.5);
            put("MUFFIN CIOCCOLATO",2.0);
            put("CHEESECAKE ALLA FRAGOLA",3.0);
        }
    };

    public static final Map <Integer,String> SORPRESE = new HashMap<Integer,String>(){
        {
            put(0,"Maria Silvia Gatti");
            put(1,"Giulio Angiani");
            put(2,"Bertino");
            put(3,"Giorgio");
        }
    };
}
