import java.util.HashMap;
import java.io.FileNotFoundException;

public class RunJoin {
  public static void main(String[] args) {
    Photo[] photoArray;
    Slide[] slides;
    try{
    photoArray = Parser.parsePhotosFromFile("./inputFiles/a_example.txt");
    //photoArray = Parser.parsePhotosFromFile("./inputFiles/b_lovely_landscapes.txt");
    } catch (FileNotFoundException e) {
      photoArray = new Photo[0];
      System.out.print("File not found\n");
    }
    for(Photo photo: photoArray) {
      System.out.printf("ID: %5s Photo: %s\n", photo.getID(), photo.toString());
    }



    slides = Slide.hPhotosToSlides(photoArray);
    for(Slide cur: slides) {
      System.out.println("slides: " + cur.getID());
    }
    HashMap<String, int[]> tags = Hashmap.makeSlideHashmap(slides);

    for(String x: tags.keySet().toArray(new String[0])) {
      System.out.println("value: " + x);
    }
    System.out.print(JoinSlides.joinSlides(slides, tags).toStringForFile());
  }
}
