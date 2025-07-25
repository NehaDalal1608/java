import java.util.*;
class multicatch
{
 public static void main(String args[])
{ 
try
{
 int a=args.length;
    System.out.println("a="+a);
 int b=42/a;
 int c []={1};
     c[42]=99;
}
catch(ArithmeticException e)
{
  System.out.println("divide by 0" +e);
}
catch(ArrayIndexOutOfBoundsException e1)
{
 System.out.println("Array index out of range" +e1);
}
}
}   
    
/*ubuntu@ubuntu-OptiPlex-5090:~$ java multicatch
a=0
divide by 0java.lang.ArithmeticException: / by zero
*\    
