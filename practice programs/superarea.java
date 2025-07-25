class  shape
{
  double length;
  double width;
  shape(double l,double w)
{
  length = l;
  width = w ;
}
}
  class triangle extends shape
{
  triangle(double len,double w)
{
  super(len,w);
}

void area()
{
  System.out.println("triangle area=" +(0.5*length*width));
}

}
  class rectangle extends shape
{
  rectangle(double len,double w)
{
  super(len,w);
}
void area()
{
  System.out.println("rectangle area=" +(length*width));
}
}
class superarea
{
  public static void main(String args[])
{
  triangle t = new triangle (10,20);
  rectangle r = new rectangle (10,30);
  t.area();
  r.area();
}
}
   
/*ubuntu@ubuntu-OptiPlex-5090:~$ gedit superarea.java
ubuntu@ubuntu-OptiPlex-5090:~$ javac superarea.java
ubuntu@ubuntu-OptiPlex-5090:~$ java superarea
triangle area=100.0
rectangle area=300.0
*\    
