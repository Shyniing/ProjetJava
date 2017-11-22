/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abyss;

import java.util.ArrayList;
import java.util.Scanner;

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
    private int nbptsvic;
    public Joueur(ArrayList<Seigneur> seigneur, ArrayList lieux, ArrayList<Cartes> main) {
        this.seigneur = seigneur;
        this.lieux = lieux;
        this.main = main;
        
        this.nbptsvic = 0;
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
    
    public boolean soutiens(int x, Plateau p){
        //temporaire choix de la couleur
        if(p.getConseil().get(x).size()>0){
            for(int i = 0;i<p.getConseil().get(x).size();i++){
               this.main.add(p.getConseil().get(x).get(i)); 
            }
            p.getConseil().get(x).clear();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean exploration(Partie p){
        boolean fin = false;
        String choixM;
        int nbpio = 0;
        int choixrecompense = 0;
        while(fin = false || nbpio < 6){
            
            Cartes c = p.getP().getPiocheExplo().get(0);
            
            if(c instanceof CartesPeuples){
                
                
            }else{
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Combattre ? y = oui n = non");
                choixM = sc.next();
                if(choixM.equals("y")){
                    switch(p.getP().getMenace()){
                    case 0 : 
                        System.out.println("Choisissez votre recompense : 0 perle 1 monstre");
                        choixrecompense = sc.nextInt();
                        if(choixrecompense == 0){
                            this.nbPerle = this.nbPerle+1;
                        }else{
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                        }
                        break;
                    case 1 : 
                        
                        System.out.println("Choisissez votre recompense : 0 perle 1 perle/monstre 2 monstres");
                        choixrecompense = sc.nextInt();
                        
                        if(choixrecompense == 0){
                            this.nbPerle = this.nbPerle+2;
                        }else if(choixrecompense == 1){
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                            this.nbPerle++;
                        }else{
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                        }
                        
                        break;
                    case 2 : 
                        this.nbClef++;
                        break;
                        
                    case 3 : 
                        this.nbClef++;
                        System.out.println("Choisissez votre recompense : 0 perle 1 monstre");
                        choixrecompense = sc.nextInt();
                        if(choixrecompense == 0){
                            this.nbPerle = this.nbPerle+1;
                        }else{
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                        }
                        break;
                    case 4 : 
                        this.nbClef++;
                        System.out.println("Choisissez votre recompense : 0 perle 1 perle/monstre 2 monstres");
                        choixrecompense = sc.nextInt();
                        
                        if(choixrecompense == 0){
                            this.nbPerle = this.nbPerle+2;
                        }else if(choixrecompense == 1){
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                            this.nbPerle++;
                        }else{
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                            this.nbptsvic = 2 + (int)(Math.random() * ((4 - 2) + 1));
                        }
                        break;
                    case 5 : 
                        this.nbClef = this.nbClef +2;
                
                }
                fin = true;
                }else if(choixM.equals("n")){
                    p.setMenace(p.getP().getMenace()+1);
                    nbpio++;
                }
            }
        }
    }
    
    
    
}
