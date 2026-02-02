public interface IStack<T> {

    // Valor a meter al stack, siguiendo LIFO (Last In First Out )
    public void push(T dato);

    // Valora sacar del stack, siguiendo LIFO
    public T pop();

    // Validar si está vacío el Stack para evitar errores
    public boolean isEmpty();

    public T peek();

    public int size();

    public void clear();

} 
