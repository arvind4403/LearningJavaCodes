import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class SentimentAnalysis {

    public static final String POSITIVE = "positive";
    public static final String NEGATIVE = "negative";


    public static void main(String[] args) throws Exception {

        // Hello World
        System.out.println("*** Hello World ***");


        // Read a file
        String file ="C:\\Users\\krarv\\IdeaProjects\\java101\\src\\sentiment.txt" ;


        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();

        //Loop using "while" until there is nothing to read.

        Map<String, String> wordToSentinents = new HashMap<>();

        while(currentLine != null){
            System.out.println(" Reading from file "+currentLine);
            //Split line using "="
            String[] sentiments = currentLine.split("=");

            System.out.println(" First element of sentiments array "+sentiments[0]);
            System.out.println(" Second element of sentiments array "+sentiments[1]);
            System.out.println("================================");

            fillMap(wordToSentinents, sentiments[0], sentiments[1]);

            currentLine = reader.readLine();

        }
        reader.close();

    }
    private static void fillMap(Map<String, String> wordToSentinents, String sentiment, String words) {
        String[] wordArr = words.split(",");
        for(String word : wordArr){
            wordToSentinents.put(word, sentiment);
        }

        System.out.println(" Map "+wordToSentinents);
    }
}