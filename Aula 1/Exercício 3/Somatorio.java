public class Somatorio {
 public static void main (String[] args) {
 	int numerador, denominador;
 	float resultado;
 	
 	numerador = 0;
 	denominador = 1;
 	resultado = 0;
 	
 	for (int i = 1 ; i <= 35; i++) {
 	
 	denominador = denominador + 1;
 	numerador = numerador + 5;
 	
 	if (denominador % 2 == 0) {
 		resultado += (float)numerador/denominador;
 	}
 	
 	else {
 		resultado -= (float)numerador/denominador;
 	}
 	

 	}
 	
 	
 	System.out.println("O valor da soma é: " + resultado);
 	
     }
 }
