import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Reads a .in file and creates a Arraylist of Rides. It then returns this
 * Arraylist.
 * @author Gus
 * @param filename Input filename, if none is given then defaults to Rides.in
 * @return ArrayList<Ride> List of rides read from the file.
 */

public class Parser {
  // Please Change name -------\Rides/----
    public static Photo[] parseRidesFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int amountOfPhotos = Integer.parseInt(scanner.nextLine());
        Photo[] photos = new Photo[amountOfPhotos];
        int rideID = 0;
        boolean isVertical;
		      //String discard;
        while (scanner.hasNextLine()) {
        	String a = scanner.next();
        	System.out.println("a: " + a);
        	if(a.equals("V")) {
        		isVertical = true;
        	} else if (a.equals("H")){
        		isVertical = false;
        	} else {
            System.out.println("Invaild InputFormat");
            return null;
          }
        	//discard = scanner.next();
        	int numOfTags = Integer.parseInt(scanner.next());
        	//discard = scanner.next();
        	System.out.println("rideID: " + rideID);
        	System.out.println("isVertial: " + isVertical);
        	System.out.println("numbOfTags: " + numOfTags);
			String data = scanner.nextLine();
			String[] tempArray = data.substring(1).split(" ");
			System.out.println("numberOfTags2: " + numOfTags);
			Photo tempPhoto = new Photo(rideID, isVertical, numOfTags, tempArray);
			photos[rideID] = tempPhoto;
            rideID =+ 1;
            //simple test:
            //System.out.println("The car comes from horizontal street " + tempRide.getStartPos().h() + ", vertical street " + tempRide.getStartPos().v() );
        }
        scanner.close();
		return photos;
    }
}
