package com.mns.cda.banque.personne;

import com.mns.cda.banque.compte.*;

import java.util.HashMap;

public class Client extends Role{
    protected String numero;
    protected HashMap<String, Compte> comptes;
    private static Integer compteur = 0;


    public Client(String banqueId, String personneId) {
        super(banqueId, personneId);
        this.comptes = new HashMap<>();
        compteur += 1;
        this.numero = compteur.toString();
    }

    public String getNumero() {
        return numero;
    }

    public Compte getCompte(String type) {
        return comptes.get(type);
    }

    public boolean fermerComptes(String type) {
        if (!comptes.containsKey(type)) {
            return false;
        }
        Compte compte = getCompte(type);
        comptes.remove(type);
        return true;
    }

    public String transfert(Compte compte1, Compte compte2, double montant) {
        if (!comptes.containsValue(compte1)) {
            return "Pas de compte " + compte1 + "pour ce client";
        }
        if (!comptes.containsValue(compte2)) {
            return "Pas de compte " + compte2 + "pour ce client";
        }
        if (compte1.getClass() == PlanEpargne.class) {
            return "Opération impossible à partir d'un Plan Epargne";
        }
        if (montant <= 0) {
            return "Montant transféré doit être supérieur à 0";
        }
        if (compte1.consulterSolde() < montant) {
            return "Solde insuffisant";
        }

        ((IRetrait) compte1).retirer(montant);
        compte2.deposer(montant);
        return "Opération effectuée avec succes";

    }

    public boolean ouvrirCompteCourant(double montant, String banqueId) {
        if (comptes.containsKey("courant")) {
            return false;
        }
        this.comptes.put("courant", new CompteCourant(montant, banqueId, this.numero));
        return true;
    }

    public boolean ouvrirCompteEpargne(double montant, String banqueId) {
        if (comptes.containsKey("epargne")) {
            return false;
        }
        this.comptes.put("epargne", new CompteEpargne(montant, banqueId, this.numero));
        return true;
    }

    public boolean ouvrirPlandEpargne(double montant, String banqueId) {
        if (comptes.containsKey("plan")) {
            return false;
        }
        this.comptes.put("plan", new PlanEpargne(montant, banqueId, this.numero));
        return true;
    }



}
