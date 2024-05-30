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
public class Weed extends Plant {

  public Weed() {
    super("Weed");
  }

  @Override
  public void behavior() {
    photosynthesize();
  }
}
