package org.epita.maison;

public class Maison extends Temperature implements Chauffable,Climatisable {
//    private int temperature;

    public Maison(int temperature) {
        super(temperature);
    }

    @Override
    public void chauffer() {
        temperature++;
    }
    @Override
    public void refroidir() {
        temperature--;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "temperature=" + temperature +
                '}';
    }
}
