import java.util.Scanner;


public class r678 {

   public static Scanner input = new Scanner(System.in);

   public static int findIndexOfMatch(char letter, char[] array) {
       for (int i=0; i<array.length;i++) {
           if (array[i] == letter) return i;
       }
       return -1;
   }


   public static boolean isEmpty(char[] letters) {
       for (char letter : letters) if (letter != (char) 0) return false;
       return true;
   }


   public static void printResult(int MAX_FAILS, int playerFails, char[] notFoundLetters) {
       if (isEmpty(notFoundLetters)) System.out.println("SALVADO");
       else if (playerFails >= MAX_FAILS) System.out.println("AHORCADO");
       else if (playerFails < MAX_FAILS) System.out.println("COLGANDO");
   }
   public static void playGame(String secretWord, String playerLetters) {
       final int MAX_FAILS = 7;
       int playerFails = 0;


       char[] notFoundLetters = secretWord.toCharArray();
       char[] usedLetters = new char[30];
       int usedLettersIndex = 0;


       for (int i=0;i<playerLetters.length();i++){
           char letter = playerLetters.charAt(i);
           int indexOfMatch = findIndexOfMatch(letter,notFoundLetters);
           if (indexOfMatch == -1 && findIndexOfMatch(letter,usedLetters) == -1) {
               playerFails++;
               usedLetters[usedLettersIndex] = letter;
               usedLettersIndex++;
           }
           else if (indexOfMatch != -1){
               notFoundLetters[indexOfMatch] = (char) 0;
               if (isEmpty(notFoundLetters)) break;
           }
       }
       printResult(MAX_FAILS,playerFails,notFoundLetters);

   }
   public static void main(String[] args) {
       String secretWord,playerLetters;


       while (!(secretWord = input.nextLine()).equals(".")) {
           playerLetters = input.nextLine();

           String secretWordLowerCase = secretWord.toLowerCase();
           String playerLettersLowerCase = playerLetters.toLowerCase();
           playGame(secretWordLowerCase,playerLettersLowerCase);
       }


   }
}

