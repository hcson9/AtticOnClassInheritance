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
public class Main {

  public static void main(String[] args) {
    Phone iPhone1 = new IPhone();
    SmartPhone iPhone2 = new IPhone();
    IPhone iPhone3 = new IPhone();

    iPhone1.call();

    iPhone2.search();

    iPhone3.iphone();

    IPhone iPhone4 = (IPhone) iPhone1;
    iPhone4.iphone();

    ((IPhone) iPhone1).iphone();

    Phone samsung1 = new Samsung();
    SmartPhone samsung2 = new Samsung();
    Samsung samsung3 = new Samsung();

    samsung1.call();
    samsung2.search();
    samsung3.samsung();

    Camera camera = new Canon();

    camera.takePicture();

    Camera nikon = new Nikon();

    nikon.takePicture();
  }

}
