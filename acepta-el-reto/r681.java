import java.util.Arrays;
import java.util.Scanner;

public class r681 {

    public static Scanner input  = new Scanner(System.in);

    public static int[] getPieces(int numOfPieces) {
        int[] pieces = new int[numOfPieces];

        for (int i=0;i<numOfPieces;i++) pieces[i] = input.nextInt();
        return pieces;
    }

    public static void displayMaxNumOfPieces(int[] pieces) {
        Arrays.sort(pieces);
        long sum = pieces[pieces.length - 1];

        for (int i = pieces.length - 2; i >= 0; i--) {
            int lastPiece = pieces[i + 1];
            if (lastPiece <= 1) break;
            if (pieces[i] >= lastPiece) pieces[i] = lastPiece - 1;
            sum += pieces[i];
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        while (input.hasNext()) {
            int numOfPieces = input.nextInt();

            int[] pices = getPieces(numOfPieces);
            displayMaxNumOfPieces(pices);
        }
    }
}
