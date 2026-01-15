package com.mns.cda.banque.personne;

import com.mns.cda.banque.Banque;
import com.mns.cda.banque.Ville;
import com.mns.cda.banque.compte.Compte;

import java.util.UUID;

public class Salarie extends Role{

    private String password;


    public Salarie(String password, String banqueId) {
        super(banqueId);
        this.password = password;

    }

    public String getPassword() {
        return this.password;
    }

    public Compte accederCompte(String password, String numeroCompte) {
        if (getPassword() != password) {
            return null;
        }
        Banque banque = Ville.banques.get(this.getBanqueId());
        return banque.getComptes().get(numeroCompte);
    }

}
