/*
* demonstrate if-else statement of 5
* subjects.the person who gets above 60% will be
* passed otherwise failed.output should be
* like:Enter your name,Enter marks for the 5 subjects.
* Name : Pratham Singh
* Date : 11/10/22
*/

package Loop;

public class Result {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your java Marks: ");
		int a=sc.nextInt();
		System.out.println("Enter your python Marks: ");
		int b=sc.nextInt();
		System.out.println("Enter your c++ Marks: ");
		int c=sc.nextInt();
		System.out.println("Enter your IOT Marks: ");
		int d=sc.nextInt();
		System.out.println("Enter your C# Marks: ");
		int e=sc.nextInt();
		
			int per = ((a+b+c+d+e)/5);
			
			System.out.println();
			System.out.println(" You got "+per+"%");
			if(per>=60)	{
				
				System.out.println("Your are Pass ");
			}
			else	{
				System.out.println("You are Fail ");
			}

	}

}