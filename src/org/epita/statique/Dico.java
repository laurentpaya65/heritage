package org.epita.statique;

public class Dico {
    private static Dico dico = new Dico();
    private String nom;

    private Dico() {
        this.nom ="Larousse";
    }

    public static Dico getDico() {
        return dico;
    }

    @Override
    public String toString() {
        return "Dico{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
