package com.example.interfaceatelier5;

// Classe de base Produit
class Produit {
    protected int id;
    protected String nom;
    protected int quantite;

    public Produit(int id, String nom, int quantite) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}





