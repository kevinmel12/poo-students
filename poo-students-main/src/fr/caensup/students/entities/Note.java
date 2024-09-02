package fr.caensup.students.entities;

public class Note {
	
	// Attributs 
	private float valeur;
	private Etudiant etudiant;
	private Evaluation evaluation;
	
	// Constructeur par defaut
	public Note () {
		this.valeur = 0.0f;
		this.etudiant = null;
		this.evaluation = null;
	}
	
	// Constructeur de tous les attributs
	public Note (float valeur, Etudiant etudiant, Evaluation evaluation) {
		this.valeur = valeur;
		this.etudiant = etudiant;
		this.evaluation = evaluation;
	}
	
	// Getter & Setter valeur
	public float getValeur() {
		return this.valeur;
	} 
	
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	
	// Getter & Setter etudiant
	public Etudiant getEtudiant() {
		return this.etudiant;
	}
	
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	// Getter & Setter evaluation 
	public Evaluation getEvaluation() {
		return this.evaluation;
	}
	
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

}
