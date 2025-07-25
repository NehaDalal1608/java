import java.util.*;
   class asendorder
{
   public static void main (String args[])
{
   int  a[]=new int [10];
   Scanner sc=new Scanner (System.in);
   System.out.println("enter the elements:");
   for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
   Arrays.sort(a);
   System.out.println("sorted array:");
   for(int i=0;i<10;i++)
   System.out.println(a[i]);
}
}

/*ubuntu@ubuntu-OptiPlex-3020:~$ java asendorder
enter the elements:
5 9 6 7 1 0 4 3 2 8
sorted array:
0
1
2
3
4
5
6
7
8
9
\*

