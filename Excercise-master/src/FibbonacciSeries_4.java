import java.util.Scanner;

public class FibbonacciSeries_4 {
	public static void main(String[] args) {
		System.out.println("Enter a number to check whether it belongs to fibonacci:");
		int num;
		int first=0,second=1,last=0;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		scan.close();
		while(last<num)
		{
			last=first+second;
			first=second;
			second=last;
		}

		if(last==num)
			System.out.println("The number "+num+" belongs to fibonacci series");
		else
			System.out.println("The number "+num+" do not belong to fibonacci series");
	}

}

