import java.util.Arrays;
import java.util.TreeSet;

public class Solution4 {
    public static void main(String[] arg) {
        String phrase = "Я у мамы программист";
        String[] arrayPhrase = phrase.toLowerCase().replace(" ", "").split("");

        Arrays.stream(arrayPhrase).distinct().sorted().forEach(System.out::print);

//  Так же можно сделать с использованием класса TreeSet
//        TreeSet<String> arrayPhraseSort = new TreeSet<String>(Arrays.asList(arrayPhrase));
//        System.out.println(arrayPhraseSort);
    }
}
