package org.epita.vehicule;

import java.util.Objects;

public class Vehicule {
    private int nombreDeRoues;
    private String nom;

    public Vehicule(int nombreDeRoues) {
        this.nombreDeRoues = nombreDeRoues;
    }

    public Vehicule(int nombreDeRoues, String nom) {
        this.nombreDeRoues = nombreDeRoues;
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        Vehicule vehicule = (Vehicule) o;
        return nombreDeRoues == vehicule.nombreDeRoues &&
                Objects.equals(nom, vehicule.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDeRoues, nom);
    }

    public void direBonjour() {

        System.out.print("Bonjour je suis un véhicule à "+nombreDeRoues+" roues");
    }

    @Override
    public String toString() {

        return "Bonjour je suis un véhicule à "+nombreDeRoues+" roues";
    }


}
