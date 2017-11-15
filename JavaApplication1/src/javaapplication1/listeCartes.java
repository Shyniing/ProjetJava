/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cpouillo
 */
public class listeCartes {
    private ArrayList<cartes> mesCartes;

    public listeCartes() {
        this.mesCartes = remplirCartes();
    }
    
    public ArrayList<cartes> remplirCartes(){
       List<cartes> retour = new ArrayList();
        retour.add(new cartes("bleu",5));
        retour.add(new cartes("vert",5));
        retour.add(new cartes("jaune",5));
        retour.add(new cartes("violet",5));
        retour.add(new cartes("rouge",5));
        
        for(int i=0;i<2;i++){
            retour.add(new cartes("bleu",4));
            retour.add(new cartes("vert",4));
            retour.add(new cartes("jaune",4));
            retour.add(new cartes("violet",4));
            retour.add(new cartes("rouge",4)); 
        }
        for(int i=0;i<3;i++){
            retour.add(new cartes("bleu",3));
            retour.add(new cartes("vert",3));
            retour.add(new cartes("jaune",3));
            retour.add(new cartes("violet",3));
            retour.add(new cartes("rouge",3));
            retour.add(new cartes("bleu",2));
            retour.add(new cartes("vert",2));
            retour.add(new cartes("jaune",2));
            retour.add(new cartes("violet",2));
            retour.add(new cartes("rouge",2));
            
        }
        for(int i=0;i<4;i++){
            retour.add(new cartes("bleu",1));
            retour.add(new cartes("vert",1));
            retour.add(new cartes("jaune",1));
            retour.add(new cartes("violet",1));
            retour.add(new cartes("rouge",1)); 
        }
        Collections.shuffle(retour);
        return (ArrayList<cartes>) retour;
    }

    public ArrayList<cartes> getMesCartes() {
        return mesCartes;
    }
    
}
