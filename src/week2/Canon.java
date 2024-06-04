package week2;

/**
 * create on 2024/06/03 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Canon extends DigitalCamera {

  public Canon() {
    super("Canon");
  }

  @Override
  public void takePicture() {
    System.out.println("한번 더찍기");
  }
}
