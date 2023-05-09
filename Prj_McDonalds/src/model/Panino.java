package model;

import java.util.HashMap;
import java.util.Map;

public abstract class Panino {
    private Map<String, String> caratteristicheString = new HashMap<String,String>();
    private Map<String, Integer> caratteristicheInt = new HashMap<String,Integer>();
    
    public Panino(String nome, String burger, int formaggio, String salsa, int insalata, int cipolla, int cetriolo, int bacon, String pane) {
        caratteristicheString.put("NOME", nome);
        caratteristicheString.put("BURGER", burger);
        caratteristicheString.put("SALSA", salsa);
        caratteristicheString.put("PANE", pane);
        
        caratteristicheInt.put("FORMAGGIO", formaggio);
        caratteristicheInt.put("INSALATA", insalata);
        caratteristicheInt.put("CIPOLLA", cipolla);
        caratteristicheInt.put("CETRIOLO", cetriolo);
        caratteristicheInt.put("BACON", bacon);
    }
    
    public String getNome () {
       return caratteristicheString.get("NOME");
    }
    
    @Override
    public String toString () {
        String x = caratteristicheString.get("NOME") + " [ " + caratteristicheString.get("PANE");
        
        if (caratteristicheString.get("BURGER").equals("")) x += ", " + caratteristicheString.get("BURGER");
        
        if (caratteristicheInt.get("FORMAGGIO") != 0) x += ", formaggio: " + caratteristicheInt.get("FORMAGGIO");
        
        if (!caratteristicheString.get("SALSA").equals("")) x += ", " + caratteristicheString.get("SALSA");
        
        if (caratteristicheInt.get("INSALATA") != 0) x += ", insalata: " + caratteristicheInt.get("INSALATA");
        
        if (caratteristicheInt.get("CIPOLLA") != 0) x += ", cipolla: " + caratteristicheInt.get("CIPOLLA");
        
        if (caratteristicheInt.get("CETRIOLO") != 0) x += ", cetriolo: " + caratteristicheInt.get("CETRIOLO");
        
        if (caratteristicheInt.get("BACON") != 0) x += ", bacon: " + caratteristicheInt.get("BACON");
        
        return x + " ]";
    }
       
}
