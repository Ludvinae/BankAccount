package com.mns.cda.banque.personne;


public abstract class Role {
    private String banqueId;

    public Role(String banqueId) {
        this.banqueId = banqueId;
    }

    public String getBanqueId() {
        return banqueId;
    }
}
