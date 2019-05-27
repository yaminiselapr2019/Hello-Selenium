import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray_3 {
public static void main(String[] args) {
	int [] elements = new int[]{1,5,7,2,4};
	List<Integer> lstA= new ArrayList<Integer>();
for (int addElements : elements) {
	lstA.add(addElements);
	}
System.out.println("Before sorting "+lstA);

Collections.sort(lstA);
System.out.println("After sorting "+lstA);

}
}
