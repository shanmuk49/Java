package Number_programs;
import java.util.*;
public class fe_or_fo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter  number: ");
		int num = obj.nextInt(); 
		int n = num; 
		int f = 1, d;
		while( num != 0)
		{
			d = num%10;
			num = num/10;
			if(n%2==0 && d%2==1)
			{ 
				f=2;
				break;
			}
			else if(n%2==1 && d%2==0)
			{
				f =2;
				break;
			}
		}
		if(f==1 && n%2==0)
			System.out.println("Full Even number");
		else if(f==1 && n%2==1)
			System.out.println("Full Odd number");
		else
			System.out.println("Mixed number");
	}

}
