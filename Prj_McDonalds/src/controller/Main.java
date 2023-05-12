package controller;

import java.io.IOException;
import java.util.Scanner;
import model.HappyMeal;
import model.McCafe;
import model.McMenu;
import model.Ordine;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        Scanner scan = new Scanner(System.in);  //input da tastiera
        
        //Gestore ordini
        GestoreOrdini d = new GestoreOrdini();
        
        
        //ASPORTO
        System.out.println("ASPORTO?");
        boolean asporto = false;
        if (scan.nextLine().toLowerCase().equals("true")) asporto = true;
        
        
        //SCELTA MCMENU / HAPPYMEAL / MCCAFE
        System.out.println("\nMCMENU / HAPPYMEAL / MCCAFE?");
        String ordine = scan.nextLine().toUpperCase();
        
        switch (ordine) {
            case "MCCAFE": {
                McCafe ordine1 = new McCafe(asporto);
                
                System.out.println("\nBEVANDA:");
                ordine1.setBevanda(scan.nextLine());
                
                System.out.println("\nPASTA:");
                ordine1.setPasta(scan.nextLine());
                
                d.addOrdine(ordine1);
                break;
            }
            
            case "HAPPYMEAL": {
                HappyMeal ordine1 = new HappyMeal(asporto);
                
                System.out.println("\nPANINO: MCTOAST / HAMBURGER / CHICKENBURGER");
                ordine1.setPanino(scan.nextLine());
                
                System.out.println("\nPATATE / CAROTINE BABY");
                ordine1.setContorno(scan.nextLine());
                
                System.out.println("\nBEVANDA: ");
                ordine1.setBevanda(scan.nextLine());
                
                System.out.println("\nMELA / ANANAS / FORMAGGIO / ACTIMEL");
                ordine1.setDessert(scan.nextLine());
                
                d.addOrdine(ordine1);
                break;
            }
        }
        
        
        //STAMPA DI TUTTI GLI ORDINI
        System.out.println("\nSTAMPA ORDINI CORRENTI:");
        for (Ordine i: d.getOrdini()) {
            System.out.println(i);
        }
        
        
    }
    
}
