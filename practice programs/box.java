class box
{
  double length;
  double width,height;
  box(double l,double w,double h);
{
  length =l;
  width =w;
  height =h;
}

double volume()
{
  return (length*width*height);
}
}
class  boxweigth extends box
{
  double weigth;
  boxweigth(double l,double w,double h,double wt)
{
  super(l,w,h);
  weigth=wt;
}
public static void main(String args[])
{
  boxweigth ob=new boxweigth(10,20,30,40);
  System.out.println("weigth=" +ob.weigth);
  System.out.println("volume=" +ob.volume());
}
}
