package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import model.Panino;

public class GestorePanini {
    private static ArrayList<Panino> panini = new ArrayList<>();
    
    public GestorePanini () throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader (new FileReader("panini.csv"));
        String line;
        
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            
            panini.add(new Panino(info[0], info[1], parseInt(info[2]), info[3], parseInt(info[4]), parseInt(info[5]), parseInt(info[6]), parseInt(info[7]), info[8], info[9]) {});
        }
    }
    
    public ArrayList<Panino> getPanini() {
        return panini;
    }
    
    public static Panino getPanino (String nome) {
        nome = nome.toUpperCase();
        
        for (Panino i: panini) {
            if (i.getKey().equals(nome)) {
                return i;
            }
        }
        
        return null;
    }
}
