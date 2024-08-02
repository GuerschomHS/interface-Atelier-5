package com.example.interfaceatelier5;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class HelloController{
    @FXML
    private TextField productIdField;

    @FXML
    private Button btnAddProduct;
    @FXML
    private Button btnRemoveProduct;
    @FXML
    private Button btnModifyProduct;
    @FXML
    private Button btnSearchProduct;
    @FXML
    private Button btnListProducts;
    @FXML
    private Button btnProductCount;
    @FXML
    private Button btnStockValue;
    @FXML
    private Button btnQuit;

    @FXML
    private TextField productTypeField;

    @FXML
    private TextField productNameField;
    @FXML
    private TextField productQuantityField;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Button source = (Button) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        Parent newRoot = null;

        if (source == btnAddProduct) {
            newRoot = FXMLLoader.load(getClass().getResource("ajouterProduit.fxml"));
        } else if (source == btnRemoveProduct) {
            newRoot = FXMLLoader.load(getClass().getResource("supprimerProdut.fxml"));
        } else if (source == btnModifyProduct) {
            newRoot = FXMLLoader.load(getClass().getResource("ModifyProduct.fxml"));
        } else if (source == btnSearchProduct) {
            newRoot = FXMLLoader.load(getClass().getResource("SearchProduct.fxml"));
        } else if (source == btnListProducts) {
            newRoot = FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
        } else if (source == btnProductCount) {
            newRoot = FXMLLoader.load(getClass().getResource("ProductCount.fxml"));
        } else if (source == btnStockValue) {
            newRoot = FXMLLoader.load(getClass().getResource("StockValue.fxml"));
        } else if (source == btnQuit) {
            stage.close();
        }

        if (newRoot != null) {
            stage.setScene(new Scene(newRoot));
        }
    }
    @FXML
    private void handleAddProduct(ActionEvent event) {


        // Récupérer les informations du produit
        String typeProduit =productTypeField.getText();
        String idString = productIdField.getText();
        String nom = productNameField.getText();
        String quantiteString = productQuantityField.getText();

        try {
            int id = Integer.parseInt(idString);
            int quantite = Integer.parseInt(quantiteString);

            // Afficher un message ou traiter les informations du produit
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Produit Ajouté");
            alert.setHeaderText(null);
            alert.setContentText("Produit ajouté : \nType : " + typeProduit + "\nID : " + id + "\nNom : " + nom + "\nQuantité : " + quantite);
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez entrer des valeurs numériques valides pour l'ID et la quantité.");
            alert.showAndWait();
        }
    }

    @FXML
    private void handleBackToMenu(ActionEvent event) throws Exception {
        Parent menuRoot = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(menuRoot, 300, 400));
    }



    @FXML
    private void handleDeleteProduct(ActionEvent event) {
        try {
            // Récupérer l'ID du produit depuis le champ de texte
            int idSuppression = Integer.parseInt(productIdField.getText().trim());

            // Supposer que vous avez des classes de gestion pour supprimer le produit
            Magasin magasin = new Magasin();
            GestionDB gestionDB = new GestionDB();

            // Appel aux méthodes pour supprimer le produit
            magasin.supprimerProduit(idSuppression);
            gestionDB.deleteProduit(idSuppression);

            // Afficher un message de succès
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Succès");
            alert.setHeaderText(null);
            alert.setContentText("Produit supprimé avec succès !");
            alert.showAndWait();

        } catch (NumberFormatException e) {
            // Afficher un message d'erreur si l'ID n'est pas un nombre valide
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez entrer un ID valide.");
            alert.showAndWait();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

