import java.util.Scanner;

public class TesteEuler {

    public static void main (String args[]) {
        //declaracao variaveis
        Scanner sc;
        Euler euler;
        int termos;
        
        // Inicializacao scanner
        sc = new Scanner(System.in);
        
        // leitura nro
        System.out.println("Entre com o nro de termos: ");
        termos = sc.nextInt();
        
        euler = new Euler(termos);
        System.out.println("Constante e: " + euler.getE());      
    
    }

}
