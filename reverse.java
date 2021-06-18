package Number_programs;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt();
		int rev= 0 , rem ;
		while(n != 0)
		{
			rem = n%10;
			rev = rev *10 + rem ; 
			n = n/10; 
		}
	System.out.println("Reverse = "+rev);
	}}
