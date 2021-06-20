package Number_programs;
import java.util.*;
public class gcd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = obj.nextInt(); 
		int b = obj.nextInt(); 
		int GCD =1;
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
				GCD = i; 
		}
System.out.println("GCD = "+GCD);
	}}
