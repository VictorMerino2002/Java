import java.util.Scanner;


public class r680 {

   public static Scanner input = new Scanner(System.in);

   public static void calcStops(int totalDistance, int capableDistance, int recoil) {
       int stops = 0;
       int traveledDistance = 0;

       while (traveledDistance < totalDistance) {
           stops++;

           traveledDistance += capableDistance;

           if (traveledDistance >= totalDistance) break;

           traveledDistance -= recoil;
           if (traveledDistance <= 0) {
               System.out.println("IMPOSIBLE");
               return;
           }
       }
       System.out.println(stops);
   }
   public static void main(String[] args) {
       int numOfCases = input.nextInt();
       for (int i = 0; i < numOfCases; i++) {
               int totalDistance = input.nextInt();
               int capableDistance = input.nextInt();
               int recoil = input.nextInt();
               calcStops(totalDistance,capableDistance,recoil);
       }
   }
}   

