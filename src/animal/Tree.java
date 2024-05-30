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
public class Tree extends Plant {

  public Tree() {
    super("Tree");
  }

  @Override
  public void behavior() {
    photosynthesize();
  }
}
