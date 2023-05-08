/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author martucciortegar
 */
public class Constants {
    public static final Map<String, String> PATATE = new HashMap<String,String>(){
        {
            put("CLASSICHE","Classiche");
            put("VERTIGO","Vertigo");
            put("CHEDDAR","Cheddar");
            put("CB","Cheddar e Bacon");
        }
    };
    
}
