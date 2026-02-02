import java.util.Vector;

public class StackVector<T> implements IStack<T> {
    
    private Vector<T> miVector;

    public StackVector(){
        miVector = new Vector<>();
    }

    // metodo para meter un valor al vector
    public void push(T dato){
        miVector.add(dato);
    }

    // metodo para sacar un valor del vector
    public T pop(){
        return miVector.remove(miVector.size()-1);
    }

    // metodo para ver el último elemento sin borrarlo
    public T peek(){
        return miVector.lastElement();
    }

    // verifica si el vector no tiene componentes
    public boolean isEmpty(){
        return miVector.isEmpty();
    }

    // devuelve el tamaño del vector
    public int size(){
        return miVector.size();
    }

    // se limpia y queda vacío el vector
    public void clear(){
        miVector.clear();
    }

}
