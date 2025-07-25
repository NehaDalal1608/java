//how to write in the file
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class CreatingNewFile2 {
    public static void main(String args[])
{
    try{
        InputStream fread=new FileInputStream("D:\\DYP CET\\java training\\neha.txt");
        Reader freader= new InputStreamReader(fread);
        int data= freader.read();
        while(data != -1){
            System.out.println((char)data);
            data = freader.read();
        }
        }
        catch(Exception e){
          e.printStackTrace();
        }
}
}
