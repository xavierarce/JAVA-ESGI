public class Player {
  private final String name;
  private int hp;

  public Player(String name) {
    this.name = name;
    this.hp = 100;
  }

  public void greet() {
    System.out.println("Bonjour, je suis " + name + " !");
  }

  public void takeDamage(int amount) {
    hp -= amount;
    if (hp < 0) {
      hp = 0;
    }
    System.out.println(name + " a subi " + amount + " points de dégâts. Points de vie restants : " + hp);
  }

  public boolean isAlive() {
    return hp > 0;
  }

  public static void main(String[] args) {
    Player p = new Player("Xavier");
    p.greet();
    p.takeDamage(15);
    System.out.println("Le joueur est-il en vie ? " + p.isAlive());
  }
}
