/*create a program for calculation.read three values from the user for operation first and second values are operands. third value is operator.
  if user press1=>print addition of first and second ,if user press2=>print substraction of first and second,if user press3=>print multiplication of first and second
  if user press4=>print division of first and second 
  Name:-Pratham singh  
  Date : 6-10-22
 */

import java.util.*;

public class Calculation {

	public static void main(String[] args) {
		int add;
		int sub;
		int mul;
		int div;
		
		Scanner sc=new Scanner(System.in);  
		
		System.out.println(" 1 :- Add two number ");   
		System.out.println(" 2 :- Sub two number ");      
		System.out.println(" 3 :- Mul two number ");
		System.out.println(" 4 :- Div two number ");
		int op =sc.nextInt();                  
		
		System.out.println("Enter any two Number: ");  // input from user
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		switch(op)    // using switch case
		{
		case 1: // Addition
			add=n1+n2;
			System.out.println("addition of two number: "+add); 
			break;
			   
		case 2:  // Subraction
			sub=n1-n2;
			System.out.println("subtraction of two number: "+sub);
			break;
		
		case 3: // Multiplication
			mul=n1*n2;
			System.out.println("Multiplication of two number:"+mul);
			break;
			
		case 4:  // Division
			div=n1/n2;
			System.out.println("division of two number:"+div);
			break;
	
		}
		
		
}

}