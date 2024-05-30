package animal;

/**
 * create on 2024/05/30 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public abstract class Animal implements Creature {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void move() {
    System.out.println(name + " is moving");
  }
}
