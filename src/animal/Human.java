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
public class Human extends Animal
    implements Carnivorous, Herbivorous {
  // or implements Omnivorous

  private boolean value;

  public Human() {
    super("Human");
    value = false;
  }

  @Override
  public void eatMeat() {
    System.out.println("Human 고기를 먹는다");
  }

  @Override
  public void behavior() {
    move();
    eatMeat();
  }

  @Override
  public void eatPlants() {
    System.out.println("사람 풀 먹는다.");
  }
}
