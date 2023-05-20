package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import model.Ordine;

public class GestoreOrdini {
    private boolean isAsporto;
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    public GestoreOrdini () throws FileNotFoundException, IOException, Exception {
        GestorePanini gPanini = new GestorePanini();
    }
   
    public void addOrdine (Ordine o) throws IOException, Exception {
        if (o == null) throw new Exception("Ordine non valido");
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
        
        return Math.round(prezzoTotale * 100)/100;
    }

    public boolean isIsAsporto() {
        return isAsporto;
    }

    public void setIsAsporto(boolean isAsporto) {
        this.isAsporto = isAsporto;
    }
    
    public int getNumeroOrdine () throws IOException {
        BufferedReader br = new BufferedReader (new FileReader("numero.txt"));
        int numeroOrdine = parseInt(br.readLine()) + 1;
            
        PrintWriter fout = new PrintWriter(new FileWriter("numero.txt"));
        fout.println(numeroOrdine);
        fout.close();
        
        return numeroOrdine;
    }
    
    public String getDataOra () {
        return ordini.get(0).getDataOra();
    }
}
