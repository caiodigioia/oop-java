import java.util.Scanner;

public class TesteEmpregado {

    public static void main(String args[]) {
        Scanner sc;
        Empregado emp = null; // empregado sendo criado
        String primeiro_nome, sobrenome;
        double salario;

        // inicialicação
        sc = new Scanner (System.in);

        // leitura, intanciacao e escrita de um novo empregado

        System.out.print("Digite o nome do empregado: ");
        primeiro_nome = sc.nextLine();
        while(!primeiro_nome.equals("exit")) {
            System.out.print("Digite o sobrenome: ");
            sobrenome = sc.nextLine();

            System.out.print("Digite o salário: ");
            salario = sc.nextDouble();

        // instancia novo empregado
        emp = new Empregado (primeiro_nome, sobrenome, salario);

        // escrever empregados
        System.out.println(); // pula linha
        System.out.println(emp.toString());

        // ler novo empregado

        System.out.print("Digite o nome do empregado: ");
        primeiro_nome = sc.next();


        } // fim while
        if (emp != null) {
        System.out.println("Deseja aumentar os salários? ");
        System.out.println("1) Sim");
        System.out.println("2) Não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.print("Qual deve ser o percentual de ajuste? ");
            double aumento = sc.nextDouble();

            // Aumentar o salário de todos os empregados
            emp.aumentaSalario(aumento);

            // Reexibir todas as informações atualizadas
            System.out.println("\nInformações após o reajuste de " + aumento + "%");
            System.out.println(emp.toString());
            }
        }
    }
}
