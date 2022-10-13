
import java.util.*;

public class Star {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(" ");
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
		}
	}

}