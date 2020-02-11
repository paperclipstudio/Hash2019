import java.util.HashMap;

public class Hashmap {
  public static HashMap<String, int[]> makePhotoHashmap(Photo[] inputPhotos) {
    HashMap<String, int[]> result = new HashMap<String, int[]>();
    // Just for testing
    int[] temp1 = {1,2,14};
    int[] temp2 = {3,5,6};
    result.put("Banana", temp1);
    result.put("Musicals", temp2);
    return result;
  }

  public static HashMap<String, int[]> makeSlideHashmap(Slide[] inputSlides) {
    HashMap<String, int[]> result = new HashMap<String, int[]>();
    // For each slide.
    for (Slide cur: inputSlides) {
      // For each tag in the slide.
      for (String tag: cur.getTags()) {
        int[] curID = {};
        if(result.get(tag) != null) {

          curID = result.get(tag);
        } else { ;
        }
        int[] newIDs = new int[curID.length + 1];
        for(int i=0;i<curID.length; i++) {
          System.out.println("tag: " + tag +" curID: " + curID[i]);
          newIDs[i] = curID[i];
        }
        newIDs[curID.length] = cur.getID();
        result.put(tag, newIDs);
      }
    }
    return result;
  }

}
