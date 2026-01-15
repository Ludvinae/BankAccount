import com.mns.cda.banque.Ville;
import com.mns.cda.banque.personne.Personne;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        //Ville metz = new Ville("Metz");
        Ville.genererPersonnes();
        ArrayList<Personne> eligibles = new ArrayList<>(Ville.personnes.values());
        System.out.println(Ville.personnes);

        // boucle for each to iterate through hashmap to get a random personne
        //Ville.personnes.forEach((id, personne) -> );

        int index = (int) (Math.random() * eligibles.size());
        Personne fondateur = eligibles.remove(index);
        fondateur.fonderBanque("Banque Populaire", "abcde");
        System.out.println(Ville.banques.values());


    }
}
