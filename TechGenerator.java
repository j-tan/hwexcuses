package hwexcuses;

import java.util.*;

public class TechGenerator implements Generator {
  String[] templates = {"My %noun% broke down",
    "My %noun% exploded in a ball of fire and destroyed my homework"};
  String[] nouns = {"printer","keyboard","mouse","screen","monitor","internet"};

  public void generate() {
    int templateRand = new Random().nextInt(templates.length);
    int nounRand = new Random().nextInt(nouns.length);

    System.out.println(templates[templateRand]
      .replaceAll("%noun%", nouns[nounRand]));
  }
}
