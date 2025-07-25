package convert;
import java.lang.*;
import java.util.*;
class conversion 
{
	int num;
	public void getData()
	{
		System.out.println("\nDecimal to HexaDecimal,Ocatal and Octal to binary");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number:");
		num=sc.nextInt();
	}

	public void convert()
	{
		String hexa =Integer.toHexString(num);
		System.out.println("HexaDecimal Value is:"+hexa);

		String oct=Integer.toOctalString(num);
		System.out.println("Octal Value is:"+oct);

		String binary=Integer.toBinaryString(num);
		System.out.println("Binary Value is:"+binary);
		String octal=Integer.toOctalString(num);
		System.out.println();
	}
}
