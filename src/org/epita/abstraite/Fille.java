package org.epita.abstraite;

public class Fille extends MereAbstraite{
    @Override
    void gronder() {
        System.out.println("mamam gronde");
    }

    @Override
    void commande() {
        super.commande();
    }
}
