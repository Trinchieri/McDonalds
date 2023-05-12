package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.parseBoolean;
import java.util.ArrayList;
import model.HappyMeal;
import model.McCafe;
import model.McMenu;
import model.Ordine;

public class GestoreOrdini {
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    public GestoreOrdini () throws FileNotFoundException, IOException, Exception {
        GestorePanini gPanini = new GestorePanini();
        
        /*BufferedReader br = new BufferedReader (new FileReader("ordini.csv"));
        String line;
        
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            
            switch (info[0]) {
                case "McCafe": {
                    ordini.add(new McCafe(parseBoolean(info[3]), info[1], info[2]));
                    break;
                }
                
                case "HappyMeal": {
                    ordini.add(new HappyMeal(parseBoolean(info[5]), info[1], info[2], info[3], info[4]));
                    break;
                }
                
                case "McMenu": {
                    ordini.add(new McMenu(parseBoolean(info[6]), info[1], info[2], info[3], info[4], info[5]));
                    break;
                }        
            }
        }*/
    }
    
    public void addOrdine (Ordine o) throws IOException {
        if (o == null) throw new NullPointerException ("Devi inserire un ordine");
        
        ordini.add(o);
        
        // apre il file in scrittura
        PrintWriter fout = new PrintWriter(new FileWriter("ordini.txt"));
        
        //scrive l'ordine nel file
        fout.println(o.toString());
                    
        fout.close(); // chiude il file  
    }
    
    public ArrayList<Ordine> getOrdini() {
        return ordini;
    }
}
