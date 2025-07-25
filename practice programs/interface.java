import java.util.*;



interface area
{
  final double pi=3.14;
  double compute (double h,double w);
}
class rect implements area
{
public double compute (double h,double w)
{
  return(h*w);
}
}
class triangle implements area
{
public double compute(double h,double w)
{
  return 0.5*h*w;
}
}
class ifdemo
{
public static void main(String args[])
{
       rect r=new rect();
       triangle t=new triangle ();
       area a;
       a=r;
      System.out.println("area=" +a.compute(10,20));
      a=t ;
      System.out.println("area=" +a.compute(10,7));
}
}



/*ubuntu@ubuntu-OptiPlex-5090:~$ java ifdemo
area=200.0
area=35.0
*\
                             


  
    
