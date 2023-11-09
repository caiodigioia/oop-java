import java.util.Scanner;

public class Numerais {

    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Digite um número: ");
    int num = sc.nextInt();

    System.out.println("Os numerais que formam esse número são: ");

     String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            System.out.println(digit);
        }

    }

}
