import java.io.*;

public class Copiador {

    public static void main (String args[]) {
        // declaracao de variaveis
        BufferedReader in = null;
        BufferedWriter out = null;
        char[] buffer;
        int carac;


        if (args.length != 2) {
            System.out.println("Número de argumentos inválido.");
            System.out.println("Uso correto: Java Copiador.java <arquivo de origem> <arquivo de fim>");
            System.exit(0);

        }

        // Converte os argumentos
        String origem = (args[0]);
        String fim = (args[1]);

        // tenta abrir arquivo de entrada e saída
        try {
            in = new BufferedReader(new FileReader(origem));
            out = new BufferedWriter(new FileWriter(fim));
            

            // tenta ler 20 caracteres
            carac = in.read();
            while (carac != -1) { // não chegou no final do arquivo
                out.write(carac);
                carac = in.read();
            }

            
            
        } catch (FileNotFoundException fnfe) {
            System.err.println("Arquivo não encontrado: " + fnfe);
            System.exit(0);
        } catch (IOException ioe) {
            System.err.println("Erro leitura/escrita: " + ioe);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                
                if (out != null) {
                    out.close();
                }
                
            } catch (IOException ioe) {
            System.err.println("Erro fechamento arquivos: " + ioe);
        }

        

        // Seta o buffer de leitura

        





        }

    }
}
