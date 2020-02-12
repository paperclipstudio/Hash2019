import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		String a = "C:\\Users\\yanya\\eclipse-workspace\\Hash2019\\Hash2019-master\\src\\inputFiles\\e_shiny_selfies.txt";
		Photo[] photos = Parser.parsePhotosFromFile(a);
		Comparator<Photo> byAmountOfTags = Comparator.comparing(Photo :: getAmountOfTags);
		Arrays.sort(photos, byAmountOfTags);
		ArrayList<Slide> slides = new ArrayList<>();
		for (int i = 0; i < photos.length; i++) {
			if (photos[i] != null) {
				if (photos[i].isVertical) {
					for (int j = i + 1; j < photos.length; j++) {
						if (photos[j].isVertical) {
							slides.add(new Slide(photos[i], photos[j]));
							photos[j] = null;
							break;
						}
					}
				}else {
					slides.add(new Slide(photos[i]));
				}
			}
		}
		Parser.parseSlidesToFile(slides, "C:\\Users\\yanya\\eclipse-workspace\\Hash2019\\Hash2019-master\\src\\inputFiles\\output.txt");
		for (Slide s: slides) {
			System.out.print(s);
		}
	}

}