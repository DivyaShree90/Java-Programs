
public class MaxNumberForArray {
	
	public static void main(String[] args) {
		
		int list [] = {1,4,2,3,2};
		MaxNumberForArray maxValue = new MaxNumberForArray();
		maxValue.findMaxNumber(list);
		
	}

	private void findMaxNumber(int[] list) {
		// TODO Auto-generated method stub
		
		int maxOne = 0;
		int maxTwo = 0;
		
		for(int n : list) {
			if(maxOne<n) {
				
				maxTwo =maxOne;      //0     1    2    
				maxOne = n;    
				
			}else if(maxTwo<n){
				maxTwo =n;
				
			}
		}
		System.out.println("Max1 - " + maxOne);
	    System.out.println("Max2 - " + maxTwo);
	}

}
