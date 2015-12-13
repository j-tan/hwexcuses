package hwexcuses;

import java.util.*;

public class TechGenerator implements Generator {
  String[] templates = {"My %noun% broke down"};
  String[] nouns = {"printer","keyboard","mouse","screen","monitor","internet"};

  public void generate() {
    int templateRand = new Random().nextInt(templates.length);
    int nounRand = new Random().nextInt(nouns.length);

    System.out.println(templates[templateRand]
      .replaceAll("%noun%", nouns[nounRand]));
  }
}
