import JeuDeCartes.*;

public class App {
  public static void main(String[] args) {
    Carte[] main = new Carte[3];
    main[0] = new CarteChiffre("Cœur", 7);
    main[1] = new CarteSpecial("Joker", "Change la couleur");
    main[2] = new CarteChiffre("Pique", 1);

    for (Carte c : main) {
      c.jouer();
      System.out.println(c);
    }

    // Test equals
    Carte c1 = new CarteChiffre("Cœur", 7);
    Carte c2 = new CarteChiffre("Cœur", 7);
    Carte c3 = new CarteChiffre("Pique", 1);
    Carte c4 = new CarteSpecial("Joker", "Change la couleur");
    Carte c5 = new CarteSpecial("Joker", "Change la couleur");
    Carte c6 = new CarteSpecial("Joker", "Bloque le joueur");

    System.out.println("\nTesting equals:");

    System.out.println("c1 equals c2? " + c1.equals(c2));
    System.out.println("c1 equals c3? " + c1.equals(c3));
    System.out.println("c4 equals c5? " + c4.equals(c5));
    System.out.println("c4 equals c6? " + c4.equals(c6));
  }
}
