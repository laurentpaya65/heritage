package org.epita.exception;

public class NegatifException extends RuntimeException{
    public NegatifException() {
        System.out.println("nombre négatif");
    }

    public NegatifException(String message) {
        super("nombre négatif"+message);
    }
}
