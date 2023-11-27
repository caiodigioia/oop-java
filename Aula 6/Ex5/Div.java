public class Div extends MathOperation {

    public Div (int a, int b) {
        super(a, b);
    }

    public int solve () {
        return a / b;
    }

    public String getOperation () {
        return new String(a + " div " + b);
    }
}