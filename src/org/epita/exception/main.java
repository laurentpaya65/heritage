package org.epita.exception;

import java.text.NumberFormat;

public class main {
    public static void main(String[] args) {
//        NumberFormat nf = NumberFormat.getInstance();
        Formatage formatage = new Formatage();
        Factoriel facto = new Factoriel();

        try {
            System.out.println(formatage.nf.format(facto.factoriel(12)));
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(facto.factoriel(13));
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(facto.factoriel(14));
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(facto.factoriel(-15));
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
    }
}
