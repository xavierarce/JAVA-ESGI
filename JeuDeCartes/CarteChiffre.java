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

  @Override
  public boolean equals(Object obj) {
    if (!super.equals(obj))
      return false;
    if (!(obj instanceof CarteChiffre))
      return false;
    CarteChiffre other = (CarteChiffre) obj;
    // Print debug information
    System.out.println("Comparing CarteChiffre " + this.couleur + " with " + other.couleur);
    return this.couleur.equals(other.couleur);
  }

}
