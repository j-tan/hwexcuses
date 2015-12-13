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
    int templatesRand = new Random().nextInt(templates.length);
    int personRand = new Random().nextInt(person.length);
    int thingRand = new Random().nextInt(thing.length);

    System.out.println(templates[templatesRand]
      .replaceAll("%person%", person[personRand])
      .replaceAll("%thing%", thing[thingRand]));
  }
}
