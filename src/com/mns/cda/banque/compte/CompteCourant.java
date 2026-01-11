package com.mns.cda.banque.compte;

public class CompteCourant extends Compte implements IRetrait{
    final int DECOUVERT = 1000;

    public CompteCourant(float montant) {
        super(montant);
    }



    @Override
    public boolean retirer(float montant) {
        float solde = this.getSolde();
        if (solde + DECOUVERT < montant) {
            return false;
        }
        this.setSolde(solde - montant);
        return true;
    }
}
