package com.mns.cda.banque.personne;

import com.mns.cda.banque.Banque;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;

    public Personne(String nom, String prenom, String adresse) {
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
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

    // doit appliquer le role directeur
    public void fonderBanque(String nom) {
        Banque banque = new Banque(nom, this);
    }

    public void devenirClient(Banque banque) {

    }
}
