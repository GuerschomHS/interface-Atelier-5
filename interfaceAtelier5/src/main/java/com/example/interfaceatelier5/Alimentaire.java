package com.example.interfaceatelier5;

// Classe dérivée Alimentaire
class Alimentaire extends Produit {
    private final String dateExpiratio1n;
    private String dateExpiration;

    public Alimentaire(int id, String nom, int quantite, String dateExpiration) {
        super(id, nom, quantite);
        this.dateExpiratio1n = dateExpiration;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }
}





