
public class SortingOnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,1,8,1};
		
	    int temp;
	    for (int i=0;i<5;i++) {
	    	for(int j=i+1;j<5;j++) { // important logic
	    		if(a[i]>a[j]) {
	    			temp = a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    			
	    		}
	    		
	    	}
	    }
	    for(int i=0;i<5;i++) {
System.out.print(a[i]);
	}

}
}
