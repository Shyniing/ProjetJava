/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cpouillo
 */
public class cartes {
    private String couleur;
    private int valeur;

    public cartes(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
    
    public String toString(){
        return this.couleur+" "+this.valeur;
    }
}
