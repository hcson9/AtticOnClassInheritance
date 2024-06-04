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
public class Samsung extends SmartPhone {

  public Samsung() {
    super("삼성");
  }

  @Override
  void search() {
    System.out.println("삼성폰으로 검색");
  }

  @Override
  public void takePicture() {
    System.out.println("삼성폰으로 사진찍기");
  }

  @Override
  public void call() {

    System.out.println("삼성폰으로 전화");
  }

  public void samsung() {
    System.out.println("헤이 빅스비");
  }
}
