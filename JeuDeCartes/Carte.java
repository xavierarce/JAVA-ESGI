package JeuDeCartes;

public abstract class Carte {
  protected final String nom;
  protected final int valeur;

  public Carte(String nom, int valeur) {
    this.nom = nom;
    this.valeur = valeur;
  }

  public abstract void jouer();

  @Override
  public String toString() {
    return nom + " (valeur: " + valeur + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Carte other = (Carte) obj;
    return this.nom.equals(other.nom) && this.valeur == other.valeur;
  }

}
