
public class RemovingOfWhiteSpaces_6 {

	public static void main(String[] args) {

		String s="   Hi how    are you?   ";
		/*	s=s.replaceAll(" ", "");
		System.out.println(s);*/
		// Trim space at prefix or suffix
		s=s.trim();
		System.out.println(s);
	}
}
