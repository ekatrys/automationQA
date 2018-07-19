public class Solution2 {
    public static void main(String[] arg) {
        String phrase = "Рассерженный Родион Романович раскричался:" +
                " Рано радовались, размокший ремень рюкзака разорвался";

        for (String character:phrase.split("")){
            if (character.equals("Р") || character.equals("р") ) {System.out.print("*");}
            else {System.out.print(character);}
        }
    }
}
