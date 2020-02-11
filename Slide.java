/**
 * @author Lucy
 * @version 1.0
 */
 import java.util.HashSet;
 import java.util.Set;
 import java.util.Iterator;
public class Slide {

public static int freeSlideID = 0;
private final Photo pic1;
private final Photo pic2;
private String[] tags;
private int ID;

public Slide(Photo newPic1) {
  this(newPic1, null);

}

public Slide(Photo newPic1, Photo newPic2) {
    pic1 = newPic1;
    pic2 = newPic2;
    ID = freeSlideID;
    freeSlideID++;
    addTagsToArray();
}

int getID() {
  return ID;
}

// Lucy needs to fix this so only one addTagsEct
private void addTagsToArray() {
    HashSet<String> tagsSet = new HashSet<String>();
    for (String tag: pic1.getTags()) {
      tagsSet.add(tag);
    }
    if (pic2 != null) {
      for (String tag: pic2.getTags()) {
        tagsSet.add(tag);
      }
    }
    tags = new String[tagsSet.size()];
    Iterator i = tagsSet.iterator();
    for(int j = 0; i.hasNext(); j++) {
      tags[j] = (String) i.next();
      System.out.println("iter: " + tags[j]);
    }
    //newtags.addAll(pic1.getTags());
    //tags = newtags.toArray();
}

public int getNumberOfTags() {
  return tags.length;
}

public String[] getTags() {
  String[] temp = {"Fake", "Tags", "FIX", "<ME>"};
  return tags;
}
public String toStringForFile() {
   if (pic2 != null) {
     return pic1.getID() + " " + pic2.getID();
   } else {
     return pic1.getID() + "";
   }
}

public static Slide[] hPhotosToSlides(Photo[] inputPhotos) {
  Slide[] results = new Slide[inputPhotos.length];
  for(int i = 0; i < inputPhotos.length; i++){
    results[i] = new Slide(inputPhotos[i]);
  }
  return results;
}
}
