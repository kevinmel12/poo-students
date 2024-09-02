package fr.caensup.students.entities;

public class Etudiant extends Element{
    private String prenom;
    public Etudiant(){
        this("prenom étudiant inconnu","");
    }

    public Etudiant(String prenom, String nom){
        super(nom);
        this.prenom = prenom;
    }


    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

}
