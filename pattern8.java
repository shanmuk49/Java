package pack1;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5;i++) // 5 rows - 1,2,3,4,5
		{
		for (int j =5; j>=1; j--) // 5 4 3 2 1
		{
			System.out.print((char)(i+64));			
		}
		System.out.println();
		}
	}}
