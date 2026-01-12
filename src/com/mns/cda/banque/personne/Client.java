package com.mns.cda.banque.personne;

import com.mns.cda.banque.Banque;
import com.mns.cda.banque.compte.Compte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Client{
    protected UUID numero;
    protected HashMap<String, Compte> comptes;


    public Client(Banque banque) {
        this.comptes = new HashMap<>();
        this.numero = UUID.randomUUID();
        banque.ajouterClient(this.numero, this);
    }

    public UUID getNumero() {
        return numero;
    }

    public void ajouterCompte(String nomBanque, Compte compte) {
        this.comptes.put(nomBanque, compte);
    }




}
