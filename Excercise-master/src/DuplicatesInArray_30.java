import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInArray_30 {

	public static void main(String[] args) {
int [] arrayA= {1,11,1,22,11,22};
Set<Integer> withOutDup = new HashSet<Integer>();


List<Integer> dupAllow= new ArrayList<>();

	for (Integer dupVal : arrayA) {
		dupAllow.add(dupVal);
	}
	System.out.println("Duplicates "+dupAllow);
	for (Integer integer : dupAllow) {
		withOutDup.add(integer);
	}
	System.out.println("No Duplicates "+withOutDup);

	}
}
