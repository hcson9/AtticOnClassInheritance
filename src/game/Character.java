package game;

import java.util.ArrayList;

/**
 * create on 2024/05/31 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public abstract class Character {

  private int hp;
  private int mp;
  private String name;
  private Weapon weapon;

  public Character(String name) {
    this.hp = 100;
    this.mp = 100;
    this.name = name;
    this.weapon = null;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public int getHp() {
    return hp;
  }

  public int getMp() {
    return mp;
  }

  public String getName() {
    return name;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  abstract void attack();
}
