/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.tp2_promotion;

/**
 *
 * @author Kaely
 */
public class Etudiant {
    private int idetudiant;
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(int idetudiant, String nom, String prenom, int age) {
        this.idetudiant = idetudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getIdetudiant() {
        return idetudiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setIdetudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    
}
