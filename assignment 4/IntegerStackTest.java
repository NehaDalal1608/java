import java.util.*;
import java.lang.*;

interface Stack
{
 void push(int item);
 int pop();
 void display();
 boolean overflow();
 boolean underflow();
}
class IntegerStack implements Stack
{
 private int[]stackArray;
 private int top;
 private int cap;

 public IntegerStack(int size)
 {
   
  stackArray=new int[size];
  top=-1;
  cap=size;
 }
 public void push(int item)
 {
   if(!overflow())
   {
    stackArray[++top]=item;
   }
   else
   {
    System.out.println("Stack overflow");
   }
 }
 public int pop()
 {
  if(!underflow())
  {
   return stackArray[top--];
  }
  else
  {
   System.out.println("stack underflow");
   return -1;
  }
 }
 public void display()
 {
  if(!underflow())
  {
   System.out.println("stack:");
   for(int i=0;i<=top;i++)
   {
     System.out.print(stackArray[i]+"\t");
   }
    
    System.out.println();
  }
  else
   {
     System.out.println("stack underflow");
    }
  }
 public boolean overflow()
 {
   return top==cap-1;
 }  

 public boolean underflow()
 {
   return top==-1;
 } 
}
public class IntegerStackTest
{
 public static void main(String []args)
 {
  final int size=10;
  IntegerStack s1=new IntegerStack(10);
  int item,choice;
  
  System.out.println("\n1.push\n2.pop\n3.display\n4.exit");

  
  while(true)
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the choice :");
    choice=sc.nextInt();

    switch(choice)
    {
      case 1:
           System.out.println("Enter the item to push :");
           item=sc.nextInt();
           s1.push(item);
           break;

     case 2:
           s1.pop();
           System.out.println("The item deleted :");
           break;

     case 3:
           s1.display();
           break;

     case 4:
           
           System.exit(1);
           break;

    default:
          System.out.println("Invalid choice");
   }
  }  
}
}









