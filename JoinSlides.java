import java.util.HashMap;
import java.util.ArrayList;

public class JoinSlides{
  // How many slideshows to keep after each round
  final static int NUMBER_TO_HOLD = 3;
  // How many possible slideshows to look at for
  // each Slideshow I.E Total looked at will be
  // #_TO_HOLD * #_TO_BRANCH
  final static int NUMBER_TO_BRANCH = 3;
  public static Slideshow joinSlides(
  Photo[] inputPhotos,
  HashMap<String, String[]> tags) {
    // Used to hold Slideshows
    Slideshow[] allBranches = new Slideshow[NUMBER_TO_HOLD * NUMBER_TO_BRANCH];
    // Creates three Starting SlideShows
    for(int i=0; i<3; i++) {
      allBranches[i] = new Slideshow();
      allBranches[i].add(inputPhotos[0]);
    };
    for(int i = 0; i < NUMBER_TO_HOLD; i++){
      int numberOfTags = allBranches[i].getLast().getNumberOfTags();
      for(String tag: allBranches[i].getLast().getTags()){
          ArrayList<String> temp = new ArrayList<String>();
      }
      for(int j=0; j<NUMBER_TO_BRANCH; j++) {
      }
    }
    return allBranches[0];
  }
}
