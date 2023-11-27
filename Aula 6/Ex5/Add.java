public class Add extends MathOperation {

    public Add (int a, int b) {
        super(a, b);
    }

    public int solve () {
        return a + b;
    }

    public String getOperation () {
        return new String(a + " add " + b);
    }
}