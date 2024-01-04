import java.util.*;
public class FilterDuplicateArrayElements {

	public static void main(String args[])
	{
		String a [] = {"2","4","5","6","7","8","9","9","9"};
		ArrayList < String > list = new ArrayList < String > ();
		
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
		}

		System.out.println("Input List:"+ list);
		System.out.println("Filtered Duplicates"+processList(list));
		
		
	}

	public static Set <String> processList (List < String > ListContainingDuplictaes){
		
		Set <String> resultSet = new HashSet <String> ();
		Set <String> tempSet = new HashSet <String> ();
		
		for (String n : ListContainingDuplictaes) {
			if(!tempSet.add(n)) {
				resultSet.add(n);
				System.out.println("Temp in if Set"+tempSet);
				System.out.println("Result Set"+resultSet);
			}
			System.out.println("Temp Set"+tempSet);
		}
		return resultSet;
	}
	
}
