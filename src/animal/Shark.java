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
public class Shark extends MarineCreature implements Carnivorous {

  public Shark() {
    super("Shark");
  }

  @Override
  public void eatMeat() {
    System.out.println("Shark 고기를 먹는다");

  }

  @Override
  public void behavior() {
    swim();
    eatMeat();
  }
}
