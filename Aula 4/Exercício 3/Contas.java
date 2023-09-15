public class Contas {

    public static void main (String args[]) {
        // declaração de variáveis
        int a, b;
        
        // converter argumentos para variáveis a e b
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);
        
        // verifica e executa a operação desejada
        switch(args[1]) {
            case "plus":
                System.out.println(args[0] + " " + args[1] + " " +
                                   args[2] + " = " + BasicMath.add(a, b));
                break;
            case "minus":
                System.out.println(args[0] + " " + args[1] + " " +
                                   args[2] + " = " + BasicMath.sub(a, b));
                break;
            case "times":
                System.out.println(args[0] + " " + args[1] + " " +
                                   args[2] + " = " + BasicMath.mult(a, b));
                break;
            case "div":
                System.out.println(args[0] + " " + args[1] + " " +
                                   args[2] + " = " + BasicMath.div(a, b));
                break;
            default:
                System.err.println("Erro: " + args[1] + "): operação desconhecida");
            
        }

    }
}
