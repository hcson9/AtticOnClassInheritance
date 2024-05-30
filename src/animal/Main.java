package animal;

/**
 * create on 2024/05/30 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {
//    Creature human = new Human();
//    human.behavior();
//
//    Tiger tiger = new Tiger();
//    tiger.behavior();
//
//    Animal rabbit = new Rabbit();
//    rabbit.behavior();
//
//
//    Creature mackerel = new Mackerel();
//    mackerel.behavior();
//
//    Creature shark = new Shark();
//    shark.behavior();
//
//    Creature squid = new Squid();
//    squid.behavior();
//
//    Creature weed = new Weed();
//    weed.behavior();
//
//    Creature tree = new Tree();
//    tree.behavior();



    behavior("human", new Human());
    behavior("tiger", new Tiger());
    behavior("rabbit", new Rabbit());
    behavior("mackerel", new Mackerel());
    behavior("shark", new Shark());
    behavior("squid", new Squid());
    behavior("weed", new Weed());
    behavior("tree", new Tree());
  }

  private static void behavior(String name, Creature creature) {
    System.out.println("------------------------------");
    System.out.println(name + " is start!!!!!!!!!!!!!");
    creature.behavior();
    System.out.println(name + " is end!!!!!!!!!!!!!");
    System.out.println("------------------------------");
  }

}
