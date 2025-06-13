package JeuDeCartes;

public class CarteChiffre extends Carte {
  private final String couleur;

  public CarteChiffre(String couleur, int valeur) {
    super(valeur + " de " + couleur, valeur);
    this.couleur = couleur;
  }

  @Override
  public void jouer() {
    System.out.println("Je joue le " + nom);
  }

  @Override
  public String toString() {
    return "Carte Chiffre: " + super.toString() + ", couleur: " + couleur;
  }
}
