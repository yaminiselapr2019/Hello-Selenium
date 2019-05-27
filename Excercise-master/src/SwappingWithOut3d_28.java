
public class SwappingWithOut3d_28 {

	public static void main(String[] args) {
String txt1="One";
String txt2="two";

txt1= txt1+txt2;
System.out.println(txt1);
txt2 = txt1.substring(0, (txt1.length() - txt2.length()));
System.out.println(txt2);
txt1= txt1.substring(txt2.length());
System.out.println(txt1);
	}

}
