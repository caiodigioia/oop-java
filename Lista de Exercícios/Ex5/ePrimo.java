import java.util.Scanner;

public class ePrimo {

    public static boolean checaPrimo (int num) {
        if (num <= 1) {
            return false;
        }
        else if (num <= 3) {
            return true;
        }
        else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        // verifica pela regra da divisão

        for (int i = 5; i * i <= num; i++) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (checaPrimo(num)) {
            System.out.print("O número " + num + " é primo!");
        }
        else {
            System.out.print("O número " + num + " não é primo!");
        }
    }

}
