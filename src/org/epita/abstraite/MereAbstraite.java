package org.epita.abstraite;

public abstract class MereAbstraite {
    String nom;

    abstract void gronder() ;

    void commande() {
        System.out.println("fait cela");
    }
}
