import com.mns.cda.banque.Utils;
import com.mns.cda.banque.Ville;
import com.mns.cda.banque.compte.Compte;
import com.mns.cda.banque.compte.PlanEpargne;
import com.mns.cda.banque.personne.Client;
import com.mns.cda.banque.personne.Personne;
import com.mns.cda.banque.personne.Role;

import java.util.ArrayList;
import java.util.List;
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

        index = (int) (Math.random() * eligibles.size());
        Personne client = eligibles.get(index);
        String banqueId = Ville.banques.get(Utils.generateCode("Banque Populaire")).getBanqueId();
        client.devenirClient(banqueId, 500);
        System.out.println(client);
        List<Role> list = client.getRoles();
        Client role = null;
        String clientId = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass() == Client.class) {
                role = (Client) list.get(i);
            }
            if (role == null) {
                continue;
            }
            clientId = role.getNumero();
        }
        if (clientId != null) {
            PlanEpargne plan = new PlanEpargne(300, banqueId, clientId);
            System.out.println(plan);
        }


    }
}
