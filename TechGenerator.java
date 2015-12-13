package hwexcuses;

import java.util.*;

public class TechGenerator implements Generator {
  String[] templates = {"My %noun% broke down",
    "My %noun% exploded in a %effect% and destroyed my homework"};
  String[] nouns = {"printer","keyboard","mouse","screen","monitor","internet"};
  String[] effect = {"ball of fire","shower of sparks","puff of smoke",
    "blinding flash of light"};

  public void generate() {
    int templateRand = new Random().nextInt(templates.length);
    int nounRand = new Random().nextInt(nouns.length);
    int effectRand = new Random().nextInt(effect.length);

    System.out.println(templates[templateRand]
      .replaceAll("%noun%", nouns[nounRand])
      .replaceAll("%effect%", effect[effectRand]));
  }
}
