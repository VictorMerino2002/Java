import java.util.Arrays;
import java.util.Scanner;

public class r100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCases = input.nextInt();

        for (int i = 0; i < numOfCases; i++) printNumOfLaps(input.nextInt());
    }

    public static void printNumOfLaps(int n) {
        int kaprekar = 6174;
        int laps = 0;

        while (n != kaprekar) {
            if (n == 0) {
                laps = 8;
                break;
            }
            n = calcKaprekarLap(n);
            laps++;
        }
        System.out.println(laps);
    }

    public static int calcKaprekarLap(int n) {
        int sortedNum = sortNum(n);
        int reverseSortedNum = reverseSortNum(n);

        return reverseSortedNum - sortedNum;
    }

    public static int sortNum(int n) {
        int m = n/1000;
        int c = n/100 - m*10;
        int d = n/10 - (m*100 + c*10);
        int u = n%10;

        int[] nums = {u,d,c,m};
        Arrays.sort(nums);

        return nums[0]*1000 + nums[1]*100 + nums[2]*10 + nums[3];
    }

    public static int reverseSortNum(int n) {
        int m = n/1000;
        int c = n/100 - m*10;
        int d = n/10 - (m*100 + c*10);
        int u = n%10;

        int[] nums = {u,d,c,m};
        Arrays.sort(nums);

        return nums[3]*1000 + nums[2]*100 + nums[1]*10 + nums[0];
    }
}
