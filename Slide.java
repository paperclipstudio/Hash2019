/**
 * @author Lucy
 * @version 1.0
 */
 import java.util.HashSet;
 import java.util.Set;
public class Slide {

private final Photo pic1;
private final Photo pic2;
private String[] tags;

public Slide(Photo newPic1) {
    pic1 = newPic1;
    pic2 = null;
    addTagsToArray1();
}

public Slide(Photo newPic1, Photo newPic2) {
    pic1 = newPic1;
    pic2 = newPic2;
    addTagsToArray2();
}

// Lucy needs to fix this so only one addTagsEct
private void addTagsToArray1() {
    Set newtags = new HashSet();
    //newtags.addAll(pic1.getTags());
    //tags = newtags.toArray();
}

private void addTagsToArray2() {
    Set newtags = new HashSet();
    //newtags.addAll(pic1.getTags());
    //newtags.addAll(pic2.getTags());
    //tags = newtags.toArray();
}

public int getNumberOfTags() {
  return -1;
}

public String[] getTags() {
  String[] temp = {"Fake", "Tags", "FIX", "<ME>"};
  return temp;
}

}
