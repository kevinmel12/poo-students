package fr.caensup.students.entities;

import java.util.Date;

public class Evaluation {

	
	// Attributs
	private String nom;
	private Date date;
	private Groupe groupe;
	private Discipline discipline;
	
	
	// Constructeur par defaut 
	public Evaluation () {
		this("Nom evaluation inconnue", new Date().getDate());
	}
	
	// Constructeur avec nom & timestamp
	public Evaluation (String nom, long timestamp) {
		this.nom = nom;
		this.date= new Date(timestamp);
	}
	
	
	// Constructeur avec tous les attributs
	public Evaluation (String nom, Date date, Groupe groupe, Discipline discipline) {
		this.nom = nom;
		this.date = date;
		this.groupe = groupe;
		this.discipline = discipline;
	}

	
	// Getter & Setter evaluation
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Getter & Setter date
	public Date getDate() {
		return this.date;
	}
	
	public void setDate (Date date) {
		this.date = date;
	}
	
	
	// Getter & Setter groupe
	public Groupe getGroupe() {
		return this.groupe;
	}
	
	public void setGroupe (Groupe groupe) {
		this.groupe = groupe;
	}
	

	// Getter & Setter discipline
	public Discipline getDiscipline() {
		return this.discipline;
	}
	
	public void setDiscipline (Discipline discipline) {
		this.discipline = discipline;
	}
	
}
