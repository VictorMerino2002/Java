import java.io.*;
import java.util.Scanner;

public class r677 {

   public static String elevarCuadratMultiple5(long num) {
       if (num == 5) return "25";

       long numWithOut5 = num / 10;

       String elevatedNum = (numWithOut5 * (numWithOut5+1)) + "25";
       return elevatedNum;
   }

   public static void elCuadradoDelCinco() {
       Scanner input = new Scanner(System.in);

       int numOfInputs = input.nextInt();
       long num;
       for (int i=0;i<numOfInputs;i++) {
           num = input.nextLong();
           String elevatedNum = elevarCuadratMultiple5(num);
           System.out.format("%s%n",elevatedNum);
       }
   }
   public static void main(String[] args) throws IOException {
       elCuadradoDelCinco();
   }
}