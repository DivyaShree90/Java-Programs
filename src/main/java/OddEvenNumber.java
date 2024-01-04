import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String args[]) {
		int num=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no:");
		num= s.nextInt();
		
		
		
		if (num%2==0) {
			System.out.println("Number Even");
			
		}else {
			System.out.println("ODD");
		}
	

	}
}
