package hwexcuses;

import java.util.*;

public class AttendanceGenerator implements Generator {
  String[] templates = {"I was attending a %event% and didn't complete it"};
  String[] events = {"funeral","wedding","bucks party","going away celebration",
    "stag night","religious gathering of the flying spagetti monster",
    "medical examination of sensitive areas","sore-foot therapy session",
    "alcholics anonymous session","marriage counselling session"};

  public void generate() {
    int random = new Random().nextInt(events.length);
    System.out.println(templates[0].replaceAll("%event%", events[random]));
  }
}
