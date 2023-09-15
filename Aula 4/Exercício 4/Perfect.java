public class Perfect {

	public static void main (String args[]) {
	
		for (int i = 2; i <= 1000; i++) {
			if (perfect(i)) {
				System.out.println(i);
			}
		}
	
	}
	
	public static boolean perfect(int num) {
	
		int somaParcial = 1;
		
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) { // i é fator do num
				somaParcial += i;
			}
		}
		
		if (somaParcial == num) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
