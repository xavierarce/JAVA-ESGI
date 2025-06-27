package tpbibliotheque;

import java.time.*;

public class Reservation {

    private final Livre livre;
    private final LocalDate dateReservation;
    private final LocalDate dateRetour;

    public Reservation(Livre livre, int dureeJours) {
        this.livre = livre;
        this.dateReservation = LocalDate.now();
        this.dateRetour = dateReservation.plusDays(dureeJours);
    }

    public Livre getLivre() {
        return livre;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }
}
