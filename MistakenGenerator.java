package hwexcuses;

import java.util.*;

public class MistakenGenerator implements Generator {
  String[] templates = {"My %person% mistook it for %thing%"};
  String[] person = {"dad","mom","brother","sister","neighbour","mailman"};
  String[] thing = {"trash","wallpaper","posters","magazines","kindling"};
  int random;
  int random2;

  public MistakenGenerator() {
    random = new Random().nextInt(person.length);
    random2 = new Random().nextInt(thing.length);
  }

  public void generate() {
    System.out.println(templates[0].replaceAll("%person%", person[random])
      .replaceAll("%thing%", thing[random2]));
  }
}
