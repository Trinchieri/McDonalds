package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Panino;

public class GestorePanini {
    private ArrayList<Panino> panini = new ArrayList<>();
    
    public GestorePanini () throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader (new FileReader("panini.csv"));
        String line;
        
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            
            panini.add(new Panino(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]) {});
        }
    }
    
    public ArrayList<Panino> getPanini() {
        return panini;
    }
}
