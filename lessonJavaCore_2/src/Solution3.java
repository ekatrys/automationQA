import java.util.Scanner;

public class Solution3 {
    public static void main(String[] arg) {
        int inputChar;
        boolean inputCharBelongsNeedSegment = false;
        boolean inputCharInt;
        boolean inputCharBelongsNeedInterval;

        do {
            System.out.println("Введите чило от 5 до 155:");
            Scanner reader = new Scanner(System.in);
            inputCharInt = reader.hasNextInt();

            if (inputCharInt) {
                inputChar = reader.nextInt();
                inputCharBelongsNeedSegment = inputChar >= 5 & inputChar <= 155;
                inputCharBelongsNeedInterval = inputChar > 25 & inputChar < 100;

                if (inputCharBelongsNeedSegment) {
                    if (inputCharBelongsNeedInterval) {
                        System.out.println(String.format("Число %d содержится в интервале (25,100)", inputChar));
                    } else {
                        System.out.println(String.format("Число %d не содержится в интервале (25,100)", inputChar));
                    }
                } else System.out.println("Вы немного промахнулись с числом , может еще раз?:)");
                continue;
            } else System.out.println("Вы ввели что-то не то, попробуйте еще раз:)");
        }
        while (!inputCharInt || !inputCharBelongsNeedSegment);
    }

}

