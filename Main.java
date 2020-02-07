import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String a = "src/inputFiles/a_example.txt";
		Photo[] photos = Parser.parsePhotosFromFile(a);
		System.out.println(photos[0].id);
	}

}
