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
}
