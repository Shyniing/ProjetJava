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
public class seigneurTest {
    private int nb_pts_vic;
    private String nom;
    private int id_pouvoir;
    boolean estGradien;
    private int nb_Peuples;
    private int valcap;
    private String couleur;
//création d'une carte seigneur test

    public seigneurTest(int nb_pts_vic, String nom, int id_pouvoir, boolean estGradien, int nb_Peuples, int valcap, String couleur) {
        this.nb_pts_vic = nb_pts_vic;
        this.nom = nom;
        this.id_pouvoir = id_pouvoir;
        this.estGradien = estGradien;
        this.nb_Peuples = nb_Peuples;
        this.valcap = valcap;
        this.couleur = couleur;
    }
    
    
    public String toString(){
        return "nom :"+this.nom+"\n nb points :"+this.nb_pts_vic+" id: "+this.id_pouvoir+"estGardien : "+this.estGradien+" nb de peuples : "+this.nb_Peuples+" Valeur de capture :"+this.valcap+" Couleur :"+this.couleur;
    }
    
}
