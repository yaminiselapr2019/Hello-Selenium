import java.util.Arrays;

public class EqualityOfTwoArrays_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {1,2,3,4,5,6};
		int[] ary1 = {1,2,3,4,5,6};
		int[] ary2 = {1,2,3,4};
		System.out.println("Is array 1 equal to array 2?? " +Arrays.equals(ary, ary1));
		System.out.println("Is array 1 equal to array 3?? " +Arrays.equals(ary, ary2));

		
		  if (ary1 == ary2) System.out.println("Same");
	      else System.out.println("Not same");		
	}

}
