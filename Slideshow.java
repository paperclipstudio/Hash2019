public class Slideshow{
  //TODO
  public int getPoints() {
    return -1;
  }

  public Photo getLast() {
    String[] tempTagList = {"banana", "dog", "Dinner Plate"};
    return new Photo(1234, true, 1234, tempTagList);
  }

  public void add(Photo newPhoto) {
    // Adds a photo on to the end of
    // the slide show.

  }

  public String toString() {
    // Pretty print Slideshow
    // use Photo.toString();
    return "[id: 1234_NOT, cat_VAILD, ABBA_OUTPUT, pencil]";
  }
}
