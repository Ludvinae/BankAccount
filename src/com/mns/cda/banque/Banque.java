package com.mns.cda.banque;

import com.mns.cda.banque.personne.Personne;

import java.util.ArrayList;
import java.util.Date;

public class Banque {
    protected List<Client> clients;
    protected List<Salarie> salaries;
    protected String nom;
    protected Personne directeur;

    public Banque(String nom, Personne directeur) {
        clients = new ArrayList<>();
        salaries = new ArrayList<>();
        this.nom = nom;
        this.directeur = directeur;
    }
}
