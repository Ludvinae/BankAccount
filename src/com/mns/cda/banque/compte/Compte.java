package com.mns.cda.banque.compte;

import java.time.LocalDate;

public abstract class Compte {
    private LocalDate dateOuverture;
    private double solde;
    protected Integer compteur = 0;
    private String compteId;

    public Compte(double montant, String banqueId, String codeClient) {
        this.solde = montant;
        this.dateOuverture = LocalDate.now();
        compteur += 1;
        compteId = compteur.toString();
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

    public String getCompteId() {
        return compteId;
    }
}
