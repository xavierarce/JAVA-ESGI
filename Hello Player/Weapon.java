import java.util.Random;

public class Weapon {
  private String name;
  private int minDamage;
  private int maxDamage;
  private Random rand = new Random();

  public Weapon(String name, int minDamage, int maxDamage) {
    this.name = name;
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
  }

  public int rollDamage() {
    return rand.nextInt(maxDamage - minDamage + 1) + minDamage;
  }

  public String getName() {
    return name;
  }
}
