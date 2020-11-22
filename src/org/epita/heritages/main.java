package org.epita.heritages;

public class main {
    public static void main(String[] args) {
        Enfant olivier = new Enfant("DUPOND","olivier");
        PetitEnfant petitOlivier = new PetitEnfant("MARTN","Jeannette");
        Enfant jean = petitOlivier;

        olivier.feterAnniversaire();
        olivier.feterAnniversaire();
        olivier.feterAnniversaire();

        Enfant olivier2 = null;
        try {
            olivier2 = (Enfant) olivier.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        olivier2.presentation();
        System.out.println(olivier.equals(olivier2));

//        System.out.println(olivier2.petitNom);
//        System.out.println(olivier.hashCode()+" et "+olivier2.hashCode());

        olivier.feterAnniversaire();
        System.out.println(olivier.equals(olivier2));

//        commentaire depuis heritage2 à 14:08
//        System.out.println(olivier.petitNom+" "+olivier.getClass());
//        System.out.println(petitOlivier.petitNom);
//        System.out.println(jean.petitNom+" "+jean.getClass());
//        System.out.println(jean == petitOlivier);
//        System.out.printf("petitolivier HashCode="+petitOlivier.hashCode());
//        System.out.printf("jean HashCode="+jean.hashCode());
//        System.out.println(jean.equals(petitOlivier));
//
//        System.out.println(olivier.getPetitNom());
//        System.out.println(petitOlivier.getPetitNom());
//        System.out.println(jean.getPetitNom());

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

