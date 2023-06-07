import java.io.File;
import java.io.IOException;
public class LearningCreateAFile {
    public static void main(String args[]){
        try {
            File myObj = new File("Filename.txt");
            if (myObj.createNewFile()){
                System.out.println("File created:"+myObj.getName());
            }else {
                System.out.println("File is already exists.");
            }
        }catch (IOException e){
            System.out.println("An Error occurred. ");
            e.printStackTrace();
        }
    }
}