package org.epita.vehicule;

public class Vehicule {
    private int nombreDeRoues;

    public Vehicule(int nombreDeRoues) {
        this.nombreDeRoues = nombreDeRoues;
    }

    public void direBonjour() {
        System.out.print("Bonjour je suis un véhicule à "+nombreDeRoues+" roues");
    }

    @Override
    public String toString() {
        return "Vehicule";
    }
}
