import java.util.*;
class methover
{
  void addition (int a,int b)
{
   System.out.println("Addition=" +(a+b));
}
   void addition (String a,String b)
{
   System.out.println("Addition=" +(a+b));
}
public static void main (String args[])
{
  methover ob=new methover ();
  ob.addition(2,5);
  ob.addition("hello","welcome");
}
}         
