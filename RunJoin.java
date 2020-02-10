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
    for(Photo photo: photoArray) {
      System.out.printf("ID: %5s Photo: %s\n", photo.getID(), photo.toString());
    }

    

    slides = VerticalPhotos.mergeVerticalPhotos(photoArray);
    HashMap<String, int[]> tags = Hashmap.makeSlideHashmap(slides);
    System.out.print(JoinSlides.joinSlides(slides, tags));
  }
}
