package controller;

import java.util.ArrayList;
import model.Ordine;

public class GestoreOrdine {
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    void addOrdine (Ordine ordine) throws Exception {
        if (ordine == null) throw new Exception ("Devi inserire un ordine");
        
        ordini.add(ordine);
    }
}
