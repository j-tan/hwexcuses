package hwexcuses;

import java.util.*;

public class TechGenerator implements Generator {
  String[] templates = {"My %noun% broke down"};
  String[] nouns = {"printer","keyboard","mouse","screen","monitor","internet"};
  int random;

  public TechGenerator() {
    random = new Random().nextInt(nouns.length);
  }

  public void generate() {
    System.out.println(templates[0].replaceAll("%noun%", nouns[random]));
  }
}
