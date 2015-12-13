package hwexcuses;

import java.util.*;

public class MistakenGenerator implements Generator {
  String[] templates = {"My %person% mistook it for %thing% and %result%",
    "A thief mistook it for %thing% and stole it"};
  String[] person = {"dad","mom","grandpa","grandma","brother","sister",
    "neighbour","mailman","alien friend from pluto"};
  String[] thing = {"wallpaper","boy-band posters","dirty magazines",
    "fireplace kindling","toilet paper","secret love notes",
    "long lost treasure maps","a secret porn stash","newspaper",
    "Hitler's diary","some contemporary art piece","dirty fan-fiction"};
  String[] results = {"took it away","decided to keep it",
    "decided not to give it back","found a better use for it",
    "decided to use it for another purpose"};

  public void generate() {
    int templatesRand = new Random().nextInt(templates.length);
    int personRand = new Random().nextInt(person.length);
    int thingRand = new Random().nextInt(thing.length);
    int resultsRand = new Random().nextInt(results.length);

    System.out.println(templates[templatesRand]
      .replaceAll("%person%", person[personRand])
      .replaceAll("%thing%", thing[thingRand])
      .replaceAll("%result%", results[resultsRand]));
  }
}
