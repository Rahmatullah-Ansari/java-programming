import java.io.*;
import java.io.FileInputStream;
public class read_content
{
    public static void main(String args[])
    {
        final String file_Name="rahmat.txt";
         
        try
        {
            File file=new File(file_Name);
            if(!file.exists())
            {
                System.out.println("could not find file!");
                System.exit(0);
            }
            //reading content from file
            int value;
            //object of FileOutputStream
            FileInputStream fileInput=new FileInputStream(file);
            //read text from file
            System.out.print("File content = ");
            while((value=fileInput.read())!=-1)
            {
                System.out.print((char)value);
            }     
            fileInput.close();         
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}

