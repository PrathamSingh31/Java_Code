import java.util.Scanner;
class Narrowing { 
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
 double d = sc.nextInt();
long l =(long)d;
int i=(int)l;
System.out.println(d);
System.out.println(l);
System.out.println(i);
}
}