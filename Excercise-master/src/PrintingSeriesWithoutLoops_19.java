
public class PrintingSeriesWithoutLoops_19 {

	public static void main(String[] args) {

		withoutloop(1);
	}	
	public static void withoutloop(int i) {	
		System.out.println(i);
		i++;
		if(i<=10)
		{
			withoutloop(i);

		}

	}

}


