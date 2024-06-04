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
public abstract class SmartPhone implements Camera, Phone {

  private String brand;

  public SmartPhone(String brand) {
    this.brand = brand;
  }

  abstract void search();

  private void test() {
    System.out.println("부모 클래스꺼 읽기");
  }
}
