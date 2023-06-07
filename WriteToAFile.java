import java.io.FileWriter;
import java.io.IOException;
public class WriteToAFile {
    public static void main(String args[]){
        try{
            FileWriter MyWriter = new FileWriter("Filename.txt");
            MyWriter.write("Files in java might be tricky,but it is fun");
            MyWriter.close();
            System.out.println("Successfully wrote the file");

        }catch (IOException e){
            System.out.println("An error occerred");
            e.printStackTrace();
        }
    }
}
