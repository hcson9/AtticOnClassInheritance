import java.util.ArrayList;

/**
 * create on 2024/05/29 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public abstract class SmartPhone implements Phone, Camera {

  private String brand;

  public SmartPhone(String brand) {
    this.brand = brand;
  }

  public abstract void search();


  @Override
  public void takePicture() {
    System.out.println("사진찍다");
  }

  @Override
  public void call() {
    System.out.println("전화");
  }
}
