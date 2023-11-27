public class InvalidOperationException extends Exception {

    private String invalidOperation;

    public InvalidOperationException(String operation) {
        super();
        invalidOperation = operation;
    } 

    public String toString() {
        return invalidOperation + " not supported!";
    }

}