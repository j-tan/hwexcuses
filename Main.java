package hwexcuses;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Generator> generators = new ArrayList<Generator>();
    generators.add(new BasicGenerator());
    generators.add(new TechGenerator());
    generators.add(new MistakenGenerator());
    generators.get(new Random().nextInt(generators.size())).generate();
  }
}
