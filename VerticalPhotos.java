
import java.util.Arrays;
import java.util.Comparator;

public class VerticalPhotos {
	
	/* seperate V photos from H photos */
	public Photo [] getVerticalPhotos(Photo [] inputPhotos) {
		Photo photos [] = new Photo[inputPhotos.length];
		int count = 0;
		for (int i = 0; i < inputPhotos.length; i++) {
			if (inputPhotos[i].isVertical) {
				photos[count] = inputPhotos[i];
				count += 1;
			}
		}Photo returnPhotos [] = new Photo [count];
		for (int i = 0; i < count; i++) {
			returnPhotos[i] = photos[i];
		}return returnPhotos;
	}
	
	/* sort V photos and pair the first and last photo together and so on */
	public int [][] mergeVerticalPhotos(Photo [] inputPhotos){
		Comparator<Photo> byAmountOfTags = Comparator.comparing(Photo::getAmountOfTags);
		Arrays.sort(inputPhotos, byAmountOfTags);
		int photos = inputPhotos.length / 2;
		int pairs [][]= new int[photos][2];
		for (int i = 0; i < photos; i++) {
			pairs [i][0] = inputPhotos[i].id;
			pairs [i][1] = inputPhotos[inputPhotos.length - 1 - i].id;
			
		}return pairs;
	}
	
}
