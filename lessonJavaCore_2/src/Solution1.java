public class Solution1 {
    public static void main(String[] arg) {
        String phrase = "Рассерженный Родион Романович раскричался:" +
                " Рано радовались, размокший ремень рюкзака разорвался";

        String phraseWithFix = phrase.replace("р", "*").replace("Р", "*");
        System.out.println(phraseWithFix);
    }
}
