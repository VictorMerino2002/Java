import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radarDistance = input.nextDouble() / 1000;
        double maxVel = input.nextDouble();
        double hours = input.nextDouble() / 3600;

        while (!(radarDistance == 0 && maxVel == 0 && hours == 0)) {
            if (radarDistance <= 0 || maxVel <= 0 || hours <= 0) System.out.println("ERROR");
            else {
                double vel = radarDistance / hours;
                if (vel < maxVel) System.out.println("OK");
                else {
                    maxVel *= 1.2;
                    if (vel < maxVel) System.out.println("MULTA");
                    else System.out.println("PUNTOS");
                }
            }
            radarDistance = input.nextDouble() / 1000;
            maxVel = input.nextDouble();
            hours = input.nextDouble() / 3600;
        }
    }
}
