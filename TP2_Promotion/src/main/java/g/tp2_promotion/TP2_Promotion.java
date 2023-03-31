/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package g.tp2_promotion;

/**
 *
 * @author Kaely
 */
public class TP2_Promotion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Promotion promotion = new Promotion();
        
        promotion.ajoutEtudiant("Njomo","Yannick",15);
         promotion.ajoutEtudiant("Ateba","Jean",10);
          promotion.ajoutEtudiant("Ali","Boris",55);
           promotion.ajoutEtudiant("Zambo","Prince",15);
           
           promotion.afficheEtudiant();
          
    }
}
