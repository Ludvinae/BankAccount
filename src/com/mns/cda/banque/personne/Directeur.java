package com.mns.cda.banque.personne;

import com.mns.cda.banque.Banque;

import java.util.UUID;

public class Directeur extends Salarie{
    public Directeur(String password, String banqueId, String personneId) {
        super(password, banqueId, personneId);
    }
}
