import java.util.Random;

public class Weapon {
  private int minDamage;
  private int maxDamage;
  private Random rand = new Random();

  public Weapon(int minDamage, int maxDamage) {
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
  }

  public int rollDamage() {
    return rand.nextInt(maxDamage - minDamage + 1) + minDamage;
  }
}
