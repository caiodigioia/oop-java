public class Exe4 {

    public static void main (String args[]) {
        int a, b;
        String operation;

        // verificar os argumentos
      if (args.length != 3) {
        System.err.println("Erro: número de argumentos inválido.");
        System.err.println("Uso: java Exe4 <operando> <operando> <operador>");
        System.exit(0);
      }  else {
        
            try {
                // extracao dos arumentos-operandos
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);  

                System.out.println(a + " " + args[2] + " " + b + " = " + executaOperacao(a, b, args[2]));
            } catch (NumberFormatException nfe) {
                System.err.println("Erro: formato operando: " + nfe);
                System.exit(0);

            } catch (InvalidOperationException ioe) {
                System.err.println("Erro: formato operando: " + ioe);
                System.exit(0);
            }

    }

}

    public static int executaOperacao(int a, int b, String operation) throws InvalidOperationException {

        switch(operation) {
            case "add":
                return (a + b);
            case "sub":
                return (a - b);
            case "times":
                return (a * b);
            default:
                throw new InvalidOperationException(operation);
        }

    }

 }
