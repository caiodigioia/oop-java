public class Stack<E> {
    private final int size; // número de elementos na pilha
    private int top; // localização do elemento superior
    private E[] elements; // array que armazena elementos na pilha

    // construtor sem argumento cria uma pilha do tamanho padrão
    public Stack() {
        this(10); // tamanho padrão da pilha
    }

    // insere o elemento na pilha; se bem-sucedido retorna true;
    public void push(E pushValue) {
        if (top == size - 1) { // se a pilha estiver cheia
            throw new StackException(String.format("Stack is full, cannot push %s", pushValue));
        }
        elements[++top] = pushValue; // insere pushValue na Stack
    }

    // remove e retorna o elemento superior da Stack
    public E pop() {
        if (top == -1) { // se pilha estiver vazia
            throw new StackException("Stack is empty, cannot pop");
        }
        return elements[top--]; // remove e retorna o elemento superior da Stack
    }

    // construtor cria uma pilha com o número especificado de elementos
    public Stack(int s) {
        size = s > 0 ? s : 10; // configura o tamanho da Stack
        top = -1; // Stack inicialmente vazia
        elements = (E[]) new Object[size]; // cria o array
    }
}
