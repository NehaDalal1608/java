import java.util.*;
interface shape
{
public float  area(float l,float b);
}
class rectangle implements shape
{
public float area(float l,float b)
{
return l*b;
}
}
class triangle implements shape
{
public float area(float l,float  b)
{
return (0.5f*l*b);
}
}
class Areainterface 
{
public static void main(String ar[])
{
shape s;
rectangle r=new rectangle();
triangle t=new triangle();
s=r;
System.out.print("Area of rect:"+s.area(5,2));
s=t;
System.out.print("Area of triangle :"+s.area(10f,20f));
}
}
/*
buntu@ubuntu-OptiPlex-5090:~$ gedit Areainterface.java
ubuntu@ubuntu-OptiPlex-5090:~$ javac Areainterface.java
ubuntu@ubuntu-OptiPlex-5090:~$ java Areainterface
Area of rect:10.0Area of triangle :100.0ubuntu@ubuntu-OptiPlex-5090:~$ 

*/
