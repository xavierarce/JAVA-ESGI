package JeuDeCartes;

public class CarteSpecial extends Carte {
  private final String effet;

  public CarteSpecial(String nom, String effet) {
    super(nom, 0);
    this.effet = effet;
  }

  @Override
  public void jouer() {
    System.out.println("J'active l'effet : " + effet);
  }

  @Override
  public String toString() {
    return "Carte Spéciale: " + nom + " (Effet: " + effet + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (!super.equals(obj))
      return false;
    if (!(obj instanceof CarteSpecial))
      return false;
    CarteSpecial other = (CarteSpecial) obj;
    // Print debug information
    System.out.println("Comparing CarteSpecial " + this.effet + " with " + other.effet);
    return this.effet.equals(other.effet);
  }

}
