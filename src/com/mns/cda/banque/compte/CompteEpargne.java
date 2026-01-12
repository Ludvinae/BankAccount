package com.mns.cda.banque.compte;

public class CompteEpargne extends Compte implements IRetrait{

    protected double TAUX_INTERET = 0.025;

    public CompteEpargne(double montant) {
        super(montant);
    }


    @Override
    public boolean retirer(double montant) {
        double solde = this.getSolde();
        if (solde < montant) {
            return false;
        }
        this.setSolde(solde - montant);
        return true;
    }

    public void appliquerInterets() {
        double solde = getSolde();
        this.setSolde(solde + (solde * TAUX_INTERET));
    }
}
