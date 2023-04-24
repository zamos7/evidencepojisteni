/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 *
 * @author zamyk_ms8z7w8
 */
public class Operace {
    
public static ArrayList<String> jmena = new ArrayList<>();    
public static ArrayList<String> prijmeni = new ArrayList<>();
public static ArrayList<Integer> telCisla = new ArrayList<>();
public static ArrayList<Integer> roky = new ArrayList<>();
  
    public String PridatNovehoPojisteneho(String vstupJmeno, String vstupPrijmeni, int vstupVekInt, int​ vstupTelCisloInt){
     
        jmena.add(vstupJmeno);
        prijmeni.add(vstupPrijmeni);
        roky.add(vstupVekInt);
        telCisla.add(vstupTelCisloInt);
        
    return "";
    }
    
    public String VypisVsechPojistenych(){
        
        for (int i = 0; jmena.size() > i; i++) {
            System.out.println(jmena.get(i) + "    " + prijmeni.get(i) + "    " + roky.get(i) + "    " + telCisla.get(i));
        }
        
    return "";
    }
    
    public String VyhledatPojisteneho(String vstupJmeno, String vstupPrijmeni){
       
        System.out.println("\nv databazi se nasli tyto shody");
        for (int i = 0; jmena.size() > i; i++) {
            if(jmena.get(i).equals(vstupJmeno) && prijmeni.get(i).equals(vstupPrijmeni)) {
                System.out.println(jmena.get(i) + "    " + prijmeni.get(i) + "    " + roky.get(i) + "    " + telCisla.get(i));
            }    
        }
        
    return "";  
    }
    
}
