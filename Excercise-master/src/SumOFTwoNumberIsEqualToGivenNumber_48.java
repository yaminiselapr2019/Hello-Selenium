
public class SumOFTwoNumberIsEqualToGivenNumber_48	 {

	public static int checkSumOfTwoNumber(int arr[],int inputNumber) {
		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==inputNumber) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+inputNumber);

				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
checkSumOfTwoNumber(new int[] {1,2,3,4,5}, 3);
	}

}
