import java.util.Scanner;

// пусть полежит для порядку

class Numbers {
    public static int getNumbersOutside() throws LessThousandException, NotNumberException {

        System.out.println("Введите чило больше 1000:");
        Scanner reader = new Scanner(System.in);
        boolean inputCharInt = reader.hasNextInt();

        if (inputCharInt == false) throw new NotNumberException();
        else if (reader.nextInt() < 1000) throw new LessThousandException();
        else return reader.nextInt();
    }
}

class LessThousandException extends Exception {
    LessThousandException() {
        super("number less 1000");
    }
}

class NotNumberException extends Exception {
    NotNumberException() {
        super("not number");
    }
}

class Solution_exсeptions {
    public static void main(String[] args) {

        try {
            System.out.println(Numbers.getNumbersOutside());
        } catch (LessThousandException e) {
            System.out.println(e.getMessage());
        } catch (NotNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}