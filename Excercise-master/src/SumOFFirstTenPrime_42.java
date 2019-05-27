import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOFFirstTenPrime_42 {

	public static void main(String[] args) {
		int num=0,i;
		
		List<Integer> listOfPrime= new ArrayList<>();
		System.out.print("Enter Number range : ");
		Scanner scan= new Scanner(System.in);
		int val = scan.nextInt();
		for(i=1;i<=val;i++) {
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if(counter==2)
			{
				System.out.println(i);
			listOfPrime.add(i);	
			}
			
		}
		System.out.println(listOfPrime);
		int sumOFPrime=0;

		for (Integer integer : listOfPrime) {

			sumOFPrime+=integer.intValue();
		}
		System.out.println(sumOFPrime);
		
	}

}
