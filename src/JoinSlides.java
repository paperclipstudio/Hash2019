import java.util.HashMap;
import java.util.ArrayList;

public class JoinSlides{
  // How many slideshows to keep after each round
  final int NUMBER_TO_HOLD = 3;
  // How many possible slideshows to look at for
  // each Slideshow I.E Total looked at will be
  // #_TO_HOLD * #_TO_BRANCH
  final int NUMBER_TO_BRANCH = 3;
  public static Slideshow joinSlides(
  Photo[] input,
  HashMap<String, String[]> tags) {
    Slideshow[] allBranches = new Slideshow[12];
    for(int i=0; i<3; i++) {
      allBranches[i] = new Slideshow();
    };
    for(int i = 0; i < 3; i++){
      int numberOfTags = allBranches[i].getLast().getNumberOfTags();
      for(String tag: allBranches[i].getLast().getTags()){
          ArrayList<String> temp = new ArrayList<String>();
      }
      for(int j=0; j<3; j++) {

      }
    }
    return allBranches[0];
  }
}
