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
public class Squid extends MarineCreature implements Omnivorous {

  public Squid() {
    super("Squid");
  }

  @Override
  public void eatMeat() {
    System.out.println("Squid 고기를 먹는다");

  }

  @Override
  public void behavior() {
    swim();
    eatEveryThing();
  }

  @Override
  public void eatPlants() {
    System.out.println("Squid 풀을 먹는다");
  }
}
