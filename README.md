

Description de l'Application
Application de Gestion de Produits

Cette application JavaFX est conçue pour gérer un inventaire de produits dans un magasin. Elle permet à l'utilisateur de réaliser diverses opérations sur les produits, telles que l'ajout, la suppression, la modification, la recherche, et l'affichage des produits en stock. L'application utilise une base de données pour la persistance des données et une interface graphique pour interagir avec l'utilisateur.

![interPrinc](https://github.com/user-attachments/assets/5d5daf98-7436-4e66-a51b-e27865283b5b)

Présentation Détaillée des Fonctionnalités
Ajout de Produit

![interQjout](https://github.com/user-attachments/assets/d7857a72-0e6e-44a8-9b5b-725b5a22db5d)

Fonctionnalité : Permet d'ajouter un nouveau produit à l'inventaire.
Détails : L'utilisateur saisit les informations du produit (type, ID, nom, quantité, etc.) dans des champs de texte. L'application crée un objet Produit correspondant et l'ajoute à la base de données ainsi qu'à l'inventaire interne.
Types de Produits : Electronique, Alimentaire, Vestimentaire.
Suppression de Produit

Fonctionnalité : Permet de supprimer un produit existant de l'inventaire.
Détails : L'utilisateur entre l'ID du produit à supprimer. L'application supprime le produit de la base de données et de l'inventaire interne.

![interSup](https://github.com/user-attachments/assets/bba0fde4-26ee-4277-a053-d943babbd685)

Modification de Produit

Fonctionnalité : Permet de modifier les détails d'un produit existant.
Détails : L'utilisateur saisit l'ID du produit à modifier, ainsi que les nouvelles informations (nom, quantité, etc.). L'application met à jour les informations du produit dans la base de données et dans l'inventaire interne.

![interModif](https://github.com/user-attachments/assets/812b0943-4ddf-47bd-8419-a57cca8fb5fb)

Recherche de Produit

Fonctionnalité : Permet de rechercher un produit par son nom.
Détails : L'utilisateur entre le nom du produit dans un champ de texte. L'application affiche les détails du produit correspondant si trouvé dans l'inventaire.

![interRech](https://github.com/user-attachments/assets/b99fb0a4-4d96-496c-a481-9c86b63cf259)

Liste des Produits

Fonctionnalité : Affiche une liste complète de tous les produits dans l'inventaire.
Détails : L'application génère une liste de tous les produits, classés par type, et l'affiche dans une fenêtre de dialogue.
Affichage du Nombre de Produits en Stock

Fonctionnalité : Affiche le nombre total de produits dans l'inventaire.
Détails : L'application calcule et affiche le nombre total de produits présents dans l'inventaire.
Affichage de la Valeur Totale du Stock

Fonctionnalité : Affiche la valeur totale des produits en stock.
Détails : L'application calcule la valeur totale en multipliant la quantité de chaque produit par son prix et affiche le total.
Retour au Menu Principal

Fonctionnalité : Permet de revenir au menu principal de l'application.
Détails : L'utilisateur peut revenir au menu principal à tout moment en utilisant cette fonctionnalité.


