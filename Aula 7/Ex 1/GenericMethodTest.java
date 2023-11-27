public class GenericMethodTest {

    public static void printArray (Object[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println();
    }

    // main * não mexer *
    public static void main( String args[] ) {
    
    // cria arrays de Integer, Double e Character
    Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println( "Array integerArray contains:" ); printArray( integerArray ); 
    System.out.println( "\nArray doubleArray contains:" ); printArray( doubleArray ); 
    System.out.println( "\nArray characterArray contains:" ); printArray( characterArray );
        }
}
