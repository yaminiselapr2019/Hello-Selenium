
public class DifferenceOnquals_21 {

/*	
	In general both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

		Main difference between .equals() method and == operator is that one is method and other is operator.
		We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
		If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
	}

}
