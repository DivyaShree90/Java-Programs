
public class SumOfGivenDigits {
	
	public static void main(String args[]) {
		System.out.println(getSumOfAllDigits(345));
	}
	public static int getSumOfAllDigits(int num) {

		// Declare variable sum which will store the sum of all digits.
		int sum = 0;

		// Run a while loop until the num becomes 0.
		while (num != 0) {
		int rem = num % 10;   
		sum = sum + rem; 
		num = num / 10; 
		System.out.println("Rem :" +rem +"sum :"+sum +"num :" +num);
		}
		return sum;

		}
}
