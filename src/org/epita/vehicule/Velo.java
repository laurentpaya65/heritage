package org.epita.vehicule;

public class Velo extends Vehicule {
    public Velo( ) {
        super(2);
    }

    public Velo(int nombreDeRoues) {
        super(nombreDeRoues);
    }

    public Velo(int nombreDeRoues, String nom) {
        super(nombreDeRoues, nom);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        System.out.println("");
    }
}
