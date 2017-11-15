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
public class Plateau {
    //Les attributs actuellement disponible dans la partie
    
    private ArrayList<Lieu> lieuDispo;
    private ArrayList<Seigneur> seigneursDispo;
    private int menace;
    
    private ArrayList<ArrayList<Cartes>> conseil;
    private ArrayList<Cartes> cheminExplo;
    // Les pioches
    
    private ArrayList<Lieu> piocheLieu;
    private ArrayList<Seigneur> piocheSeigneur;
    private ArrayList<Cartes> piocheExplo;
    
}
