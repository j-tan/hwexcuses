package hwexcuses;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Generator[] generators = new Generator[2];
    generators[0] = new BasicGenerator();
    generators[1] = new TechGenerator();

    generators[new Random().nextInt(generators.length)].generate();
  }
}
