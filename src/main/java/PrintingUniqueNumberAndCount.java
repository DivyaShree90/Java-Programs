import java.util.*;
public class PrintingUniqueNumberAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,2,3,3,3,4,4,5};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
			
			for(int j=i+1;j<a.length;j++) {
				
			if(a[i]==a[j]) {
				k++;
			}
			}
			System.out.println(a[i]);
			System.out.println(ab);
			System.out.println(k);
			if(k==1) {
				System.out.println("the unnique no is "+a[i]);
			}
			}
			
		}
		
		
	}

}
