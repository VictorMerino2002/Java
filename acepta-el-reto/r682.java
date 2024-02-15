import java.util.Scanner;

public class r682 {

   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
       int numOfCases = input.nextInt();

       for (int i = 0; i < numOfCases; i++) {
           int ducks = input.nextInt();
           int beaks = countBeaks(ducks);
           int legs = countLegs(ducks);
           System.out.println(beaks + " " + legs);
       }
   }

   private static int countLegs(int ducks) {
       return ducks*2;
   }

   private static int countBeaks(int ducks) {
       return ducks;
   }
}

