package org.epita.vehicule;

public class Velo extends Vehicule {
    public Velo( ) {
        super(2);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        System.out.println("");
    }
}
