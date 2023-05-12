package controller;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final Map<String, Double> PATATE = new HashMap<String,Double>(){
        {
            put("CLASSICHE",2.5);
            put("VERTIGO",3.0);
            put("CHEDDAR",4.7);
            put("CB",4.8);
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
            put("CAPPUCCINO",1.5);
            put("CIOCCOLATA CALDA",1.5);
            put("CAFFE ESPRESSO",1.2);
            put("CAPPUCCINO GRANDE",3.0);
            put("CAFFE AMERICANO",1.4);
            put("MAROCCHINO",2.3);
            put("CAFFE ORZO",2.0);
            put("CAFFE GINSENG",2.0);
            put("TE CALDO E INFUSI",1.5);
            put("LATTE CALDO E MACCHIATO",2.0);
        }
    };
    
    public static final Map<String,Double> PASTE = new HashMap<String,Double>(){
        {
            put("CROISSANT CON NUTELLA",1.3);
            put("CROISSANT VUOTO",1.1);
            put("CROISSANT CON CREMA",1.1);
            put("CROISSANT CON MARMELLATA",1.1);
            put("MUFFIN CIOCCOLATO",1.7);
            put("MUFFIN MIRTILLI",1.7);
            put("MUFFIN CON NUTELLA",2.4);
            put("DONUT ZUCCHERO",1.7);
            put("DONUT CIOCCOLATO",1.7);
            put("CHEESCAKE ALLA FRAGOLA",3.0);
            put("TORTA DELLA NONNA",2.4);
            put("TORTA CIOCCOLATO MULTISTRATO",3.0);
            put("MACARONS",5.0);
        }
    };

    
    public static final Map <String,Double> DESSERTS = new HashMap<String,Double>(){
        {
            put("MC FLURRY PISTACCHIO",3.30);
            put("MC FLURRY SNICKERS",3.30);
            put("MC FLURRY OREO",3.30);
            put("MC FLURRY BACI PERUGINA",3.30);
            put("MC FLURRY BACI SMARTIES",3.30);
            put("SUNDAE BACI PERUGINA",2.20);
            put("SUNDAE FIORDILATTE",2.20);
            put("SUNDAE CIOCCOLATO",2.20);
            put("SUNDAE CARAMELLO",2.20);
            put("SUNDAE CAFFE",2.20);
            put("SUNDAE FRUTTI DI BOSCO",2.20);
            put("CONO",1.0);
            put("MILKSHAKE FRAGOLA",1.80);
            put("MILKSHAKE VANIGLIA",1.80);
            put("MILKSHAKE CIOCCOLATO",1.80);
            put("MILKSHAKE BANANA",1.80);
            put("PANCAKE CON SCIROPPO",2.10);
            put("ACTIMEL KIDS FRAGOLA",1.10);
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
    
    public static final Map <String,Double> BIBITE = new HashMap<String,Double>(){
        {
            put("COCA-COLA",2.50);
            put("COCA-COLA 0",2.50);
            put("ACQUA LILIA",1.40);
            put("FANTA ORANGE",2.50);
            put("LIPTON ICE TEA PESCA",2.50);
            put("LIPTON ICE TEA LIMONE",2.50);
            put("SPRITE",2.50);
        }
    };
}
