//how to write in the file
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class CreatingNewFile1 {
    public static void main(String args[])
{
    try{
        OutputStream fWrite=new FileOutputStream("D:\\DYP CET\\java training\\neha.txt");
        Writer fwriteWriter= new OutputStreamWriter(fWrite);
        fwriteWriter.write("writing using outputstreamwriter!!");
        fwriteWriter.close(); 
        }
        catch(Exception e){
          e.getMessage();
        }
}
}