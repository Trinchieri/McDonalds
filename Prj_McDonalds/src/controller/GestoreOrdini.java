package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.HappyMeal;
import model.McCafe;
import model.McMenu;
import model.Ordine;

public class GestoreOrdini {
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    public GestoreOrdini () throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader (new FileReader("ordini.csv"));
        String line;
        
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            
            switch (info[0]) {
                case "McCafe": {
                    ordini.add(new McCafe(info[1], info[2]));
                    break;
                }
                
                case "HappyMeal": {
                    ordini.add(new HappyMeal(info[1], info[2], info[3], info[4]));
                    break;
                }
                
                case "McMenu": {
                    ordini.add(new McMenu(info[1], info[2], info[3], info[4]));
                    break;
                }        
            }
        }
    }

    public ArrayList<Ordine> getOrdini() {
        return ordini;
    }
}
