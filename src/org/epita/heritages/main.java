package org.epita.heritages;

public class main {
    public static void main(String[] args) {
        Enfant olivier = new Enfant("DUPOND","olivier");
        PetitEnfant petitOlivier = new PetitEnfant("MARTN","Jeannette");
        Enfant jean = petitOlivier;

        System.out.println(olivier.petitNom+" "+olivier.getClass());
        System.out.println(petitOlivier.petitNom);
        System.out.println(jean.petitNom+" "+jean.getClass());
        System.out.println(jean == petitOlivier);

        System.out.println(olivier.getPetitNom());
        System.out.println(petitOlivier.getPetitNom());
        System.out.println(jean.getPetitNom());

//        Enfant charlotte = new Enfant("MARTIN", "Charlotte");
//        Enfant david = new Enfant("GINOU" , "David");
//
//        olivier.feterAnniversaire();
//        olivier.feterAnniversaire();
//        charlotte.feterAnniversaire();
//        System.out.println(olivier);
//        System.out.println(charlotte);
//
//        charlotte.joueAuBallon(olivier);
//
//        charlotte.tomberAmoureux(olivier);
//        olivier.tomberAmoureux(charlotte);
//
//        charlotte.presentation();
//        System.out.println(charlotte.estAmoureux());
//
//        olivier.presentation();
//        System.out.println(olivier.estAmoureux());
//
//        david.presentation();
//        System.out.println(david.estAmoureux());

    }
}

