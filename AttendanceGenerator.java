package hwexcuses;

import java.util.*;

public class AttendanceGenerator implements Generator {
  String[] templates = {"I was attending a %event% and didn't complete it"};
  String[] events = {"funeral","wedding","bucks party at a strip club",
    "going away celebration for the president","stag night of the century",
    "religious gathering of the flying spagetti monster",
    "medical examination of sensitive areas","microaggression therapy session",
    "alcholics anonymous session","marriage counselling session",
    "heterosexual awareness conference","white sensitivity training course",
    "white supremacy conference"};

  public void generate() {
    int random = new Random().nextInt(events.length);
    System.out.println(templates[0].replaceAll("%event%", events[random]));
  }
}
