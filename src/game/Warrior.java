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
public class Warrior extends Character {

  public Warrior(String name) {
    super(name);
  }

  @Override
  void attack() {
    System.out.println("전사가 공격합니다.");
  }
}
