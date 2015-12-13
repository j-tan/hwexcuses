package hwexcuses;

import java.util.*;

public class MistakenGenerator implements Generator {
  String[] templates = {"My %person% mistook it for %thing%",
    "A thief mistook it for %thing% and stole it"};
  String[] person = {"dad","mom","grandpa","grandma","brother","sister",
    "neighbour","mailman"};
  String[] thing = {"trash","wallpaper","posters","magazines","kindling",
    "toilet paper","secret love notes","newspaper"};
  int random;
  int random2;

  public MistakenGenerator() {
    random = new Random().nextInt(person.length);
    random2 = new Random().nextInt(thing.length);
  }

  public void generate() {
    System.out.println(templates[new Random().nextInt(templates.length)]
      .replaceAll("%person%", person[random])
      .replaceAll("%thing%", thing[random2]));
  }
}
