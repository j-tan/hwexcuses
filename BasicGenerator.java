package hwexcuses;

import java.util.*;

public class BasicGenerator implements Generator {
  String[] templates = {"My %noun% ate my homework"};
  String[] nouns = {"alligator","budgie","cat","cow","crow","dog","dragon",
    "guinea pig","goldfish","lion","lizard","magpie","pig","rhino","snake",
    "tarantula","unicorn","worm","zebra"};

  public void generate() {
    int random = new Random().nextInt(nouns.length);
    System.out.println(templates[0].replaceAll("%noun%", nouns[random]));
  }
}
