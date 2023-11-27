public class StackException extends RuntimeException{ // construtor sem argumento
            public StackException(){
            this( "Could not perform operation" ); }

            // construtor de um argumento

            public StackException( String exception ){ 
                super( exception );
            }
    }
