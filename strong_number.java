package Number_programs;
import java.util.*;
public class strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = obj.nextInt(); 
		int fact, rem, sum =0, temp = n;
		while(n != 0)  
		{
			fact =1;
			rem = n%10;  
			int i=1;
			while(i <= rem) 
			{
				fact = fact * i; 
				i++;
			}// end while
			sum = sum + fact; 
			n = n/10; 
		}
		if (sum == temp)
			System.out.println(temp+" is Strong number");
		else
			System.out.println(temp+" is Not Strong number");
	}

}
