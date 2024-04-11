import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfCases = input.nextInt();

        for (int i = 0; i < numOfCases; i++) {
            int num = input.nextInt();
            int lastDigit = calculateLastDigitOfFactorial(num);
            System.out.println(lastDigit);
        }

    }

    public static int calculateLastDigitOfFactorial(int num) {
        if (num == 0 || num == 1) return 1;

        int lastDigit = 1;
        for (int i = 2; i <= num; i++) {
            lastDigit = (lastDigit * i) % 10;
            if (lastDigit == 0) break;
        }
        return lastDigit;
    }
}
