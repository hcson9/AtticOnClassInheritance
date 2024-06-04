package game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * create on 2024/05/31 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {
    TestService testService = new TestImpl1();

    testService.run();


    TestImpl1 testImpl1 = (TestImpl1) testService;

    testImpl1.test();

    List<String> a = new CopyOnWriteArrayList<>();

    a.add("hello");


  }

}
