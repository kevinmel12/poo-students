import fr.caensup.students.entities.Element;
import fr.caensup.students.entities.Etablissement;
import fr.caensup.students.entities.Etudiant;
import fr.caensup.students.entities.Groupe;
import fr.caensup.students.entities.Note;
import fr.caensup.students.entities.Evaluation;

import java.util.ArrayList;
import java.util.List;

public class Prog {
    public static void main(String[] args) {

        // Tester la classe Groupe
        Groupe gr = new Groupe();
        gr.setNom("2 BTS SIO ALT");
        Etudiant et1 = new Etudiant("Pierre", "B");
        gr.addEtudiant(et1);
        System.out.println("Groupe: " + gr.getNom());
        System.out.println("Etudiants dans le groupe: " + gr.getElements());

        // Ajouter un nouvel étudiant
        gr.addEtudiant(new Etudiant("Kevin", "C"));
        System.out.println("Etudiants après ajout: " + gr.getElements());

        // Tester l'ajout de plusieurs éléments
        gr.addElements(et1, new Etudiant("Jean", "D"), new Etudiant("Paul", "E"));
        System.out.println("Etudiants après ajout multiple: " + gr.getElements());

        // Tester la classe Etablissement
        Etablissement etab = new Etablissement();
        etab.setNom("CaenSup Saint-Ursul");
        System.out.println("Nom de l'établissement: " + etab.getNom());

        // Tester la classe Evaluation
        Evaluation eval = new Evaluation("Examen de Java", System.currentTimeMillis());
        System.out.println("Nom de l'évaluation: " + eval.getNom());
        System.out.println("Date de l'évaluation: " + eval.getDate());

        // Tester la classe Note
        Note note1 = new Note(15.5f, et1, eval);
        System.out.println("Note de l'étudiant " + note1.getEtudiant().getNom() + " pour " + note1.getEvaluation().getNom() + ": " + note1.getValeur());

        // Tester la modification d'une note
        note1.setValeur(16.0f);
        System.out.println("Nouvelle note: " + note1.getValeur());

        // Ajouter une nouvelle note pour un autre étudiant
        Etudiant et2 = new Etudiant("Marie", "F");
        Note note2 = new Note(18.0f, et2, eval);
        System.out.println("Note de l'étudiant " + note2.getEtudiant().getNom() + " pour " + note2.getEvaluation().getNom() + ": " + note2.getValeur());
    }
}
