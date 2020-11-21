package org.epita.heritages;

public class Enfant {
    private String nom;
    private String prenom;
    private int age;
    private Enfant amoureux;
     String petitNom = "je suis Enfant";

    public String getPetitNom() {
        return petitNom;
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
