package com.mns.cda.banque;

import com.mns.cda.banque.personne.Client;
import com.mns.cda.banque.personne.Personne;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class Banque {
    protected HashMap<UUID, Client> clients;
    protected List<Salarie> salaries;
    protected String nom;
    protected Personne directeur;

    public Banque(String nom, Personne directeur) {
        clients = new HashMap<>();
        salaries = new ArrayList<>();
        this.nom = nom;
        this.directeur = directeur;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterClient(UUID numero, Client client) {
        clients.put(numero, client);
    }
}
