public class Exe1 {

    public static void main (String args[]) {

      // declaracao de variaveis
      int a, b;
      CalculadoraBasica calc;

      // verificar os argumentos
      if (args.length != 3) {
        System.err.println("Erro: número de argumentos inválido.");
        System.err.println("Uso: java Exe1 <operando> <operando> <operador>");
        System.exit(0);
      }  else {
        // extracao dos arumentos-operandos
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);  

        // instancia calculadora basica
        calc = new CalculadoraBasica();

        // verificar o operador e executar a operacao
        switch(args[2]) {
            case "add":
                System.out.println(a + " add " + b + " = " + calc.add(a, b));
                break;
            case "sub":
                System.out.println(a + " sub " + b + " = " + calc.sub(a, b));
                break;
            case "times":
                System.out.println(a + " times " + b + " = " + calc.times(a, b));
                break;
            default:
                System.err.println("Erro: operador desconhecido: (" + args[2] + ")");
        }
      }
    }

}
