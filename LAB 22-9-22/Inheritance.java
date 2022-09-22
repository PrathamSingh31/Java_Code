class X 
{
   void funcA()
   {
      System.out.println("This is class X");
   }
}

class Y extends X
{
   void funcB() 
   {
      System.out.println("This is class Y");
   }
}

class Z extends Y
{
   void funcC() 
   {
      System.out.println("This is class Z");
   }
}
public class Inheritance 
{
public static void main(String args[]) 
{
      Z obj = new Z();
      obj.funcA();
      obj.funcB();
      obj.funcC();
   }

   
}