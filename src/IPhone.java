/**
 * create on 2024/05/29 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class IPhone extends SmartPhone {

  private String model;

  public IPhone(String model) {
    super("apple");
    this.model = model;
  }

  @Override
  public void search() {
    System.out.println("사파리에서 검색");
  }

  public void siri() {
    System.out.println("시리야");
  }

  @Override
  public void takePicture() {
    System.out.println("아이폰");
  }
}
