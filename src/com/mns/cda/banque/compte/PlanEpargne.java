package com.mns.cda.banque.compte;

import com.mns.cda.banque.personne.Client;

import java.time.LocalDate;

public class PlanEpargne extends Compte implements IRetrait{

    public PlanEpargne(double montant, String banqueId, String codeClient) {
        super(montant, banqueId, codeClient);
    }

    @Override
    public boolean retirer(double montant) {
        return false;
    }

    public void depotAuto(Client client, double montant) {
        LocalDate now = LocalDate.now();
        Compte compte = client.getCompte("courant");
        if (now.getDayOfMonth() == 1) {
            String message = client.transfert(compte, this, montant);
            System.out.println(message);
        }
    }

    public void cloturer(Client client) {
        Compte compte = client.getCompte("courant");
        double montant = this.consulterSolde();
        compte.deposer(montant);
        this.setSolde(0);
        client.fermerComptes("plan");
    }
}
