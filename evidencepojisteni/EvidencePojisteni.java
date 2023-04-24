/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojisteni;

/**
 *
 * @author zamyk_ms8z7w8
 */
public class EvidencePojisteni {
    public static void main(String[] args) {
        
        System.out.println("-----------------------------\nEvidence Pojistenych\n-----------------------------\n");
        Menu menu = new Menu();
        Operace operace = new Operace();
        
        operace.PridatNovehoPojisteneho("David" , "Capka" , 33 , 123456789 );
        operace.PridatNovehoPojisteneho("David" , "Jancik" , 27 , 123456788 );
        
        menu.akce();
    }
}
