import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		String a = "a_example.txt";
		try {
			Photo[] photos = Parser.parseRidesFromFile(a);
			System.out.println(photos[0].id);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
