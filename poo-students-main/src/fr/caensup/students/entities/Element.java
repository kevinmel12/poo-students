package fr.caensup.students.entities;

public class Element {

    private String nom;

    private Unite unite;

    public Element(String nom){
        this.nom=nom;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        return nom +((unite!=null)?"["+unite+"]":"");
    }
}
