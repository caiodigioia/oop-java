public class VolumeEsfera {

	
	
	public static void main(String args[]) {
	
	double raio,
	volume;
	
	for (raio = 0.0 ; raio <= 20; raio += 0.5) {
		
		volume = (4*3.14*raio*raio*raio)/3;
		System.out.printf("R = %4.1f V = %8.2f\n", raio, volume);
	
	} 


	} 

}
