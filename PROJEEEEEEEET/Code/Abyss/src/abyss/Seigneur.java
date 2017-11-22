/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abyss;

/**
 *
 * @author Vincent
 */
public class Seigneur {
    
    private int nbPtsVic;
    private String nom;
    
    // Lien vers le tableau des pouvoirs
    
    private int idPouvoir;
    
    
    private boolean estGardien;
    
    //attributs servant à la capture du Seigneur
    
    private int nbPeuples;
    private int valCap;
    private couleur c;

    public Seigneur(int nbPtsVic, String nom, int idPouvoir, boolean estGardien, int nbPeuples, int valCap, couleur c) {
        this.nbPtsVic = nbPtsVic;
        this.nom = nom;
        this.idPouvoir = idPouvoir;
        this.estGardien = estGardien;
        this.nbPeuples = nbPeuples;
        this.valCap = valCap;
        this.c = c;
    }

    public int getNbPtsVic() {
        return nbPtsVic;
    }

    public String getNom() {
        return nom;
    }

    public int getIdPouvoir() {
        return idPouvoir;
    }

    public boolean isEstGardien() {
        return estGardien;
    }

    public int getNbPeuples() {
        return nbPeuples;
    }

    public int getValCap() {
        return valCap;
    }

    public couleur getC() {
        return c;
    }
    
    
}
