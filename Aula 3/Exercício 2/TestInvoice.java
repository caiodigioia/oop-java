import java.util.Scanner;

public class TestInvoice {

    public static void main (String arg[]) {
    
        // declaracao de variaveis
        Scanner sc;
        Invoice inv; // invoice sendo criada
        String codFatura, descFatura;
        int quantidadeItens;
        double precoItem;
        
        // inicializacao
        sc = new Scanner(System.in);
        
        
        // leitura, intanciacao e escrita de uma invoice
        System.out.print("Entre código fatura: ");
        codFatura = sc.nextLine();
        while(!codFatura.equals("exit")) {
            System.out.print("Entre descricao fatura: ");
            descFatura = sc.nextLine();
            
            System.out.print("Entre quantidade itens fatura: ");
            quantidadeItens = Integer.parseInt(sc.nextLine());
            
            System.out.print("Entre preco item fatura: ");
            precoItem = Double.parseDouble(sc.nextLine());
            
            // instanciar objeto do tipo Invoice
            
            inv = new Invoice (codFatura, descFatura, quantidadeItens, precoItem);
            
            // escrever fatura
            System.out.println(); // pula linhha
            System.out.println(inv.toString());
            
            // ler novo codigo fatura
            System.out.print("Entre codigo fatura: ");
            codFatura = sc.nextLine();
            
        } // fim while
    }

}
