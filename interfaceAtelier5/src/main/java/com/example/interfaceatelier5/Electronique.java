package com.example.interfaceatelier5;

// Classe dérivée Electronique
class Electronique extends Produit {
    private String marque;
    private String modele;

    public Electronique(int id, String nom, int quantite, String marque, String modele) {
        super(id, nom, quantite);
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }
}





