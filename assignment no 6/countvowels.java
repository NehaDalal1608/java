import java.util.*;
class countvowels
{
 public static void main(String[] args)
 {
  int count=0;
  char ch;
  {
   try
   {
   FileInputstream fis = new FileInputStream("Sample1.text");
   do
   {
    int i=fis.read();
    ch=(char)i;
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
    count++;
    }
    while(i!=-1)
    {
    catch(FileNotFoundException e)
    catch(IOException e)
    
    System.out.println(e);
    
    }
  }
  }
  }
  
