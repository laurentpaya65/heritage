package org.epita.heritages;

public class PetitEnfant extends Enfant {
     String petitNom = "je suis petit Enfant";

    public PetitEnfant(String nom, String prenom) {
        super(nom, prenom);

    }

    @Override
    public String getPetitNom() {
        return petitNom;
    }


}
