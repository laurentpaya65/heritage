package org.epita.vehicule;

public class main {
    public static void main(String[] args) {
        Velo velo = new Velo();
        velo.direBonjour();

        Train train = new Train();
        train.direBonjour();
        System.out.println(train.getClass());

        Vehicule vehicule = new Vehicule(4);
        Vehicule vehicule1  = new Vehicule(5);
        System.out.println(vehicule.toString().equals(vehicule1.toString()));

        String[] s1 ={"A","B"};
        String s = "A";
        System.out.println("String= "+ (s1[0]==s)+" ou "+s1[0].equals(s));
    }
}
