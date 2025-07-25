package convert;
import java.lang.*;
import java.util.*;
class opreations
{
	int num,i;
	long fact=1,cube;
	public void factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();

		for(i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number is:"+fact);

	}

	public void cube()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		cube=num*num*num;
		System.out.println("cube of given number is:"+cube);


	}
}
