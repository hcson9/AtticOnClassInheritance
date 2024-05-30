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
public abstract class MarineCreature implements Creature {

  private String name;

  public MarineCreature(String name) {
    this.name = name;
  }

  public void swim() {
    System.out.println(name + " is swimming");
  }
}
