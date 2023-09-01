import java.util.Scanner;

public class Leitor {

	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int nro, menor, maior, soma, qtde = 0;
	float media;
	
	menor = 0;
	maior = 0;
	soma = 0;
	qtde = 0;
	
	
	// leitura dos demais nros da sequencia
	System.out.print("Entre com o próximo elemento: ");
	nro = sc.nextInt(); // leitura nro inteiro
	
	
	
	

	
	while (nro > 0) {
	 // processamento e leitura de outros nros
	 if (nro > 0) {
	// testar se maior
	if (nro > maior) {
		maior = nro;
	}
	// testar se menor
	if (nro < menor) {
		menor = nro;
	}
	
	if (menor == 0) {
		menor = nro;
	}
	
	// atualiza soma e quantidade de nros lidos
	soma += nro;
	qtde++;
	
	// ler novo nro
	System.out.print("Entre com o próximo elemento: ");
	nro = sc.nextInt(); // leitura nro inteiro
	}
	else {
	System.out.print("Nenhum número digitado!");
	}
	}
	System.out.println("O maior valor é: " + maior);
	System.out.println("O menor valor é: " + menor);
	System.out.println("A soma é: " + soma);
	System.out.println("A média é: " + (soma / qtde));
	
	
	
	
	
	
	}

}
