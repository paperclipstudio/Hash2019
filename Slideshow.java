import java.util.ArrayList;

public class Slideshow{
  ArrayList<Slide> slides;

  Slideshow() {
    slides = new ArrayList<Slide>();
  }

  public int getPoints() {
    return -1;
  }

  public Photo getLast() {
    String[] tempTagList = {"banana", "dog", "Dinner Plate"};
    return new Photo(1234, true, 1234, tempTagList);
  }

  public void add(Slide newSlide) {
    // Adds a photo on to the end of
    // the slide show.

  }

  public String toString() {
    // Pretty print Slideshow
    // use Photo.toString();
    String result = "[";
    for(Slide input: this.slides){
      result += ", " + input.toString();
    }
    result += "]";
    return result;
  }
}
