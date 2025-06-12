public class Fraction {
  private final int num; // numérateur
  private final int den; // dénominateur (>0)

  public Fraction(int num, int den) {
    if (den == 0) {
      throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
    }

    if (den < 0) {
      num = -num;
      den = -den;
    }

    int pgcd = MathUtils.pgcd(Math.abs(num), den);
    this.num = num / pgcd;
    this.den = den / pgcd;
  }

  public Fraction add(Fraction other) {
    int newNum = this.num * other.den + other.num * this.den;
    int newDen = this.den * other.den;
    return new Fraction(newNum, newDen);
  }

  public Fraction multiply(Fraction other) {
    return new Fraction(this.num * other.num, this.den * other.den);
  }

  public double toDouble() {
    return (double) this.num / this.den;
  }

  @Override
  public String toString() {
    return num + "/" + den;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Fraction))
      return false;
    Fraction f = (Fraction) obj;
    return this.num == f.num && this.den == f.den;
  }

  public int compareTo(Fraction other) {
    return Integer.compare(this.num * other.den, other.num * this.den);
  }

  public static void main(String[] args) {
    Fraction f = new Fraction(2, 3);
    Fraction g = new Fraction(1, 6);

    System.out.println("f + g = " + f.add(g)); // 5/6
    System.out.println("f * g = " + f.multiply(g)); // 1/9
    System.out.println("f en double = " + f.toDouble());

    assert f.add(g).toString().equals("5/6") : "Addition incorrecte";
    assert f.multiply(g).toString().equals("1/9") : "Multiplication incorrecte";
    System.out.println("Tous les tests sont passés.");
  }
}
