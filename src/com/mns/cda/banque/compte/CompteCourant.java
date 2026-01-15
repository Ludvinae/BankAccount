package com.mns.cda.banque.compte;

public class CompteCourant extends Compte implements IRetrait{
    final int DECOUVERT = 1000;
    boolean bloquer = false;

    public CompteCourant(double montant, String banqueId, String codeClient) {
        super(montant, banqueId, codeClient);
    }

    @Override
    public boolean deposer(double montant) {
        if (montant <= 0) {
            return false;
        }
        double solde = getSolde();
        setSolde(solde + montant);
        if (bloquer) {
            if (getSolde() > -DECOUVERT) {
                bloquer = false;
            }
        }
        return true;
    }

    @Override
    public boolean retirer(double montant) {
        if (bloquer || montant <= 0) {
            return false;
        }
        double solde = this.getSolde();
        this.setSolde(solde - montant);
        if (this.getSolde() < -DECOUVERT) {
            bloquer = true;
        }
        return true;
    }


}
