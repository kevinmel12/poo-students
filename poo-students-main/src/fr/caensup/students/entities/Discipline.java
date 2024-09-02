package fr.caensup.students.entities;

public class Discipline {
	
	//Attribut
	private String nom;
	
	// Constructeur par defaut
	public Discipline () {
		this("Le nom de la discipline est inconnu");
	}

	// Constructeur avec attribut
	public Discipline(String nom) {
		this.nom = nom;
	} 
	
	// Getter & Setter nom
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
