
public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0 , num2=1, num3, count = 9;
		System.out.print(num1+" "+num2);
		for(int i=1;i<count;++i) {
			num3 = num1 +num2; //0+1 1+1 
			System.out.print(" "+num3);
			
			num1= num2; //1   1
			num2= num3; //1   2
			
		}
		
		
		
	}

}
