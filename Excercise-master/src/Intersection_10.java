import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection_10 {

		public static void main(String[] args) {
			int[] arr1= {1,4,5,7,9,2,3};
			int[] arr2= {2,3,4,5,8,9};
			List<Integer> arrayList = new ArrayList<>();
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						arrayList.add(arr2[j]);
					}
				}
			}
			Collections.sort(arrayList);
			System.out.println("Intersection of two arrays are: "+arrayList);

		}

	}
