package com.mns.cda.banque.compte;

public class CompteCourant extends Compte implements IRetrait{
    final int DECOUVERT = 1000;
    boolean bloquer = false;

    public CompteCourant(double montant) {
        super(montant);
    }


    @Override
    public boolean retirer(double montant) {
        if (bloquer) {
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
