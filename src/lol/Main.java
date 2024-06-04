package lol;

/**
 * create on 2024/06/04 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {
    Champion timo = new Timo();

    timo.getQ().useSkill();
    timo.getE().useSkill();
    timo.getR().useSkill();
    timo.getW().useSkill();
  }
}
