package fr.caensup.students.entities;

public class Etablissement extends Unite{

    public boolean addGroupe(Groupe groupe){
        return addElement(groupe);
    }
}
