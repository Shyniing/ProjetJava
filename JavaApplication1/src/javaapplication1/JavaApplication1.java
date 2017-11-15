/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author cpouillo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        
//      Execute la fonction de chargement des seigneursTest
        /*
        ListeSeigneur maListe = new ListeSeigneur();
        System.out.println(maListe.getListe());
        */
        //ArrayList<cartes> mesCarte = new ArrayList();
        listeCartes maListe = new listeCartes();
        System.out.println(maListe.getMesCartes());
    }

  
    
}
