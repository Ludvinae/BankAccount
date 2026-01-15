package com.mns.cda.banque.personne;


public abstract class Role {
    private String banqueId;
    private String personneId;

    public Role(String banqueId, String personneId) {
        this.banqueId = banqueId;
        this.personneId = personneId;
    }

    public String getBanqueId() {
        return banqueId;
    }

    public String getPersonneId() {
        return personneId;
    }
}
