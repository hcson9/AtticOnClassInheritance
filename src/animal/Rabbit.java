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
public class Rabbit extends Animal implements Herbivorous {

  public Rabbit() {
    super("Rabbit");
  }


  @Override
  public void behavior() {
    move();
  }

  @Override
  public void eatPlants() {
    System.out.println("Rabbit 풀 먹는다.");
  }
}
