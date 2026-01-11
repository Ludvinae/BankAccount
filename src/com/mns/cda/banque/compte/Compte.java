package com.mns.cda.banque.compte;

import java.time.LocalDate;

public abstract class Compte {
    private LocalDate dateOuverture;
    private float solde;

    public Compte(float montant) {
        this.solde = montant;
        this.dateOuverture = LocalDate.now();
    }

    public float consulterSolde() {
        return this.solde;
    }

    public boolean deposer(float montant) {
        if (montant <= 0) {
            return false;
        }
        this.solde += solde;
        return true;
    }

    public LocalDate getDateOuverture() {
        return this.dateOuverture;
    }

    protected float getSolde() {
        return this.solde;
    }

    protected void setSolde(float montant) {
        this.solde = montant;
    }

}
