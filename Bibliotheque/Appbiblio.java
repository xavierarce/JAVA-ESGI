package Bibliotheque;

public class Appbiblio {
  public static void main(String[] args) {
    Bibliotheque biblio = new Bibliotheque();

    Livre livre1 = new Livre("123", "1984", "George Orwell");
    Livre livre2 = new Livre("456", "Le Meilleur des Mondes", "Aldous Huxley");

    biblio.ajouterLivre(livre1);
    biblio.ajouterLivre(livre2);

    biblio.emprunterLivre("123", "Alice", 7);
    // test livre introuvable
    biblio.emprunterLivre("125", "Alice", 7);
    // déjà emprunter par alice
    biblio.emprunterLivre("123", "Bob", 7);

    biblio.emprunterLivre("123", "Charlie", 7);

    biblio.rendreLivre("Alice");
  }
}
