public class Fibonacci {
 public static void main (String[] args) {
 	
 	// declaração de variáveis
 	int num_anterior1, num_anterior2, // termos antecessores da sequência
 	num = 1; // primeiro número d Fibonacci
 	
 	// inicialização
 	int num_anterior1 = 0;
 	int num_anterior2 = 0;
 	int num = 1;
 	
 	
 	// Exibe a mensagem inicial
 	System.out.println("Os 10 primeiros números de Fibonacci são: ");
 	for (int i = 0; i < 10; i++) {
 	
 	// Lógica de substituição de variáveis
 	num_anterior2 = num_anterior1;
 	num_anterior1 = num;
 	// Printa o número de Fibonacci
 	System.out.println(num);
 	
 	// Redefine o número inicial como o atual
 	num = num_anterior1 + num_anterior2;
 	}
 		
     }
 }
