import java.util.Scanner;

public class Imc {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite a sua altura (em m): ");
        double altura = sc.nextDouble();

        double resultado = peso / (altura * altura);

        if (resultado < 18.5) {
            System.out.printf("Você está abaixo do seu peso ideal. O seu IMC é: %.2f", resultado);
        }
        else if (resultado >= 18.5 && resultado <= 24.9) {
            System.out.printf("Você está no peso ideal. O seu IMC é: %.2f", resultado);
        }
        else if (resultado >= 25 && resultado <= 29.9) {
            System.out.printf("Você está acima do seu peso ideal (sobrepreso). O seu IMC é: %.2f", resultado);
        }
        else if (resultado >= 30 && resultado <= 34.9) {
            System.out.printf("Você está acima do seu peso ideal (obesidade grau I). O seu IMC é: %.2f", resultado);
        }
        else if (resultado >= 35 && resultado <= 39.9) {
            System.out.printf("Você está acima do seu peso ideal (obesidade grau II). O seu IMC é: %.2f", resultado);
        }
        else if (resultado >= 40) {
            System.out.printf("Você está acima do seu peso ideal (obesidade grau III). O seu IMC é: %.2f", resultado);
        }
    }
}
