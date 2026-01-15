package com.mns.cda.banque.compte;

import java.time.LocalDate;

public abstract class Compte {
    private LocalDate dateOuverture;
    private double solde;
    private Iban iban;
    protected Integer compteur = 0;

    public Compte(double montant, String banqueId, String codeClient) {
        this.solde = montant;
        this.dateOuverture = LocalDate.now();
        compteur += 1;
        String compteId = compteur.toString();
        this.iban = new Iban(banqueId, codeClient, "generic", compteId);
    }

    public double consulterSolde() {
        return this.solde;
    }

    public boolean deposer(double montant) {
        if (montant <= 0) {
            return false;
        }
        this.solde += solde;
        return true;
    }

    public LocalDate getDateOuverture() {
        return this.dateOuverture;
    }

    protected double getSolde() {
        return this.solde;
    }

    protected void setSolde(double montant) {
        this.solde = montant;
    }

}
