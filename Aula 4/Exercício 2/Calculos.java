import java.util.Scanner;

public class Calculos {

    public static void main(String args[]) {
        System.out.print("Digite o raio: ");
        Scanner sc = new Scanner(System.in);
        double raio;
        raio = sc.nextDouble();
        

        double pi = Math.PI;

        double perimetro = 2 * pi * raio;
        double area = pi * raio * raio;
        double volume = 4.0 / 3.0 * pi * raio * raio * raio;

        System.out.printf("O perímetro é: %.4f%n", perimetro);
        System.out.printf("A área é: %.4f%n", area);
        System.out.printf("O volume é: %.4f%n", volume);
    }
}
