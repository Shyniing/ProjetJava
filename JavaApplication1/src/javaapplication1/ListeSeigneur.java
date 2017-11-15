/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cpouillo
 */
public class ListeSeigneur {
    private ArrayList<seigneurTest> liste;

    public ListeSeigneur() throws FileNotFoundException {
        this.liste = remplirSeigneur();
    }
    //Création de la liste de tous les seigneurs grace a la méthode remplir seigneur
    //qui a charge le fichier et lit ligne par ligne pour cree des seigneur test qui ont 
    //ici uniquement un nom un id et une description
    public ArrayList<seigneurTest> remplirSeigneur() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("test.txt"));
        ArrayList<seigneurTest> retour = new ArrayList();
        String nom;
        int id;
        String desc;
        while(!sc.hasNextBoolean()){
            nom = sc.next();
            id = sc.nextInt();
            
            desc = sc.nextLine();
            seigneurTest seigneurEnCour = new seigneurTest(nom,id,desc);
            retour.add(seigneurEnCour);
        }
        return retour;
    } 

    public ArrayList<seigneurTest> getListe() {
        return liste;
    }
    
}
