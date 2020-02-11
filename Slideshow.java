import java.util.ArrayList;
import java.lang.Math;
import java.util.HashSet;

public class Slideshow{
  ArrayList<Slide> slides;
  HashSet<Integer> slideID;

  Slideshow() {
    slides = new ArrayList<Slide>();
    slideID = new HashSet<Integer>();
  }

  public boolean isSlideInSlideShow(int ID) {
    return slideID.contains(ID);
  }

  public int getPoints() {
    int points = 0;
    for(int i = 0; i < slides.size() - 1; i++){
      points += getTransitionPoints(slides.get(i), slides.get(i+1));
    }
    return points;
  }

  public static int getTransitionPoints(Slide a, Slide b) {
    // Hold the number of tags that are only in a
    int tagsA = a.getNumberOfTags();
    // Holds the number of tags that are only in b
    int tagsB = b.getNumberOfTags();
    // Holds the the number of tags that are in both A and B
    // We start by assuming that there are no tags in common.
    int tagsAB = 0;
    for(String aTag: a.getTags()) {
      for(String bTag: b.getTags()) {
        if (aTag.equals(bTag)) {
          // If aTag == bTag then we know that there are one less tag that is
          // only in a or b and one more tag that is in both a and b.
          tagsA--;
          tagsB--;
          tagsAB++;
        }
      }
    }
    return Math.min(tagsA, Math.min(tagsAB, tagsB));
  }

  public Slide getLast() {
    return slides.get(slides.size()-1);
  }

  public void add(Slide newSlide) {


    slides.add(newSlide);


    slideID.add(newSlide.getID());
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

  public String toStringForFile() {
    String result = "";
    result += slides.size() + "\n";
    for(Slide cur: slides) {
      result += cur.toStringForFile();
    }
    return result;
  }

}
