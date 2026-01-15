package com.mns.cda.banque.compte;

public class CompteEpargne extends Compte implements IRetrait{

    protected double TAUX_INTERET = 0.025;
    private Iban iban;

    public CompteEpargne(double montant, String banqueId, String codeClient) {
        super(montant, banqueId, codeClient);
        this.iban = new Iban(banqueId, codeClient, "epargne", this.getCompteId());
    }

    public Iban getIban() {
        return iban;
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
