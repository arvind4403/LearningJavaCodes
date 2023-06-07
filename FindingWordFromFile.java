import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FindingWordFromFile {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the word to be found");
        String word = sc1.next();
        boolean flag = false;
        int count = 0;
        System.out.println("Content of the line");
        Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\krarv\\IdeaProjects\\java101\\src\\sentiment.txt"));
        while (sc2.hasNextLine()){
            String line = sc2.nextLine();
            System.out.println(line);
            if(line.indexOf(word)!=-1){
                flag = true;
                count=count+1;
            }
        }
        if(flag){
            System.out.println("File is having some specified word");
            System.out.println("Number of occerance  is : "+count);
        }else {
            System.out.println("File does not contain specified word");
        }
    }
}