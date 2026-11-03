import java.sql.SQLOutput;
import java.util.Scanner;

class MainApp {
    private static int sumEven(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Sum = " + sumEven(arr));
    }
}

