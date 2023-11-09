import java.util.Scanner;

public class Fibonacci {

    public static boolean checaFibonacci (int num) {
        int penult_num = 0;
        int ultimo_num = 1;
        int fib = penult_num;

        while (fib < num) {
            fib = ultimo_num + penult_num;
            penult_num = ultimo_num;
            ultimo_num = fib;
        }

        if (fib == num) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        // classifica os números
        int numaux = num1;
        if (num1 < num2) { // se num1 for menor do que num2
            num1 = num2; // num1 vira o maior numero
            num2 = numaux; // num2 vira o menor numero
        }


        for (int i = num2; i < num1; i++) {
            if (checaFibonacci(i)) {
                System.out.println(i);
            }
        }

    }

}
