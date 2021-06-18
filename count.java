package Number_programs;
import java.util.*;
public class count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); 
		int c =0;
		while(n != 0) 
		{			
			n = n/10; 
			c++;
		}
    System.out.println("No of Digits  = "+c);
	}}
