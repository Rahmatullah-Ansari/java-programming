import java.io.*;
public class create_file {
    public static void main(String[] args) {
        File file = new File("rahmat.txt");
        String write_content="How are you!";
        try(Writer wr =new BufferedWriter(new FileWriter(file))){
            wr.write(write_content);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("File created and written successfully!!");
    }
}
