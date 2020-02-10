import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

public class JoinSlides{
  // How many slideshows to keep after each round
  final static int NUMBER_TO_HOLD = 3;
  // How many possible slideshows to look at for
  // each Slideshow I.E Total looked at will be
  // #_TO_HOLD * #_TO_BRANCH
  final static int NUMBER_TO_BRANCH = 3;
  public static Slideshow joinSlides(
  Slide[] inputSlides,
  HashMap<String, int[]> tags) {
    // Used to hold Slideshows
    Slideshow[] allBranches = new Slideshow[NUMBER_TO_HOLD * NUMBER_TO_BRANCH];
    // Creates three Starting SlideShows
    // With just the first Photo in it.
    for(int i=0; i<3; i++) {
      allBranches[i] = new Slideshow();
      allBranches[i].add(inputSlides[0]);
    };
    // For each good branch.
    for(int i = 0; i < NUMBER_TO_HOLD; i++){
      // Find out the number of Tags of last slide.
      int NumberOfTags = allBranches[i].getLast().getNumberOfTags()/2;
      // Make HashMap to store Slide with correct matches
      // HashMap<Id, numberOfMatches>
      HashMap<Integer, Integer> correctMatches = new HashMap<Integer, Integer>();
      // Go though all all tags of the last Slide
      for(String tag: allBranches[i].getLast().getTags()){
        // For all slides with this matching tag
        if (tags.get(tag) != null){
          for(int slideIDWithMatchingTag: tags.get(tag)) {
            // Increases the value of correctMatch["slideID"] by one
            Integer tempInteger = new Integer(correctMatches
            .get(slideIDWithMatchingTag).intValue() + 1);
            correctMatches.put(slideIDWithMatchingTag, tempInteger);
          }
        }
      }
      // Find all photos that have right number of matches.
      Integer[] tagsArray = correctMatches.keySet().toArray();
      Arrays.sort(tagsArray, new sortByMatches());
      //System.out.print(correctMatches);
    }
    return allBranches[0];
  }
}

class sortByMatches implements Comparator<int[]>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}
