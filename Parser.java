import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Parser {
    /**
     * Reads a .in file and creates an Array of Rides. It then returns this
     * Array.
     * @author Gus
     * @param filename Input filename
     * @return photos List of photos read from the file.
	 * @throws FileNotFoundException
     */
	public static Photo[] parsePhotosFromFile(String filename) throws FileNotFoundException { //FileNotFoundException makes Scanner work

        Scanner scanner = new Scanner(new File(filename));
        int amountOfPhotos = Integer.parseInt(scanner.nextLine());
		Photo[] photos = new Photo[amountOfPhotos];
		int photoID = 0;
		boolean isVertical;

		while (scanner.hasNextLine()) { //Loops through every photo
			String line = scanner.nextLine();
			if(line.charAt(0) == 'V') { //checks if vertical
				isVertical = true;
			} else {
				isVertical = false;
			}
			int numOfTags = Character.getNumericValue(line.charAt(2	)); //checks num of tags
			String[] tempArray = line.substring(4).split(" "); //turns tags into an array of strings
			Photo tempPhoto = new Photo(photoID, isVertical, numOfTags, tempArray); //makes temp photo Class to upload
			photos[photoID] = tempPhoto;
			photoID++;
		}
		scanner.close();
		return photos;
	}
	
	//In case of error, comment it
	public static void parseSlidesToFile(ArrayList<Slide> inputSlides, String outputFile) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		writer.write(inputSlides.size() + "\n");
		for (Slide s: inputSlides) {
			writer.write(s.toString());
		}
		
		writer.close();
	}
}
