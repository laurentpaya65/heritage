package org.epita.exception;

public class FactorielleException extends RuntimeException{
    public FactorielleException() {
        System.out.println("calclul incohérent");
    }

    public FactorielleException(String message) {
        super("calcul inoherent"+message);
    }
}
