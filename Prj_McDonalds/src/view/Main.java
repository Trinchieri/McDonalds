package view;

import controller.GestoreOrdini;
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
            System.out.println("PREZZO:" + i.calcolaPrezzo() + "\n");
        }
    }
    
    private static void nuovoOrdine (GestoreOrdini d) throws IOException, Exception {
        Scanner scan = new Scanner(System.in);  //input da tastiera
        
        //ASPORTO
        System.out.println("\nASPORTO? (SI / NO)");
        String appAsporto = scan.nextLine().toUpperCase();
        boolean asporto = false;
        
        while (appAsporto!="SI" && appAsporto!="NO") {
            System.out.println("DEVI INSERIRE SI / NO");
            appAsporto = scan.nextLine().toUpperCase();
        }
        
        if (scan.nextLine().equals("SI")) asporto = true;
        
        
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
                
                //MODIFICA ORDINE
                String risposta;
                        
                do {
                    System.out.println("\nVUOI MODIFICARE L'ORDINE? (SI / NO)");
                    risposta = scan.nextLine().toUpperCase();
                    
                    while (risposta!="NO" && risposta!="SI") {
                        System.out.println("DEVI INSERIRE SI O NO: ");
                        risposta = scan.nextLine().toUpperCase();
                    }
                    
                    System.out.println("\nCOSA VUOI MODIFICARE (BEVANDA / PASTA)?");
                    String modifica = scan.nextLine().toUpperCase();
                    
                    switch (modifica) {
                        case "BEVANDA": {
                            System.out.println("\nBEVANDA:");
                            ordine1.setBevanda(scan.nextLine());
                            break;
                        }
                        
                        case "PASTA": {
                            System.out.println("\nPASTA:");
                            ordine1.setPasta(scan.nextLine());
                            break;
                        }
                        
                        default: {
                            System.out.println("Non puoi modificare questo campo");
                        }
                    }
                } while (risposta!="NO");
                
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
                
                //MODIFICA ORDINE
                String risposta;
                        
                do {
                    System.out.println("\nVUOI MODIFICARE L'ORDINE? (SI / NO)");
                    risposta = scan.nextLine().toUpperCase();
                    
                    while (risposta!="NO" && risposta!="SI") {
                        System.out.println("DEVI INSERIRE SI O NO: ");
                        risposta = scan.nextLine().toUpperCase();
                    }
                    
                    System.out.println("\nCOSA VUOI MODIFICARE (PANINO / CONTORNO / BIBITA / DESSERT)?");
                    String modifica = scan.nextLine().toUpperCase();
                    
                    switch (modifica) {
                        case "PANINO": {
                            System.out.println("\nPANINO: MCTOAST / HAMBURGER / CHICKENBURGER");
                            ordine1.setPanino(scan.nextLine());
                            break;
                        }
                        
                        case "CONTORNO": {
                            System.out.println("\nPATATE CLASSICHE / CAROTINE BABY");
                            ordine1.setContorno(scan.nextLine());
                            break;
                        }
                        
                        case "BIBITA": {
                            System.out.println("\nBIBITA: ");
                            ordine1.setBibita(scan.nextLine());
                            break;
                        }
                        
                        case "DESSERT": {
                            System.out.println("\nMELA / ANANAS / FORMAGGIO / ACTIMEL");
                            ordine1.setDessert(scan.nextLine());
                            break;
                        }
                        
                        default: {
                            System.out.println("Non puoi modificare questo campo");
                        }
                    }
                } while (risposta!="NO");
                
                d.addOrdine(ordine1);
                break;
            }
            
            case "MCMENU": {
                McMenu ordine1 = new McMenu(asporto);
                
                System.out.println("\nPANINO:");
                ordine1.setPanino(scan.nextLine());
                
                System.out.println("\nPATATINE (CLASSICHE / VERTIGO / CHEDDAR / CB):");
                String tipoPatatine = scan.nextLine();
                
                if (!tipoPatatine.toUpperCase().equals("CLASSICHE")) {
                    ordine1.setPatatine("classiche");
                }
                else {
                    System.out.println("SALSA:");
                    ordine1.setPatatine(tipoPatatine, scan.nextLine());
                }
                
                System.out.println("\nBIBITA: ");
                ordine1.setBibita(scan.nextLine());
                
                System.out.println("DESSERT: ");
                ordine1.setDessert(scan.nextLine());
                
                
                //MODIFICA ORDINE
                String risposta;
                        
                do {
                    System.out.println("\nVUOI MODIFICARE L'ORDINE? (SI / NO)");
                    risposta = scan.nextLine().toUpperCase();
                    
                    while (risposta!="NO" && risposta!="SI") {
                        System.out.println("DEVI INSERIRE SI O NO: ");
                        risposta = scan.nextLine().toUpperCase();
                    }
                    
                    System.out.println("\nCOSA VUOI MODIFICARE (PANINO / PATATINE / BIBITA / DESSERT)?");
                    String modifica = scan.nextLine().toUpperCase();
                    
                    switch (modifica) {
                        case "PANINO": {
                            System.out.println("\nPANINO:");
                            ordine1.setPanino(scan.nextLine());
                            break;
                        }
                        
                        case "PATATINE": {
                            System.out.println("\nPATATINE (CLASSICHE / VERTIGO / CHEDDAR / CB):");
                            tipoPatatine = scan.nextLine();

                            if (!tipoPatatine.toUpperCase().equals("CLASSICHE")) {
                                ordine1.setPatatine("classiche");
                            }
                            else {
                                System.out.println("SALSA:");
                                ordine1.setPatatine(tipoPatatine, scan.nextLine());
                            }
                            break;
                        }
                        
                        case "BIBITA": {
                            System.out.println("\nBIBITA: ");
                            ordine1.setBibita(scan.nextLine());
                            break;
                        }
                        
                        case "DESSERT": {
                            System.out.println("DESSERT: ");
                            ordine1.setDessert(scan.nextLine());
                            break;
                        }
                        
                        default: {
                            System.out.println("Non puoi modificare questo campo");
                        }
                    }
                } while (risposta!="NO");
                
                d.addOrdine(ordine1);
                break;
            }
        }
    } 
}
