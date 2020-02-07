import java.util.HashMap;
import java.io.FileNotFoundException;

public class RunJoin {
  public static void main(String[] args) {
    Photo[] photoArray;
    Slide[] slides;
    try{
      photoArray = Parser.parsePhotosFromFile("./inputFiles/a_example.txt");
    } catch (FileNotFoundException e) {
      photoArray = new Photo[0];
      System.out.print("File not found\n");
    }

    slides = VerticalPhotos.mergeVerticalPhotos(photoArray);
    HashMap<String, int[]> tags = Hashmap.makeSlideHashmap(photoArray);
    System.out.print(JoinSlides.joinSlides(slides, tags));
  }
}
