import java.io.*;
import java.util.*;

public class TypingTest {
    private static Random rand = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String fileName = "C:\\Users\\PolinaYoga\\Desktop\\words.txt";
        File wordList = new File(fileName);
        List<String> words = new ArrayList<>();
        Scanner reader = null;

        try {
            reader = new Scanner(wordList);
        } catch (FileNotFoundException e) {
            System.out.println("file \"" + fileName + "\" not found");
            System.exit(0);
        }

        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            words.add(word);
        }

        String result = playGame(words);
        System.out.println("Your score: " + result);
    }

    public static String playGame(List<String> words) {
        int wordNum = words.size();
        String attempt;
        int place;
        int correct = 0;

        for(int i = 0; i < 10; i++) {
            place = rand.nextInt(wordNum);
            String s = words.get(place);
            System.out.println(s);
            attempt = input.next();
            if (attempt.equals(s)) {
                words.remove(s);
                wordNum = words.size();
                correct++;
            }
        }
        return Integer.toString(correct) + "/" + 10;
    }
}