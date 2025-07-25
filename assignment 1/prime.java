import java.util.*;
class prime
{
public static void main(String arg[])
{
int count=0;
Scanner sc =new Scanner(System.in);
System.out.println("enter a number to check prime no:");
int num= sc.nextInt();
if(num==2)
{
System.out.println(num+"is a prime number");
}
else
{
for(int i=1;i<=num;i++)
{
if(num %i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(num+"is a prime number");
}
else
{
System.out.println(num+"is not a prime number");
}
}
}
}
/*ubuntu@ubuntu-OptiPlex-3020:~$ gedit prime.java
ubuntu@ubuntu-OptiPlex-3020:~$ javac prime.java
ubuntu@ubuntu-OptiPlex-3020:~$ java prime
enter a number to check prime no:
4
4is not a prime number
ubuntu@ubuntu-OptiPlex-3020:~$ java prime
enter a number to check prime no:
13
13is a prime number*\

