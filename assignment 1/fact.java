import java.util.*;
class fact
{
public static void main (String a[ ])
{
    int num,fact=1;
    Scanner sc=new Scanner (System.in);
     System.out.println("enter a number:");
     num=sc.nextInt();
     int i;
     for(i=1;i<=num;i++)
     fact=fact*i;
    System.out.println("factorial=  "+fact);
}
}




 
