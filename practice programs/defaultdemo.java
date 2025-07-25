import java.util.*;
interface A1
{
  public void sq(int a);
  default void show()
{ 
        System.out.println("This is default method ");
}
}
  class defaultdemo implements A1
{
  public void sq(int a)
{
        System.out.println("square="+(a*a));
}
  public static void main(String args[])    
{
        defaultdemo ob=new defaultdemo();
        ob.sq(4);
        ob.show();
}
}   



/*ubuntu@ubuntu-OptiPlex-5090:~$ java defaultdemo
square=16
This is default method 
*\
