import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparatingZeroes_12 {
	public static void main(String[] args) {
		int[] arr1= {0,12,0,5,6,0,10,0,2,0,3,0,0};
		List<Integer> list= new ArrayList<>();
		for (Integer eachList : arr1) {
			list.add(eachList);
		}
		
		System.out.println("before seperating "+list);
		
		Collections.sort(list);
		System.out.println("After seperating "+list);
		
	}}
