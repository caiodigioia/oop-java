public class Calculadora {

    public static void main (String args[]) {

      // declaracao de variaveis
      int a, b;
      MathOperation calc = null; // representa qualquer operacao

      // verificar os argumentos
      if (args.length != 3) {
        System.err.println("Erro: número de argumentos inválido.");
        System.err.println("Uso: java Calculadora <operando> <operando> <operador>");
        System.exit(0);
      }  else {
        // extracao dos arumentos-operandos
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]); 

        // verificar o operador e executar a operacao
        switch(args[2]) {
            case "add":
                calc = new Add(a, b);
                break;
            case "sub":
                calc = new Sub(a, b);
                break;
            case "times":
                calc = new Times(a, b);
                break;
            case "div":
                calc = new Div(a, b);
                break;
            case "remainder":
                calc = new Rem(a, b);
                break;
            default:
                System.err.println("Erro: operador desconhecido: (" + args[2] + ")");
                System.err.println("Os operadores válidos são:" + "\n" + 
                                    "-> add" + "\n" + 
                                    "-> sub" + "\n" + 
                                    "-> div" + "\n" +
                                    "-> times" + "\n" +
                                    "-> rem");
                System.exit(0);
        } // fim switch

        // resolve a operacao e escreve o resultado
        System.out.println(calc.getOperation() + " = " + calc.solve());
      }
    }

}
