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
  HashMap<String, int[]> tags) {
    // Used to hold Slideshows
    Slideshow[] allBranches = new Slideshow[NUMBER_TO_HOLD * NUMBER_TO_BRANCH];
    // Creates three Starting SlideShows
    // With just the first Photo in it.
    for(int i=0; i<3; i++) {
      allBranches[i] = new Slideshow();
      allBranches[i].add(inputPhotos[0]);
    };
    // For each good branch.
    for(int i = 0; i < NUMBER_TO_HOLD; i++){
      // Find out the number of Tags of lass image.
      int NumberOfTags = allBranches[i].getLast().getNumberOfTags()/2;
      // Make HashMap to store Photos with correct matches
      // HashMap<Id, numberOfMatches>
      HashMap<Integer, Integer> correctMatches = new HashMap<Integer, Integer>();
      // Go though all all tags of the last Photo
      for(String tag: allBranches[i].getLast().getTags()){
        // For all photos with this matching tag
        if (tags.get(tag) != null){
          for(int photoIDWithMatchingTag: tags.get(tag)) {
            // Increases the value of correctMatch["photoID"] by one
            Integer tempInteger = new Integer(correctMatches
            .get(photoIDWithMatchingTag).intValue() + 1);
            correctMatches.put(photoIDWithMatchingTag, tempInteger);
          }
        }
      }
      System.out.print(correctMatches);
    }
    return allBranches[0];
  }
}
