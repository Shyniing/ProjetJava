/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abyss;

import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public class Abyss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test de creation d'un Seigneur
        
        Seigneur s1 = new Seigneur(0, "didier", 0, true, 5 , 6, couleur.blanc);
        
        //test creation d'un joueur
        
        Joueur j1 = new Joueur(new ArrayList<Seigneur>(), new ArrayList<Lieu>(), new ArrayList<Cartes>());
        
        // creation des cartes pour test du recrutement
        
        CartesPeuples c1 = new CartesPeuples(2, couleur.vert);
        CartesPeuples c2 = new CartesPeuples(2, couleur.bleu);
        CartesPeuples c3 = new CartesPeuples(1, couleur.rouge);
        CartesPeuples c4 = new CartesPeuples(1, couleur.violet);
        //CartesPeuples c5 = new CartesPeuples(1, couleur.jaune);
        
        ArrayList<CartesPeuples> ca = new ArrayList();
        
        ca.add(c1);
        ca.add(c2);
        ca.add(c3);
        ca.add(c4);
        //ca.add(c5);
        
        // test du recrutement d'un seigneur 
        
        System.out.println(j1.conditionRecrutement(s1, ca));
        
        
    }
    
}
