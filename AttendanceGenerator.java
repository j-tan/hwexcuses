package hwexcuses;

import java.util.*;

public class AttendanceGenerator implements Generator {
  String[] templates = {"I was attending a %event% and %result%"};
  String[] events = {"funeral","wedding","bucks party at a strip club",
    "going away celebration for the president","stag night of the century",
    "religious gathering of the flying spagetti monster",
    "medical examination of sensitive areas","microaggression therapy session",
    "alcholics anonymous session","marriage counselling session",
    "heterosexual awareness conference","white sensitivity training course",
    "white supremacy conference"};
  String[] results = {"didn't complete it","didn't have time to finish it",
    "had to postpone doing it","had to find some other time for it",
    "had to put it off until later"};

  public void generate() {
    int eventsRand = new Random().nextInt(events.length);
    int resultsRand = new Random().nextInt(results.length);

    System.out.println(templates[0]
    .replaceAll("%event%", events[eventsRand])
    .replaceAll("%result%", results[resultsRand]));
  }
}
