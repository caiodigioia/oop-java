public class Fibonacci {
 public static void main (String[] args) {
 	
 	// declaração de variáveis
 	int num_anterior1, num_anterior2, // termos antecessores da sequência
 	num, // primeiro número d Fibonacci
 	soma;
 	
 	// inicialização
 	num_anterior1 = 0;
 	num_anterior2 = 0;
 	num = 1;
 	soma = 0;
 	
 	
 	// Exibe a mensagem inicial
 	System.out.println("Os 10 primeiros números de Fibonacci são: ");
 	for (int i = 0; i < 10; i++) {
 	
 	// Lógica de substituição de variáveis
 	num_anterior2 = num_anterior1;
 	num_anterior1 = num;
 	soma += num;
 	// Printa o número de Fibonacci
 	System.out.print(num + " ");
 	
 	// Redefine o número inicial como o atual
 	num = num_anterior1 + num_anterior2;
 	}
 	
 	System.out.println();
 	System.out.println("A soma é: " + soma);
 	System.out.println("A média é: " + (float)soma/10);
 		
     }
 }
