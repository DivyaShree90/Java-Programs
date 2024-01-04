import java.lang.reflect.Array;
import java.util.Arrays;

public class sortListofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputList = {
			      "Jan", "Feb", "Sep", "Apr", "May", "Jun",
			      "Jul", "aug", "Mar", "Oct", "nov", "Dec"
			    };
		
		// Display list un-sorted order
		showList(inputList);
		
		// Display in sorted order
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
		showList(inputList);
	}

	private static void showList(String[] arrayList) {
		// 
		for(String arr:arrayList) {
			System.out.println(arr +"");
		}
		System.out.println();
	}

}
