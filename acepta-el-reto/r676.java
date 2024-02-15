import java.util.Scanner;

class PianoDays {
   int day28 = 0;
   int day29 = 0;


   public void checkDays(int year) {
       if ( (year%4 == 0 && year%100 !=0) || (year%400 == 0) ) this.day28++;
       else this.day29++;
   }
}

public class r676 {
   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

       int numOfInputs = input.nextInt();

       for (int i = 0; i < numOfInputs; i++) {
           PianoDays pianoDays = new PianoDays();
           int firstYear = input.nextInt();
           int lastYear = input.nextInt();

           for (int year = firstYear; year <= lastYear; year++) pianoDays.checkDays(year);

           System.out.println(pianoDays.day29+" "+pianoDays.day28);
       }
   }
}
