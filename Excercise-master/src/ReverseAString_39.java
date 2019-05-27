
public class ReverseAString_39 {

	public static void reverseAString(String str) {
		String[] words = str.split(" ");
		System.out.println(words.length);
		String reverseStr="";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord="";
			for (int j= word.length()-1;j>=0; j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseStr+=reverseWord+" ";
		}
		System.out.println(reverseStr);

	}
	public static void main(String[] args) {
		reverseAString("Test Leaf");
	}
}
