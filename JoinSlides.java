import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;

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
      System.out.println("I: " + i);
      // Find out the number of Tags of last slide.
      int NumberOfTags = allBranches[i].getLast().getNumberOfTags() / 2;
      // Make HashMap to store Slide with correct matches
      // HashMap<Id, numberOfMatches>
      HashMap<Integer, Integer> correctMatches = new HashMap<Integer, Integer>();
      // Go though all all tags of the last Slide(Integer[])
      for(String tag: allBranches[i].getLast().getTags()){
        System.out.println("k");
        // For all slides with this matching tag
        if (tags.get(tag) != null){
          for(int slideIDWithMatchingTag: tags.get(tag)) {
            System.out.println("m");

            // Increases the value of correctMatch["slideID"] by one
            Integer tempInteger = new Integer(correctMatches
            .get(slideIDWithMatchingTag).intValue() + 1);
            correctMatches.put(slideIDWithMatchingTag, tempInteger);
          }
        }
      }
      System.out.println("o");
      // Find all photos that have right number of matches.
      int rightNumberOfMatches = allBranches[i].getLast().getNumberOfTags()/2;
      Object[] tagsArray = correctMatches.keySet().toArray();
      Collection<Integer> temp = correctMatches.values();
      Integer[] matchCountArray = temp.toArray(new Integer[0]);
      boolean matchFound = false;
      int torarence = 0;
      int numberFound = 0;
      while(!matchFound && torarence > 100) {
        System.out.println(torarence);
        for(int j = 0; j < matchCountArray.length; j++) {

          if ((matchCountArray[j].intValue() == rightNumberOfMatches + torarence ||
          matchCountArray[j] == rightNumberOfMatches - torarence) &&
          !allBranches[i].isSlideInSlideShow(inputSlides[i].getID())) {
            matchFound = true;
            numberFound++;
            allBranches[i*3 + 2 + numberFound].add(inputSlides[i]);
            break;
          }
        }
        torarence++;
      }
      Arrays.sort(tagsArray);
      //System.out.print(correctMatches);
    }
    return allBranches[0];
  }
}
/*
class sortByMatches implements Comparator<Integer[]>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}
*/
