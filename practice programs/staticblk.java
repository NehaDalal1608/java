import java.util.*;
class staticblk
{
  static int a=3;
  static int b=4;
  static void meth(int x )
{
        System.out.println("x="+x);
        System.out.println("a="+a);
        System.out.println("b="+b);
}
  static
{ 
       System.out.println("static block initialized");
       b=a*4;          
}
public static void main(String args[])
{
     meth(10);
}
}
                
/*ubuntu@ubuntu-OptiPlex-5090:~$ java staticblk
static block initialized
x=10
a=3
b=12
*\
