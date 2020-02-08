import java.util.ArrayList;

/**
 * @author Yan Yan Ji
 * @version 1.5 <br>
 * no copyright
 */
public class Slideshow {
	// TODO
	private ArrayList<Photo> slideShow = new ArrayList<>();

	//Need to be changed I guess
	public int getPoints() {
		return -1;
	}

	public Photo getLast() {
		return slideShow.get(slideShow.size() - 1);
	}

	public void add(Photo newPhoto) {
		// Adds a photo on to the end of
		// the slide show.
		this.slideShow.add(newPhoto);

	}

	public String toString() {
		// Pretty print Slideshow
		// use Photo.toString();
		String result = "";
		for (Photo slide : slideShow) {
			result += slide.toString() + "\n";
		}
		return result;
	}
}

