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
    private String nom;
    private int id;
    private String description;
//création d'une carte seigneur test
    public seigneurTest(String nom, int id, String description) {
        this.nom = nom;
        this.id = id;
        this.description = description;
    }
    
    public String toString(){
        return "nom "+this.nom+" id: "+this.id+" description: "+this.description;
    }
    
}
