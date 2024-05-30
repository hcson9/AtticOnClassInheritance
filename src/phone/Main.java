package phone;

/**
 * create on 2024/05/28 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {

    Phone iPhone = new IPhone15();


    SmartPhone smartPhone = new IPhone15();


    IPhone iPhone2 = new IPhone15();


    IPhone15 iPhone15 = new IPhone15();


    Phone phone = new Samsung();

    SmartPhone smartPhone1 = new Samsung();



    iPhone15.ai();

//    iPhone.call();
//    phone.IPhone15 a = (phone.IPhone15) iPhone;
//
//    List<String> a = new LinkedList<>();
//
//    a.ai();


    Camera camera = new IPhone15();

    camera.takePicture();

    camera = new Samsung();


    camera.takePicture();


    System.out.println("Hello world!");
  }
}