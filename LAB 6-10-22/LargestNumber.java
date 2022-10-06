/*
Create a program to find largest of two numbers
Name:- pratham singh
date:- 6-10-22
*/


import java.util.Scanner;

public class LargestNumber
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest;

      Scanner scan = new Scanner(System.in);
       // input from the user
      
      System.out.print("Enter the First Number: ");

      numberOne = scan.nextInt();

      System.out.print("Enter the Second Number: ");

      numberTwo = scan.nextInt();
      //using if else statement
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      // printing largest number
      System.out.println("\nLargest = " +largest);

   }
}