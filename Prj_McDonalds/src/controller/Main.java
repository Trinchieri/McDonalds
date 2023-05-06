package controller;

import java.io.IOException;
import model.Ordine;
import model.Panino;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        GestorePanini c = new GestorePanini ();
        GestoreOrdini d = new GestoreOrdini();
        
        for (Panino i: c.getPanini()) {
            System.out.println(i.getNome());
        }
        
        for (Ordine i: d.getOrdini()) {
            System.out.println(i);
        }
    }
    
}
