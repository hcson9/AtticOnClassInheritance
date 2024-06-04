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
public class Timo extends Champion {


  public Timo() {
    super("티모",

        new Skill() {
          @Override
          public void useSkill() {
            System.out.println("실명 다트");
          }
        },

        new Skill() {
          @Override
          public void useSkill() {
            System.out.println("신속한 이동");
          }
        },

        new Skill() {
          @Override
          public void useSkill() {
            System.out.println("맹독 다트");
          }
        },

        new Skill() {
          @Override
          public void useSkill() {
            System.out.println("버섯");
          }
    });
  }
}
