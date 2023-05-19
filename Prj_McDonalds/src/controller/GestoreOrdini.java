package controller;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Ordine;

public class GestoreOrdini {
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    public GestoreOrdini () throws FileNotFoundException, IOException, Exception {
        GestorePanini gPanini = new GestorePanini();
    }
    
    public void addOrdine (Ordine o) throws IOException {
        if (o == null) throw new NullPointerException ("Devi inserire un ordine");
        
        ordini.add(o);
        
        // apre il file in scrittura
        PrintWriter fout = new PrintWriter(new FileWriter("ordini.txt"));
    
        //scrive l'ordine nel file
        for (Ordine i: ordini) {
            fout.println(i);
        }
                    
        fout.close(); // chiude il file  
    }
    
    public ArrayList<Ordine> getOrdini() {
        return ordini;
    }
    
    public double calcolaPrezzoTotale () {
        double prezzoTotale = 0;
        
        for (Ordine i: ordini) {
            prezzoTotale += i.calcolaPrezzo();
        }
        
        return Math.round(prezzoTotale)/100;
    }
}
