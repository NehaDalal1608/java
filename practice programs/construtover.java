import java.util.*;
class construtover
{
  int rn;
  String nm;
  construtover()  //default constructor
  {
    rn=1;
    nm="abc";
  }
    construtover (int r,String n)
 {
    rn=r;
    nm=n;      //parametrized
}    
    void display ()
{
     System.out.println("Roll no="+rn);
     System.out.println("name=" +nm);
}
 public static void main(String args[])
 {
   construtover ob1=new construtover();
   ob1.display();
  construtover ob2=new construtover(2,"xyz");
  ob2.display();
  }
  }
    
