import java.util.Arrays;

public class Solution4 {
    public static void main(String[] arg) {
        String phrase = "Я у мамы программист";
        String[] arrayPhrase = phrase.toLowerCase().replace(" ", "").split("");
        Arrays.sort(arrayPhrase);

        int index = 0;
        String result = "";
        String[] arrayPhraseSortWithoutReepeats = new String[arrayPhrase.length];

        for (String i : arrayPhrase) {
            if (!i.equals(result)) {
                arrayPhraseSortWithoutReepeats[index] = i;
                result = i;
                index++;
            }
        }
        String[] arrayPhraseSortWithoutReepeatsAndWithoutNull = Arrays.copyOf(arrayPhraseSortWithoutReepeats, index);

        System.out.println(Arrays.toString(arrayPhraseSortWithoutReepeatsAndWithoutNull));
    }
}
