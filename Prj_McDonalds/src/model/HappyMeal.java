package model;

import controller.Constants;
import static controller.Constants.SORPRESE;
import controller.GestorePanini;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HappyMeal extends HappyMenu{
    
    private String sorpresa, contorno;
    
    public HappyMeal(boolean asporto) {
        super(asporto);
        
        this.sorpresa = SORPRESE.get((int) Math.floor(Math.random()*4));
    }

    public String getSorpresa() {
        return sorpresa;
    }
    
    @Override
    public void setPanino (String nomePanino) {
        nomePanino = nomePanino.toUpperCase();
        
        try {
            if (nomePanino.equals("MCTOAST") || nomePanino.equals("HAMBURGER") || nomePanino.equals("CHICKENBURGER")) {
                this.panino = GestorePanini.getPanino(nomePanino);
            }   
        } catch (Exception ex) {
            Logger.getLogger(HappyMeal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getContorno() {
        return contorno;
    }

    public void setContorno(String contorno) {
        contorno = contorno.toLowerCase();
        
        try {
            if (contorno.equals("patate regolari") || contorno.equals("carotine baby")) {
                this.contorno = contorno;
            }
        } catch (Exception ex) {
            Logger.getLogger(HappyMeal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setDessert(String dessert) {
        dessert = dessert.toLowerCase();
        
        try {
            if (dessert.equals("mela") || dessert.equals("ananas") || dessert.equals("formaggio") || dessert.equals("actimel")) {
                this.dessert = dessert;
            }
        } catch (Exception ex) {
            Logger.getLogger(HappyMeal.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    @Override
    public String toString () {
        return super.toString() + "HappyMeal [ " + this.panino.getNome() + ", " + this.contorno + ", " + this.bibita + ", " + this.dessert + ", " + this.sorpresa + " ]";
    }  

    @Override
    public double calcolaPrezzo() {
        return 5.20;
    }

    @Override
    public String stampaGUI() {
       return "- HAPPYMEAL [ " + this.panino.getNome() + ", " + this.contorno + ", " + this.bibita + ", " + this.dessert + " ]";
    }
}