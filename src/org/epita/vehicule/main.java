package org.epita.vehicule;
 import java.util.*;
 import java.text.*;

public class main {
    public static void main(String[] args) {
        Velo velo = new Velo();
        velo.direBonjour();

        Train train = new Train();
        train.direBonjour();
        System.out.println(train.getClass());

        System.out.println("test equals");
        Vehicule vehicule = new Vehicule(3,"tricycle");
        Velo velo1 = new Velo(3,"tricycle");

        System.out.println(vehicule.equals(velo1));

        System.out.println(velo1);
    }
}
