public class Fibonacci {
 public static void main (String[] args) {
 
 	int num_anterior1 = 0;
 	int num_anterior2 = 0;
 	int num = 1;
 	
 	
 	System.out.println("Os 10 primeiros números de Fibonacci são: ");
 	for (int i = 0; i < 10; i++) {
 	
 	
 	num_anterior2 = num_anterior1;
 	num_anterior1 = num;
 	System.out.println(num);
 	num = num_anterior1 + num_anterior2;
 	}
 		
     }
 }
