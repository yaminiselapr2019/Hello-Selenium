import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDups_30 {
	public static void main(String[] args) {
		int[] arr1= {0,12,0,5,6,0,10,0,2,0,3,0,0};
		Set<Integer> noDups= new HashSet<>();

		List<Integer> list= new ArrayList<>();
		for (Integer eachList : arr1) {
			list.add(eachList);
		}
		for (Integer integer : list) {
			noDups.add(integer);
		}
		System.out.println(noDups);
}}
