package hwexcuses;

import java.util.*;

public class MistakenGenerator implements Generator {
  String[] templates = {"My %person% mistook it for %thing% and took it away",
    "A thief mistook it for %thing% and stole it"};
  String[] person = {"dad","mom","grandpa","grandma","brother","sister",
    "neighbour","mailman","alien friend from pluto"};
  String[] thing = {"trash","wallpaper","posters","magazines","kindling",
    "toilet paper","secret love notes","long lost treasure maps",
    "a secret porn stash","newspaper","Hitler's diary"};

  public void generate() {
    int templatesRand = new Random().nextInt(templates.length);
    int personRand = new Random().nextInt(person.length);
    int thingRand = new Random().nextInt(thing.length);

    System.out.println(templates[templatesRand]
      .replaceAll("%person%", person[personRand])
      .replaceAll("%thing%", thing[thingRand]));
  }
}
