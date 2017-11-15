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
public abstract class Cartes {
    
}

enum couleur {
    rouge,
    jaune,
    vert,
    bleu,
    violet,
    blanc;
}

class CartesPeuples extends Cartes {

    private int valeur;
    private couleur c;

    public CartesPeuples(int valeur, couleur c) {
        this.valeur = valeur;
        this.c = c;
    }

    public int getValeur() {
        return valeur;
    }

    public couleur getCouleur() {
        return c;
    }
    
    
}

class Monstres extends Cartes {

    public Monstres() {
    }
}