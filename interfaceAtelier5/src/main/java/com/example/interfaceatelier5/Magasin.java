package com.example.interfaceatelier5;

import java.util.HashMap;
import java.util.Map;

class Magasin {
    Map<Integer, Produit> produits;

    public Magasin() {
        produits = new HashMap<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.put(produit.getId(), produit);
    }

    public void supprimerProduit(int id) {
        produits.remove(id);
    }

    public void modifierProduit(int id, Produit nouveauProduit) {
        produits.put(id, nouveauProduit);
    }

    public Produit rechercherProduit(String nom) {
        for (Produit produit : produits.values()) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        return null;
    }

    public void listerProduits() {
        System.out.println("Produits Electroniques :");
        for (Produit produit : produits.values()) {
            if (produit instanceof Electronique) {
                Electronique electronique = (Electronique) produit;
                System.out.println("ID : " + electronique.getId());
                System.out.println("Nom : " + electronique.getNom());
                System.out.println("Quantité : " + electronique.getQuantite());
                System.out.println("Marque : " + electronique.getMarque());
                System.out.println("Modèle : " + electronique.getModele());
                System.out.println();
            }
        }

        System.out.println("Produits Alimentaires :");
        for (Produit produit : produits.values()) {
            if (produit instanceof Alimentaire) {
                Alimentaire alimentaire = (Alimentaire) produit;
                System.out.println("ID : " + alimentaire.getId());
                System.out.println("Nom : " + alimentaire.getNom());
                System.out.println("Quantité : " + alimentaire.getQuantite());
                System.out.println("Date d'expiration : " + alimentaire.getDateExpiration());
                System.out.println();
            }
        }

        System.out.println("Produits Vestimentaires :");
        for (Produit produit : produits.values()) {
            if (produit instanceof Vestimentaire) {
                Vestimentaire vestimentaire = (Vestimentaire) produit;
                System.out.println("ID : " + vestimentaire.getId());
                System.out.println("Nom : " + vestimentaire.getNom());
                System.out.println("Quantité : " + vestimentaire.getQuantite());
                System.out.println("Taille : " + vestimentaire.getTaille());
                System.out.println("Couleur : " + vestimentaire.getCouleur());
                System.out.println();
            }
        }
    }

    public int getNombreProduits() {
        return produits.size();
    }


    public double valeurTotalDuStock() {
        double valeurTotal = 0;
        for (Produit produit : produits.values()) {
            // Ici, vous devez définir le prix de chaque type de produit
            // Pour l'exemple, je suppose que le prix est égal à la quantité
            valeurTotal += produit.getQuantite() * produit.getQuantite();
        }
        return valeurTotal;
    }
}