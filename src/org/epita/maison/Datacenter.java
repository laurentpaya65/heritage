package org.epita.maison;

public class Datacenter extends Temperature implements Climatisable {
    public Datacenter(int temperature) {
        super(temperature);
    }

    @Override
    public void refroidir() {
        temperature = 20;
    }

    @Override
    public String toString() {
        return "Datacenter{" +
                "temperature=" + temperature +
                '}';
    }
}
