package Bibliotheque;

public class Livre {
    private final String isbn;
    private final String titre;
    private final String auteur;
    private boolean disponible;
    private String utilisateurReserve = null;

    public Livre(String isbn, String titre, String auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean estReserve() {
        return utilisateurReserve != null;
    }

    public String getUtilisateurReserve() {
        return utilisateurReserve;
    }

    public void reserverPour(String utilisateur) {
        this.utilisateurReserve = utilisateur;
    }

    public void annulerReservation() {
        this.utilisateurReserve = null;
    }
}
