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
 public String getTags() {
	String tags = "";
	for (int i = 0; i < this.tags.length; i++) {
		tags = tags + this.tags[i] + " ";
	}
	return tags;
 }

 public String toString() {
	return " ID: " + Integer.toString(id) + "\n isVertical: " + String.valueOf(isVertical) + "\n amountOfTags: "
		+ Integer.toString(amountOfTags) + "\n tags: " + getTags();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
