/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.tp2_promotion;

import java.util.ArrayList;

/**
 *
 * @author Kaely
 */
public class Promotion {
    
    private ArrayList<Etudiant> studentList;
    
    public Promotion()
    {
        studentList = new ArrayList<>();
    }
    
    public int newId()
    {
        int studentCount = 0;
        studentCount = studentList.size();
        if (studentCount == 0)
        {
            return 0;
        }
       
            int largeId = studentList.get(0).getIdetudiant();
            int id = 0;
            for (int i = 0; i < studentCount ; i ++)
            {
               id = studentList.get(i).getIdetudiant();
            }
        if (id > largeId)
        {
            largeId = id;
        }
         return largeId + 1;
    }
    
    public int ajoutEtudiant(String nom, String prenom, int age)
    {
        int id = newId();
        studentList.add(new Etudiant(id, nom, prenom, age));
        return id;
    }
   
    public void afficheEtudiant()
    {
        for (Etudiant etudiant : studentList)
        {
            System.out.println(etudiant.getIdetudiant() +1 +" "+etudiant.getNom()+" "+etudiant.getAge());
        }
        
    }
}

