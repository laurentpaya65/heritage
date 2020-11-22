package org.epita.maison;

public class main {
    public static void main(String[] args) {
        Maison maison = new Maison(15);
        Datacenter datacenter = new Datacenter(25);

        System.out.println(maison);
        maison.chauffer();
        maison.chauffer();
        maison.chauffer();
        System.out.println(maison);
        maison.refroidir();
        System.out.println(maison);
        System.out.println("avec get "+maison.getTemperature());

        System.out.println(datacenter);
        datacenter.refroidir();
        System.out.println(datacenter);
        System.out.println("avec get "+datacenter.getTemperature());


    }
}
