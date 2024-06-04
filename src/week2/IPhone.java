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
public class IPhone extends SmartPhone {

  public IPhone() {
    super("애플");
  }

  @Override
  void search() {
    System.out.println("아이폰으로 검색");
  }

  @Override
  public void takePicture() {
    System.out.println("아이폰으로 사진찍기");
  }

  @Override
  public void call() {
    System.out.println("아이폰으로 전화하기");
  }

  public void iphone() {
    System.out.println("시리야");
  }
}
