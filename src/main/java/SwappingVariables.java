
public class SwappingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 5;
		int b= 10;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a"+a);
		System.out.println("b"+b);
		
		
		//Swapping without temp
		
		a = a+b;
		a=a-b;
		b=b-a;
		System.out.println("without temp"+"a"+a+"b"+b);
		
		// Take two string s1 and s2 which we need to swap using substring
		String s1 = "Rahul";
		String s2 = "Shetty";

		
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2; //RahulShetty
		System.out.println("s1 length =" + s1.length());//11
		System.out.println("s2 length=" + s2.length());//6
		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length());//(0,5)
		s1 = s1.substring(s2.length()); 

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
	
		}
		

	}


