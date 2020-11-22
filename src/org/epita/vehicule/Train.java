package org.epita.vehicule;

public class Train extends Vehicule {
    public Train()  {
        super(100);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        System.out.println(" Tchoo tchoo");
    }
}
