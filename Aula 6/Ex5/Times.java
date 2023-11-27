public class Times extends MathOperation {

    public Times (int a, int b) {
        super(a, b);
    }

    public int solve () {
        return a * b;
    }

    public String getOperation () {
        return new String(a + " times " + b);
    }
}
