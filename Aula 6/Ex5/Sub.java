public class Sub extends MathOperation {

    public Sub (int a, int b) {
        super(a, b);
    }

    public int solve () {
        return a - b;
    }

    public String getOperation () {
        return new String(a + " sub " + b);
    }
}