package fr.caensup.students.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unite extends Element{

    private List<Element> elements;

    public Unite(){
        this("nom d'unité inconnu");
    }

    public Unite(String nom){
        super(nom);
        elements=new ArrayList<>();
    }

    public List<Element> getElements() {
        return elements;
    }

    protected boolean addElement(Element element){
        if(elements.add(element)){
            element.setUnite(this);
            return true;
        }
        return false;
    }

    public boolean removeElement(Element element){
            if(elements.remove(element)){
                element.setUnite(null);
                return true;
            }
            return false;
    }

    public void addElements(Element ...elements){
        this.elements.addAll(Arrays.asList(elements));
    }
}
