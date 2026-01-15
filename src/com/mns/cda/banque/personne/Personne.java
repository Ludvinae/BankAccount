package com.mns.cda.banque.personne;

import com.mns.cda.banque.Banque;
import com.mns.cda.banque.Utils;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    protected List<Role> roles;
    protected String id;

    public Personne(String nom, String prenom, String adresse) {
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
        this.id = Utils.generateCode(nom + prenom);
        this.roles = new ArrayList<>();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

    // doit appliquer le role directeur
    public void fonderBanque(String nom, String password) {


        Banque banque = new Banque(nom, this);
        String banqueId = banque.getBanqueId();
        Directeur directeur = new Directeur(password, banqueId);
        this.roles.add(directeur);

    }

    public void devenirClient(String banqueId, double montant) {
        if (montant <= 0) {
            return;
        }
        Client client = new Client(banqueId);
        client.ouvrirCompteCourant(montant, banqueId);
    }
}
