public class Slide {

private final Photo pic1;
private final Photo pic2;
private final String[] tags;

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

private void addTagsToArray1() {
    Set newtags = protected HashSet();
    newtags.addAll(pic1.getTags());
    tags = newtags.toArray();
}

private void addTagsToArray2() {
    Set newtags = protected HashSet();
    newtags.addAll(pic1.getTags());
    newtags.addAll(pic2.getTags());
    tags = newtags.toArray();
}

}

// fix so only one addTagsEct
