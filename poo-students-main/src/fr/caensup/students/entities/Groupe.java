package fr.caensup.students.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Groupe extends Unite{

    public boolean addEtudiant(Etudiant et){
        return addElement(et);
    }

}