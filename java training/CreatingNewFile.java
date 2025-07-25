//how to creat a file
import java.io.File;
import java.io.IOException;
public class CreatingNewFile {
    public static void main(String args[])
{
    try{
        File fcreate= new File ("D:\\DYP CET\\java training\\neha.txt");
        if(fcreate.createNewFile()){
            System.out.println("File" +fcreate.getName() + " created successfully.");
        }
        else{
            System.out.println("file is already exist in the directory ");
        }
    }
        catch(IOException exception){
          System.out.println("An unexpected error occured ");
          exception.printStackTrace();
        }
    

}
}
