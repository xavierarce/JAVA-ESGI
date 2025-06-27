package Bibliotheque;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Emprunt {

    private final Livre livre;
    private final LocalDate dateEmprunt;
    private final LocalDate dateRetour;
    private LocalDate dateRetourReelle;

    public Emprunt(Livre livre, int dureeJours) {
        this.livre = livre;
        this.dateEmprunt = LocalDate.now();
        this.dateRetour = dateEmprunt.plusDays(dureeJours);
        this.dateRetourReelle = null;
    }

    public void rendreLivre() {
        this.dateRetourReelle = LocalDate.now();
    }

    public boolean estEnRetard() {
        if (dateRetourReelle == null)
            return false;
        return dateRetourReelle.isAfter(dateRetour);
    }

    public long joursDeRetard() {
        if (!estEnRetard())
            return 0;
        return ChronoUnit.DAYS.between(dateRetour, dateRetourReelle);
    }

    public Livre getLivre() {
        return livre;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public LocalDate getDateRetourReelle() {
        return dateRetourReelle;
    }
}
