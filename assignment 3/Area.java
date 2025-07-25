import java.util.*;
abstract class Shape {
 double dim1;
 double dim2;
 public Shape(double dim1, double dim2) {
 this.dim1 = dim1;
 this.dim2 = dim2;
 }
 public abstract double area();
}
class Rectangle extends Shape {
 public Rectangle(double length, double breadth) {
 super(length, breadth);
 }
 public double area() 
{
 return dim1 * dim2;
 }
}
class Triangle extends Shape 
{
 public Triangle(double base, double height) 
{
 super(base, height);
 }
 public double area() 
{
 return 0.5 * dim1 * dim2;
 }}
public class Area
{
 public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Length of Rectangle: ");
double len=sc.nextDouble();
System.out.println("Enter the Breadth of Rectangle: ");
double br=sc.nextDouble();
sc.nextLine();
System.out.println("Enter the Base of Triangle: ");
double bs=sc.nextDouble();
System.out.println("Enter the Height of Triangle: ");
double ht=sc.nextDouble();
Rectangle rec = new Rectangle(len, br);
 Triangle tri = new Triangle(bs,ht);
 System.out.println("Area of Rectangle: " + rec.area());
 System.out.println("Area of Triangle: " + tri.area());
 
 }
}
/*
ubuntu@ubuntu-OptiPlex-5090:~$ gedit Area.java
ubuntu@ubuntu-OptiPlex-5090:~$ javac Area.java
ubuntu@ubuntu-OptiPlex-5090:~$ java Area
Enter the Length of Rectangle: 
3
Enter the Breadth of Rectangle: 
5
Enter the Base of Triangle: 
2
Enter the Height of Triangle: 
5
Area of Rectangle: 15.0
Area of Triangle: 5.0
ubuntu@ubuntu-OptiPlex-50
*/
