import java.lang.Object;
class garbage
{
  public static void main(String arges[])
 {
    bye m=new bye();
    m.finalize();
    m.finalize();
    m=null;
    System.gc();
    System.out.println("main completes");
}
protected void finalize()
{
    System.out.println("finalize method  override");
}
} 

/*ubuntu@ubuntu-OptiPlex-5090:~$ java garbage
finalize method  override
finalize method  override
main completes
finalize method  override*\

