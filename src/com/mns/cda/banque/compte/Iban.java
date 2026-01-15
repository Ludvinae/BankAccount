package com.mns.cda.banque.compte;

public class Iban {
    private String banqueId;
    private String codeClient;
    private String typeCompte;
    private String compteId;

    public Iban(String banqueId, String codeClient, String typeCompte, String compteId) {
        this.banqueId = banqueId;
        this.codeClient  = codeClient;
        this.typeCompte = typeCompte;
        this.compteId = compteId;
    }

    public String getBanqueId() {
        return banqueId;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public String getCompteId() {
        return compteId;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    @Override
    public String toString() {
        return banqueId + codeClient + typeCompte + typeCompte;
    }
}
