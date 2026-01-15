package com.mns.cda.banque;

import com.mns.cda.banque.personne.Personne;

import java.util.HashMap;


public class Ville {
    public static HashMap<String, Banque> banques = new HashMap<>();
    public static HashMap<String, Personne> personnes = new HashMap();
    public String nom;

    public Ville(String nom) {
        this.nom = nom;
    }

    public static void addBanque(String banqueId, Banque banque) {
        banques.put(banqueId, banque);
    }



    public static void genererPersonnes() {
        String[] noms = {
                "Martin", "Bernard", "Dubois", "Thomas", "Robert",
                "Richard", "Petit", "Durand", "Leroy", "Moreau"
        };

        String[] prenoms = {
                "Lucas", "Emma", "Louis", "Chloé", "Hugo",
                "Léa", "Noah", "Camille", "Jules", "Manon"
        };

        String[] rues = {
                "rue de la Paix", "avenue Victor Hugo", "boulevard Voltaire",
                "rue Nationale", "rue des Lilas", "avenue de la République"
        };

        for (int i = 0; i < 50; i++) {

            String nom = noms[(int) (Math.random() * noms.length)];
            String prenom = prenoms[(int) (Math.random() * prenoms.length)];

            int numeroRue = 1 + (int) (Math.random() * 200);
            String rue = rues[(int) (Math.random() * rues.length)];

            String adresse = numeroRue + " " + rue;
            String id = Utils.generateCode(nom + prenom);

            personnes.put(id, new Personne(nom, prenom, adresse));
            //personnes.add(new Personne(nom, prenom, adresse));
        }
    }

}
