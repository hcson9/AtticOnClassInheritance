package game;

/**
 * create on 2024/05/31 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public abstract class Weapon {
  private int power;

  public Weapon(int power) {
    this.power = power;
  }

  public int getPower() {
    return power;
  }
}
