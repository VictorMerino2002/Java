import java.util.Scanner;

public class r675 {

    public static int convertirABinario(int n) {
        if (esBinario(n)) {
            return 0;
        }

        String binario = Integer.toBinaryString(n);
        int operaciones = 0;

        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                operaciones++;
            }
        }

        return operaciones;
    }

    public static boolean esBinario(int n) {
        String str = Integer.toString(n);
        return str.matches("[01]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            int resultado = convertirABinario(numero);
            System.out.println(resultado);
        }
    }
}
