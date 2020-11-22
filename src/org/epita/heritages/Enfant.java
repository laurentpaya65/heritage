package org.epita.heritages;

import java.util.Objects;

public class Enfant implements Cloneable {
    private String nom;
    private String prenom;
    private int age;
    private Enfant amoureux;
     String petitNom = "je suis Enfant";

    public String getPetitNom() {
        return petitNom;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enfant enfant = (Enfant) o;
        return age == enfant.age &&
                Objects.equals(nom, enfant.nom) &&
                Objects.equals(prenom, enfant.prenom) &&
                Objects.equals(amoureux, enfant.amoureux) &&
                Objects.equals(petitNom, enfant.petitNom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age, amoureux, petitNom);
    }

    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = 0;
    }

    public void tomberAmoureux(Enfant amoureux) {
        this.amoureux = amoureux;
    }

    public boolean estAmoureux() {
        return amoureux != null;
    }
    public void joueAuBallon(Enfant enfant) {
        System.out.println(enfant.prenom + " joue au ballon avec "+this.prenom);
    }

    public void presentation() {
        System.out.println("Bonjour je m'appelle "+prenom+" "+nom+" et j'ai "+age+" ans");
    }

    public void feterAnniversaire() {
        if (age < 17) {
            age++;
        }
    }

    @Override
    public String toString() {
           return prenom +" "+nom+" "+age+" ans";
    }
}
