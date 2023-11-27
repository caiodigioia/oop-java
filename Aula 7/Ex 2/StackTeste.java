public class StackTeste {

    public static void testPushDouble (Stack<Double> stack, double[] elements) {
        try {
            System.out.println();
           for (int i =0; i < elements.length; i++) {
                System.out.println("-> Empilhando: " + elements[i]);
                stack.push(elements[i]); // empilha o elemento

            }

        } catch (StackException se) {
            System.out.println();
            System.err.println("## " + se);
        }
        
    }

    public static void testPushInteger (Stack<Integer> stack, int[] elements) {
         try {
            System.out.println();
           for (int i =0; i < elements.length; i++) {
                System.out.println("-> Empilhando: " + elements[i]);
                stack.push(elements[i]); // empilha o elemento

            }

        } catch (StackException se) {
            System.out.println();
            System.err.println("## " + se);
        }
    }

    public static void testPopDouble (Stack<Double> stack) {
        try {
            System.out.println();
            while(true) {
                System.out.println("-> Desempilhando: " + stack.pop());
            }
        } catch (StackException se) {
            System.out.println();
            System.err.println("## " + se);
        }

    }

    public static void testPopInteger (Stack<Integer> stack) {
        try {
                System.out.println();
                while(true) {
                    System.out.println("-> Desempilhando: " + stack.pop());
                }
            } catch (StackException se) {
                System.out.println();
                System.err.println("## " + se);
            }

        }




    public static void main(String args[]) {
        double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        Stack<Double> doubleStack; // a pilha armazena objetos Double
        Stack<Integer> integerStack; // a pilha armazena objetos Integer
        doubleStack = new Stack<Double>(5);
        integerStack = new Stack<Integer>(10);
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);
    }


}

    
