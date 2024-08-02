package com.example.interfaceatelier5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionDB {
    private Connection connection;

    public GestionDB() throws SQLException {
        this.connection = DatabaseSingleton.getInstance().getConnection();
    }

    public void createTableProduit() throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS produit (" +
                "id INT PRIMARY KEY, " +
                "nom VARCHAR(255), " +
                "quantite INT, " +
                "type_produit VARCHAR(255)" +
                ")";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(createTableSQL);
            stmt.close();
            System.out.println("Table 'produit' created.");
        }
    }

    public void insertProduit(Produit produit) throws SQLException {
        String insertSQL = "INSERT INTO produit (nom, quantite) VALUES (?,?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, produit.getNom());
            pstmt.setInt(2, produit.getQuantite());
            pstmt.executeUpdate();
            System.out.println("Produit inserted.");
        }
    }

    public void updateProduit(Produit produit) throws SQLException {
        String updateSQL = "UPDATE produit SET quantite =? WHERE id =?";
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setInt(1, produit.getQuantite());
            pstmt.setInt(2, produit.getId());
            pstmt.executeUpdate();
            System.out.println("Produit updated.");
        }
    }

    public void deleteProduit(int id) throws SQLException {
        String deleteSQL = "DELETE FROM produit WHERE id =?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Produit deleted.");
        }
    }

    public Produit getProduit(int id) throws SQLException {
        String selectSQL = "SELECT * FROM produit WHERE id =?";
        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Produit produit = new Produit(rs.getInt("id"), rs.getString("nom"), rs.getInt("quantite"));
                    return produit;
                } else {
                    return null;
                }
            }
        }
    }

    public List<Produit> getAllProduits() throws SQLException {
        String selectSQL = "SELECT * FROM produit";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            List<Produit> produits = new ArrayList<>();
            while (rs.next()) {
                Produit produit = new Produit(rs.getInt("id"), rs.getString("nom"), rs.getInt("quantite"));
                produits.add(produit);
            }
            return produits;
        }
    }
}