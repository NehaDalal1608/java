class A
{
   int m;
}
class B extends A
{
   int m;
   B(int a,int b)
{
   super.m=a;
   m=b;
}
void show()
{
   System.out.println("super class variable value =" +super.m);
   System.out.println("subclass variable value=" +m);
}
public static void main(String args[])
{
   B ob=new B(10,20);
   ob.show();
}
}   
