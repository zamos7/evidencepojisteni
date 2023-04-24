/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zamyk_ms8z7w8
 */
public class Menu {
    
    public void akce()  {
        Scanner sc = new Scanner(System.in);
        Operace operace = new Operace();
        
        int​ vstupInt = 0;
        
        while (vstupInt != 4){
            System.out.println("vyberte si akci");
            System.out.println("1 - Pridat nového pojisteného \n2 - Vypsat vsechny pojistené \n3 - Vyhledat pojisteného \n4 - Konec ");
        
            String vstup = sc.nextLine(); 
            vstup = vstup.trim();
            vstupInt = Integer.parseInt(vstup);
    
            switch (vstupInt) {
                case 1 -> {
                    System.out.println("Zadejte jméno pojisteného:");
                    String vstupJmeno = sc.nextLine();
                    vstupJmeno = vstupJmeno.trim();
                
                    System.out.println("Zadejte príjmení:");
                    String vstupPrijmeni = sc.nextLine();
                    vstupPrijmeni = vstupPrijmeni.trim();
         
                    System.out.println("Zadejte vek:");
                    String vstupVek = sc.nextLine();
                    vstupVek = vstupVek.trim();
                    int​ vstupVekInt = Integer.parseInt(vstupVek);
                    
                    System.out.println("Zadejte telefoní císlo:");
                    String vstupTelCislo = sc.nextLine();
                    vstupTelCislo = vstupTelCislo.trim();
                    int​ vstupTelCisloInt = Integer.parseInt(vstupTelCislo);
                
                    operace.PridatNovehoPojisteneho(vstupJmeno, vstupPrijmeni ,vstupVekInt ,vstupTelCisloInt );
                    System.out.println("\ndata byla ulozena. pokracujte enter...");
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                }
                case 2 -> {
                    System.out.println(operace.VypisVsechPojistenych());
                    System.out.println("\npokracujte enter...");
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                }
                case 3 -> {
                    System.out.println("Zadejte jméno pojisteného");
                    String vstupJmeno = sc.nextLine();
                    vstupJmeno = vstupJmeno.trim();
                
                    System.out.println("Zadejte príjmení pojisteného.");
                    String vstupPrijmeni = sc.nextLine();
                    vstupPrijmeni = vstupPrijmeni.trim();
                    System.out.println(operace.VyhledatPojisteneho(vstupJmeno, vstupPrijmeni));
                    
                    System.out.println("\npokracujte enter...");
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                }
                case 4 -> {
                    vstupInt = 4;
                    break;
                }
                default -> {
                    System.out.println("Můj vstupní slovník neobsahuje tento príkaz. zadejte 1 az 4\n");
                    System.out.println("\npokracujte enter");
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                }   
            }
        }
    }
}
    
