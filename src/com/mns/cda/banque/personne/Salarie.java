package com.mns.cda.banque.personne;

import com.mns.cda.banque.compte.Compte;

import java.util.UUID;

public class Salarie {

    private String password;

    public Salarie(String password) {
        this.password = password;

    }

    public String getPassword() {
        return this.password;
    }

    public Compte accederCompte(String password, UUID numero) {
        if (getPassword() != password) {
            return null;
        }
        return
    }

}
