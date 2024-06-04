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
public abstract class DigitalCamera implements Camera {

  private String brand;

  public DigitalCamera(String brand) {
    this.brand = brand;
  }

  @Override
  public void takePicture() {
    System.out.println(brand + "로 사진을 찍다");
  }
}
