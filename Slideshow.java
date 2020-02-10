import java.util.ArrayList;
import java.lang.Math;

public class Slideshow{
  ArrayList<Slide> slides;

  Slideshow() {
    slides = new ArrayList<Slide>();
  }

  public int getPoints() {
    int points = 0;
    for(int i = 0; i < slides.size() - 1; i++){
      points += getTransitionPoints(slides.get(i), slides.get(i+1));
    }
    return points;
  }

  public static int getTransitionPoints(Slide a, Slide b) {
    int tagsA = a.getNumberOfTags();
    int tagsB = b.getNumberOfTags();
    int tagsAB = 0;
    for(String aTag: a.getTags()) {
      for(String bTag: b.getTags()) {
        if (aTag.equals(bTag)) {
          tagsA--;
          tagsB--;
          tagsAB++;
        }
      }
    }
    return Math.min(tagsA, Math.min(tagsAB, tagsB));
  }

  public Photo getLast() {
    String[] tempTagList = {"banana", "dog", "Dinner Plate"};
    return new Photo(1234, true, 1234, tempTagList);
  }

  public void add(Slide newSlide) {
    slides.add(newSlide);

  }

  public String toString() {
    // Pretty print Slideshow
    // use Photo.toString();
    String result = "[";
    for(Slide input: this.slides){
      result += input.toString() + ", ";
    }
    result += "]";
    return result;
  }
}
