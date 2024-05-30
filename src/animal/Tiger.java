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
public class Tiger extends Animal implements Carnivorous {

  public Tiger() {
    super("Tiger");
  }

  @Override
  public void eatMeat() {
    System.out.println("Tiger 고기를 먹는다");
  }

  @Override
  public void behavior() {
    move();
    eatMeat();
  }
}
