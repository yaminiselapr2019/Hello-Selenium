import java.io.File;
import java.util.Arrays;

public class TextFileSort_27 {

	public static void main(String[] args) {
		File file= new File("C:\\Users\\sekhar9393\\Desktop\\Practice");
		System.out.println(file.isDirectory());
		File[] listFiles = file.listFiles();
		System.out.println(listFiles);
		Arrays.sort(listFiles);
		
		for (File file2 : listFiles) {
			if(file2.getName().endsWith(".txt"))
			{System.out.println(file2);}
		}
	}

}
