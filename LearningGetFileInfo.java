import java.io.File;
public class LearningGetFileInfo{
    public static void main(String args[]){
        File myObj = new File("Filename.txt");
        if(myObj.exists()){
            System.out.println("File name :"+myObj.getName());
            System.out.println("Absolute path:"+myObj.getAbsolutePath());
            System.out.println("Can write:"+myObj.canWrite());
            System.out.println("Can read : "+ myObj.canRead());
            System.out.println("File size in byte :"+ myObj.length());

        }else{
            System.out.println("File does not exist");
        }

    }
}
