import java.util.Scanner;

public class Tabuada {

    

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println("" + i + " x " + n + " = " + i*n);
        }
    }

}
