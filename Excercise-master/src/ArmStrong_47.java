import java.util.Scanner;

public class ArmStrong_47 {
	public static void main(String[] args) {
		System.out.print("Enter the number to check the Armstrong : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int temp=input, output=0,remainder;

		while(input>0) {
			remainder=input%10;
			output=output+(remainder*remainder*remainder);
			input=input/10;

		}
		if (temp==output) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not an Armstrong ");
		}


	}
}
