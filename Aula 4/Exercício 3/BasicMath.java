import java.util.Scanner;

public class BasicMath {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int sub(int a, int b) {
        return a - b;
    }
    
    public static int mult(int a, int b) {
        return a * b;
    }
    
    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return 0;
        }
        return a / b;
    }
    
}
