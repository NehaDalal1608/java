class tryblk
{
  public static void main (String args[])
{     
try
{
  int a=42/0;
        System.out.println(a);
}
  catch(ArithmeticException e)
{
  System.out.println("Arithmetic Exception");
}
}
}     


/*ubuntu@ubuntu-OptiPlex-5090:~$ java tryblk
Arithmetic Exception
ubuntu@ubuntu-OptiPlex*\
