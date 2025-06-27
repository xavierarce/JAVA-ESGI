package tpbibliotheque;

import java.util.*;

public class Bibliotheque {

    private Map<String, Livre> livres;
    private Map<String, List<Livre>> livresParAuteur;
    private Map<String, Emprunt> emprunts;

    public Bibliotheque() {
        this.livres = new HashMap<>();
        this.livresParAuteur = new HashMap<>();
        this.emprunts = new HashMap<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.put(livre.getIsbn(), livre);
        livresParAuteur
            .computeIfAbsent(livre.getAuteur(), k -> new ArrayList<>())
            .add(livre);
    }

    public Livre rechercherParIsbn(String isbn) {
        return livres.get(isbn);
    }

    public List<Livre> rechercherParAuteur(String auteur) {
        return livresParAuteur.getOrDefault(auteur, new ArrayList<>());
    }

    public boolean emprunterLivre(String isbn, String nomUtilisateur, int dureeJours) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println(" Livre introuvable.");
            return false;
        }

        if (livre.isDisponible()) {
            Emprunt emprunt = new Emprunt(livre, dureeJours);
            emprunts.put(nomUtilisateur, emprunt);
            livre.setDisponible(false);
            System.out.println(" Livre emprunté par " + nomUtilisateur);
            return true;
        } else {
            if (!livre.estReserve()) {
                livre.reserverPour(nomUtilisateur);
                System.out.println(" Livre réservé pour " + nomUtilisateur);
            } else {
                System.out.println(" Livre déjà réservé par " + livre.getUtilisateurReserve());
            }
            return false;
        }
    }

    public void rendreLivre(String nomUtilisateur) {
        Emprunt emprunt = emprunts.get(nomUtilisateur);
        if (emprunt == null) {
            System.out.println(" Aucun emprunt trouvé pour " + nomUtilisateur);
            return;
        }

        emprunt.rendreLivre();
        Livre livre = emprunt.getLivre();

        if (emprunt.estEnRetard()) {
            System.out.println(" Retard de " + emprunt.joursDeRetard() + " jour(s) !");
        } else {
            System.out.println(" Livre rendu à temps.");
        }

        livre.setDisponible(true);

        if (livre.estReserve()) {
            System.out.println(" Le livre est réservé pour : " + livre.getUtilisateurReserve());
            
        }

        emprunts.remove(nomUtilisateur);
    }
}
