package lol;

import java.util.List;

/**
 * create on 2024/06/04 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */

public abstract class Champion {

  private String name;

  private Skill q;
  private Skill w;
  private Skill e;
  private Skill r;

  public Champion(String name,
      Skill q,
      Skill w,
      Skill e,
      Skill r) {
    this.name = name;
    this.q = q;
    this.w = w;
    this.e = e;
    this.r = r;
  }

  public String getName() {
    return name;
  }

  public Skill getQ() {
    return q;
  }

  public Skill getE() {
    return e;
  }

  public Skill getR() {
    return r;
  }

  public Skill getW() {
    return w;
  }
}
