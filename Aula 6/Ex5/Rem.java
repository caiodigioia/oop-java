public class Rem extends MathOperation {

    public Rem (int a, int b) {
        super(a, b);
    }

    public int solve () {
        return a % b;
    }

    public String getOperation () {
        return new String(a + " rem " + b);
    }
}