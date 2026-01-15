package com.mns.cda.banque;

import com.mns.cda.banque.compte.Compte;
import com.mns.cda.banque.personne.Client;
import com.mns.cda.banque.personne.Personne;
import com.mns.cda.banque.personne.Salarie;

import java.util.*;

public class Banque {
    protected HashMap<String, Client> clients;
    protected List<Salarie> salaries;
    protected HashMap<String, Compte> comptes;
    protected String nom;
    protected Personne fondateur;
    protected String banqueId;

    public Banque(String nom, Personne fondateur) {
        this.clients = new HashMap<>();
        this.salaries = new ArrayList<>();
        this.comptes = new HashMap<>();

        this.nom = nom;
        this.fondateur = fondateur;
        this.banqueId = Utils.generateCode(nom);
        Ville.addBanque(this.banqueId, this);
    }

    public String getNom() {
        return nom;
    }

    public String getBanqueId() {
        return banqueId;
    }

    public HashMap<String, Compte> getComptes() {
        return comptes;
    }

    @Override
    public String toString() {
        return this.nom + " : " + this.clients.size() + " clients, fondé par " + this.fondateur;
    }


    public void ajouterClient(String numero, Client client) {
        clients.put(numero, client);
    }
}
