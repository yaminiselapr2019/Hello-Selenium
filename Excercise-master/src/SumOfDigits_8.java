import java.util.Scanner;

public class SumOfDigits_8 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the Input Number  :");
		int sumofdigits=0;
		int inputnumber=scan.nextInt();
		int number=inputnumber;
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

}
