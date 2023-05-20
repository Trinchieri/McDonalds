package model;

import static controller.Constants.SORPRESE;
import controller.GestorePanini;

public class HappyMeal extends HappyMenu{ 
    private String sorpresa, contorno;
    
    public HappyMeal() {        
        this.sorpresa = SORPRESE.get((int) Math.floor(Math.random()*4));
    }

    public String getSorpresa() {
        return sorpresa;
    }
    
    public void setPanino (String nomePanino) throws Exception{
        nomePanino = nomePanino.toUpperCase();
            
        if (nomePanino.equals("MCTOAST") || nomePanino.equals("HAMBURGER") || nomePanino.equals("CHICKENBURGER")) {
            this.panino = GestorePanini.getPanino(nomePanino);
        }
        else throw new Exception("Panino non valido");
    }

    public String getContorno() {
        return contorno;
    }

    public void setContorno(String contorno) throws Exception {
        contorno = contorno.toLowerCase();
        
        if (contorno.equals("patate regolari") || contorno.equals("carotine baby")) {
            this.contorno = contorno;
        }
        else throw new Exception("Contorno non valido");
    }

    public void setDessert(String dessert) throws Exception {
        dessert = dessert.toLowerCase();
        
        if (dessert.equals("mela") || dessert.equals("ananas") || dessert.equals("formaggio") || dessert.equals("actimel")) {
            this.dessert = dessert;
        }
        else throw new Exception("Dessert non valido");
    }

    @Override
    public double calcolaPrezzo() {
        return 5.20;
    }
    
    @Override
    public String toString () {
        return super.toString() + "HappyMeal [ " + this.panino.getNome() + ", " + this.contorno + ", " + this.bibita + ", " + this.dessert + ", " + this.sorpresa + " ]";
    } 

    @Override
    public String stampaGUI() {
       return "- HAPPYMEAL [ " + this.panino.getNome() + ", " + this.contorno + ", " + this.bibita + ", " + this.dessert + " ]";
    }
}