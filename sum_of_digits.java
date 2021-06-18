package Number_programs;
import java.util.*;
public class sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); 
		int sum= 0 , rem ;
		while(n != 0) 
		{
			rem = n%10;
			sum = sum + rem; 
			n = n/10; 
		}
	System.out.println("sum of digits = "+sum);
	}}
