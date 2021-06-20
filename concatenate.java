package Number_programs;
import java.util.*;
public class concatenate {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = obj.nextInt(); 
		int b = obj.nextInt(); 
		String s = Integer.toString(a);
		String s1 = Integer.toString(b);
		String s3 = s + s1;
		System.out.println(s3);
		int c = Integer.parseInt(s3);
		System.out.println(c);
	}}
