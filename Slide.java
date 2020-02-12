import java.util.ArrayList;

/**
 * @author Lucy
 * @version 2.0 upgraded by Yan Yan Ji
 */
public class Slide {

	private final Photo pic1;
	private final Photo pic2;
	private final String[] tags;

	public Slide(Photo newPic1) {
		pic1 = newPic1;
		pic2 = null;
		tags = newPic1.tags;
	}

	public Slide(Photo newPic1, Photo newPic2) {
		pic1 = newPic1;
		pic2 = newPic2;
		tags = MergeTags(newPic1, newPic2);
	}

	private String[] MergeTags(Photo newPic1, Photo newPic2) {
		ArrayList<String> tagList = new ArrayList<String>();
		for (String tag : newPic1.tags) {
			tagList.add(tag);
		}
		for (String tag : newPic2.tags) {
			if (!tagList.contains(tag)) {
				tagList.add(tag);
			}
		}
		String[] tags = new String[tagList.size()];
		for (int i = 0; i < tagList.size(); i++) {
			tags[i] = tagList.get(i);
		}
		return tags;
	}

	public String toString() {
		if (pic2 == null) {
			return pic1.id + "\n";
		} else {
			return pic1.id + " " + pic2.id + "\n";
		}
	}
}
