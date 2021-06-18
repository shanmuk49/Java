package pack1;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = obj.nextInt(); // 5
		int f = 1;
		for(int i=1; i <= n ; i++ )
		{
			f = f*i; // 1*2*3*4*5 = 120
		}
System.out.println("Factorial of "+ n+" = "+ f);
	}}
