class Student
{
	protected int rollNo;
	public Student(int rollNo)
	{
	this.rollNo = rollNo;
	}
}
class Test extends Student
{
	public int sub1;
	public int sub2;
   public Test(int rollNo,int sub1,int sub2)
{
	super(rollNo);
	this.sub1 = sub1;
	this.sub2 = sub2;
}
}
class Result extends Test
{
	public Result(int rollNo,int sub1,int sub2)
	{
	super(rollNo,sub1,sub2);
	}
public void displayResult()
	{
  System.out.println("Roll No:"+rollNo);
  System.out.println("Subject 1 marks:"+sub1);
  System.out.println("Subject 2 marks:"+sub2);
	}
}
 class multilevel
{
	public static void main(String args[])
	{
	Result res = new Result(10,23,43);
	res.displayResult();
	}
}
/*
ubuntu@ubuntu-OptiPlex-3020:~$ javac multilevel.java
ubuntu@ubuntu-OptiPlex-3020:~$ java multilevel
Roll No:10
Subject 1 marks:23
Subject 2 marks:43
*/
