package hwexcuses;

import java.util.*;

public class BasicGenerator implements Generator {
  String[] templates = {"My %noun% ate my homework"};
  String[] nouns = {"alligator","dog","cat","crow","tarantula"};
  int random;

  public BasicGenerator() {
    random = new Random().nextInt(nouns.length);
  }

  public void generate() {
    System.out.println(templates[0].replaceAll("%noun%", nouns[random]));
  }
}
