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
}
