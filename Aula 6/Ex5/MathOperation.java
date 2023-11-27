public abstract class MathOperation {
    protected int a, b;

    // Construtor

    public MathOperation (int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Operações

    public abstract int solve ();

    public abstract String getOperation ();




}