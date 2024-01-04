import java.util.Scanner;

public class primeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number :");
		int input = scan.nextInt();
		
		if(checkNumIsPrime(input))
		{
			System.out.println(+input+ "is prime");
			}else {
				System.out.println(+input+ "is not prime");
			}
		}

	private static boolean checkNumIsPrime(int input) {
		// TODO Auto-generated method stub
		
		if(input<=1) {
		return false;
		}
		for (int i=2;i<input;i++) {
			System.out.println("inside for");
			if(input%i==0) {
				System.out.println("inside if");
				return false;
			}
		}
		return true;
	}
		
	}


