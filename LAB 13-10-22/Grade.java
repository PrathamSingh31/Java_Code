 import java.util.*;

public class Grade {

	public static void main(String[] args) {
		
		System.out.print("Enter your Percentage : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println();		
		if(a>=90 && a<=100)	{		
			System.out.println("You got A Grade  ");		
		}
		else if(a>=80 && a<90)	{		
			System.out.println("You got A1 Grade ");		
		}
		else if(a>=70 && a<80)	{
			System.out.println("You got B Grade  ");	
		}
		else if(a>=60 && a<70)	{
			System.out.println("You got B1 Grade  ");
		}
		else if(a>=40 && a<60)	{
			System.out.println("You got C Grade ");
		}
		else if(a>35 && a<40)	{
			System.out.println("You got D Grade  ");
		}
		else if(a>=0 && a<35)	{	
			System.out.println(" Fail ");
		}else {
			System.out.println(" Input is Invalid");
		}
		

	}

}