import java.util.Scanner;

public class SumOfTwoNumbers_17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sumofdigits=0;
		int inputnumber=scan.nextInt();
		if(inputnumber>=10 &&inputnumber<=99)
		{int number=inputnumber;
		int remainder;
		while(inputnumber>0)
		{
			remainder = inputnumber%10;
			sumofdigits=sumofdigits+remainder;
			inputnumber=inputnumber/10;
		}
		System.out.println("Sum of digits in " + number + " is " +sumofdigits);
		scan.close();
		}
	
	else {
		System.out.println("Not a two digt");


	}
}}
