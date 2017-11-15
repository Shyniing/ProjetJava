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
public class Joueur {
    private ArrayList<Seigneur> seigneur;
    private ArrayList lieux;
    private int nbPerle;
    private int nbClef;
    private ArrayList<Cartes> main;

    public Joueur(ArrayList<Seigneur> seigneur, ArrayList lieux, ArrayList<Cartes> main) {
        this.seigneur = seigneur;
        this.lieux = lieux;
        this.main = main;
        
        this.nbClef = 0;
        this.nbPerle = 1;
    }
    
    public boolean conditionRecrutement(Seigneur s,ArrayList<CartesPeuples> ca){
        
        // valeur -- > valeur de capture mise en jeu par le joueur 
        
        int valeur =0 ;
        
        // cartes mises en jeu par le joueur 
        ArrayList<CartesPeuples> utilise;
        
        // valeur pour savoir si la capture est effectué ou non 
        
        boolean retour = false;
        
        // toutes les couleurs utilisées pour capturer le seigneur
        
        ArrayList<couleur> couleuruse; 
        
        couleuruse = new ArrayList();
        
        //temporaire avant de lire avec eventListener
        
        utilise = ca;
        
        //joueur choisis des cartes de sa main avec listener (à la fin )
        
       // recupération des infos des cartes choisis
       
       
       
       for(CartesPeuples c : utilise){
           //calcl de la valeur utilisé pour capturer
           
           valeur = valeur + c.getValeur();
           
           //calcul des couleurs
           
           // recherche de la couleur dans les couleurs utilisé pour eviter les doublons
           
           boolean x = false;
           int i = 0;
           
           while(x == false && i<couleuruse.size()){
               
                 if(c.getCouleur().equals(couleuruse.get(i))){
                     x = true;
                 }
                 
                 i++;
           }
           
           if(x == false){
               couleuruse.add(c.getCouleur());
           }
           }
       
       // une fois ici on a toutes nos conditions a vérifier soit : la valeur de capture / le nombre de peuple et la couleur obligatoire
       
       // test de capture 
            if(s.getC().equals(couleur.blanc)){
               if(valeur >= s.getValCap() && s.getNbPeuples() == couleuruse.size()) {
                    return true;
                }else{
                    return false;
                } 
            }else{
       
                if(valeur >= s.getValCap() && s.getNbPeuples() == couleuruse.size() && couleuruse.contains(s.getC()) ) {
                    return true;
                }else{
                    return false;
                }
            }
    }
    
    public boolean soutiens(int x){
        //temporaire choix de la couleur
        
        return false;
    }
}
