import java.util.Scanner;

public class TesteInteiroNaoNegativo {

    public static void main (String args[]) {
        //declaracao variaveis
        Scanner sc;
        InteiroNaoNegativo inn;
        int nro;
        
        // Inicializacao scanner
        sc = new Scanner(System.in);
        
        // leitura nro
        System.out.println("Entre com o nro desejado: ");
        nro = sc.nextInt();
        
        inn = new InteiroNaoNegativo(nro);
        System.out.println("Inteiro não negativo: " + inn.getNumero());
        System.out.println("Fatorial: " + inn.fatorial());        
    
    }

}
