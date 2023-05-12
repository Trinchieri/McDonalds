package controller;

import java.io.IOException;
import static java.lang.Character.toUpperCase;
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
        char risposta; //utente decide se inserire altri ordini
        
        do {
            
            System.out.println("\nVUOI ORDINARE?");
            risposta = scan.next().charAt(0);
            risposta = toUpperCase(risposta);
            
            while (risposta!='N' && risposta!='S') {
                System.out.println("DEVI INSERIRE S O N: ");
                risposta = scan.next().charAt(0);
                risposta = toUpperCase(risposta);
            }
            
            if (risposta=='S'){
                nuovoOrdine(d);
            }
            
        } while (risposta!='N');
        
        
        //STAMPA DI TUTTI GLI ORDINI
        System.out.println("\nSTAMPA ORDINI CORRENTI:");
        for (Ordine i: d.getOrdini()) {
            System.out.println(i);
        }
    }
    
    private static void nuovoOrdine (GestoreOrdini d) throws IOException, Exception {
        Scanner scan = new Scanner(System.in);  //input da tastiera
        
        //ASPORTO
        System.out.println("\nASPORTO?");
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
                
                System.out.println("\nPATATE CLASSICHE / CAROTINE BABY");
                ordine1.setContorno(scan.nextLine());
                
                System.out.println("\nBIBITA: ");
                ordine1.setBibita(scan.nextLine());
                
                System.out.println("\nMELA / ANANAS / FORMAGGIO / ACTIMEL");
                ordine1.setDessert(scan.nextLine());
                
                d.addOrdine(ordine1);
                break;
            }
            
            case "MCMENU": {
                McMenu ordine1 = new McMenu(asporto);
                
                System.out.println("\nPANINO:");
                ordine1.setPanino(scan.nextLine());
                
                System.out.println("\nPATATINE:");
                String tipoPatatine = scan.nextLine();
                
                if (!tipoPatatine.toUpperCase().equals("PATATINE CLASSICHE")) {
                    ordine1.setPatatine("patatine classiche");
                }
                else {
                    System.out.println("SALSA:");
                    ordine1.setPatatine(tipoPatatine, scan.nextLine());
                }
                
                System.out.println("\nBIBITA: ");
                ordine1.setBibita(scan.nextLine());
                
                System.out.println("DESSERT: ");
                ordine1.setDessert(scan.nextLine());
                
                d.addOrdine(ordine1);
                break;
            }
        }
    }
    
}
