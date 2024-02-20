package fr.eni.encheres.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestBO {

    public static void main(String[] args) {
        List<ArticleVendu> articles = null;
        try {
            articles = new ArrayList<ArticleVendu>();
            // Test des constructeurs principaux
            Utilisateur utilisateur = new Utilisateur(1, "pseudo", "nom", "prenom", "email", "telephone", "rue", "codePostal", "ville", "motDePasse", 100, false);
            System.out.println("\nREM : Affichage d'un utilisateur");
            System.out.println(utilisateur);
            System.out.println("---------------------------------------------------------------");
            Categorie categorie = new Categorie(1, "libelle");
            System.out.println("\nREM : Affichage d'une catégorie");
            System.out.println(categorie);
            System.out.println("---------------------------------------------------------------");
            ArticleVendu articleVendu = new ArticleVendu(1, "nomArticle", "description", LocalDate.now(), LocalDate.now(), 10, 20, 1, utilisateur, categorie);
            System.out.println("\nREM : Affichage d'un article vendu");
            System.out.println(articleVendu);

            // Test d'un article avec retrait
            Retrait retrait = new Retrait("rue", "codePostal", "ville");
            articleVendu.setRetrait(retrait);
            System.out.println("\nREM : Affichage d'un article vendu avec retrait");
            System.out.println(articleVendu.toString2());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
