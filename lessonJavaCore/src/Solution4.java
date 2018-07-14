public class Solution4 {

    public static void main(String[] arg) {
        int n, sum;
        n = 23;
        sum = 0;

        // Если заложиться, что число n может быть не 2х значным
        for (int numbers = n; numbers != 0; numbers /= 10) {
            sum += (numbers % 10);
        }
        System.out.println("Сумма цифр числа " + n + " равна " + sum);

         /*
        Если же оставить тот факт, что n всегда будет 2х значным:
        byte n = 23;
        System.out.println("Сумма цифр числа " + n + " равна " + (n % 10 + (n / 10) % 10));
         */
    }
}
