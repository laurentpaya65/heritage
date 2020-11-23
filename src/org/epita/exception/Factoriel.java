package org.epita.exception;

public class Factoriel {
    public int factoriel(int n)  {
        if (n<0) {
            throw new NegatifException(" pour "+n);
        }
        int fact = 1;
        int factPrec;
        for (int i = 0; i < n; i++) {
            factPrec=fact;
            fact=fact*(i+1);
            if (fact/(i+1) != factPrec) {
                throw new FactorielleException(" "+(new Formatage()).nf.format(fact)+ " pour "+n);
            }
        }
        return fact;
    }
}
