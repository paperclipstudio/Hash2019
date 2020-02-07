import java.util.HashMap;
import java.io.FileNotFoundException;

public class RunJoin {
  public static void main(String[] args) {
    Photo[] photoArray;
    try{
      photoArray = Parser.parseRidesFromFile("./inputFiles/a_example.txt");
    } catch (FileNotFoundException e) {
      photoArray = new Photo[0];
      System.out.print("File not found\n");
    }

    HashMap<String, int[]> tags = Hashmap.makePhotoHashmap(photoArray);
    System.out.print(JoinSlides.joinSlides(photoArray, tags));
  }
}
