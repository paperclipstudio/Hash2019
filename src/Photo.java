public class Photo {
	int id;
	boolean isVertical;
	int amountOfTags;
	String[] tags;

	public Photo(int id, boolean isVertical, int amountOfTags, String tags[]) {
		this.id = id;
		this.isVertical = isVertical;
		this.amountOfTags = amountOfTags;
		this.tags = tags;
	}
// To Write
	public int getNumberOfTags() {
		return 5;
	}

// TODO
 public String[] getTags() {
	 String[] PLEASE_CHANGE = {"catFAKE", "dogITEMS", "monkeyBAD"};
	 return PLEASE_CHANGE;
 }

 public String toString() {
	 return "[id 1234, jumper_NOT, red_VAILD, overwatch_OUTPUT]";
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}