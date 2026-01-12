package com.mns.cda.banque.compte;

import java.time.LocalDate;

public abstract class Compte {
    private LocalDate dateOuverture;
    private double solde;

    public Compte(double montant) {
        this.solde = montant;
        this.dateOuverture = LocalDate.now();
    }

    public double consulterSolde() {
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

    protected double getSolde() {
        return this.solde;
    }

    protected void setSolde(double montant) {
        this.solde = montant;
    }

}
