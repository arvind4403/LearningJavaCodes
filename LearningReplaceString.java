import java.io.*;

public class LearningReplaceString {
    static void modifyFile(String filePath , String oldString , String newString){
        File fileToBeModify = new File(filePath);
        String oldContent = "nice";
        BufferedReader reader = null;
        FileWriter writer= null;
        try{
            reader = new BufferedReader(new FileReader(fileToBeModify));
            String line = reader.readLine();
            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldContent,newString);
            writer = new FileWriter(fileToBeModify);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        modifyFile("C:\\Users\\krarv\\IdeaProjects\\java101\\src\\sentiment.txt", "nice", "bad");
        System.out.println("Done");
    }
}
