/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
        Scanner sc = new Scanner(new File("seigneur.txt"));
        ArrayList<seigneurTest> retour = new ArrayList();
        String nom;
        int nb_pts_vic;
        int id_pouvoir;
        boolean estGardien;
        int nb_peuple;
        int valcap;
        String couleur;
        for(int i=0;i<35;i++){
            
            nom = sc.nextLine();
            nb_pts_vic = sc.nextInt();            
            id_pouvoir = sc.nextInt();
            estGardien = sc.nextBoolean();
            nb_peuple = sc.nextInt();
            valcap = sc.nextInt();
            couleur = sc.nextLine();
            
            seigneurTest seigneurEnCour = new seigneurTest(nb_pts_vic,nom,id_pouvoir,estGardien,nb_peuple,valcap,couleur);
            retour.add(seigneurEnCour);            
        }
        Collections.shuffle(retour);
        return retour;
        
    } 

    public ArrayList<seigneurTest> getListe() {
        return liste;
    }
    public void AfficherListe(){
        for(int i=0; i<this.liste.size();i++){
            System.out.println(this.liste.get(i));
        }
    }
    
}
