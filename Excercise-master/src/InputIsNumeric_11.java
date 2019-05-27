import java.util.Scanner;

public class InputIsNumeric_11 {

	public static void main(String[] args) {
		String input=null;
		System.out.println("Enter an input to check whether integer or not:");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		scan.close();
		try {
			int check=Integer.parseInt(input);
			System.out.println("The input "+input+" is an Integer");
		}
		catch(NumberFormatException e){
			System.out.println("The input "+input+" is not an Integer");
		}
	}}


