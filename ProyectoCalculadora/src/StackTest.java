import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StackTest {

    @Test
    public void testPushPop() {
        // prueba para meter y sacar valores
        StackVector<Integer> pila = new StackVector<>();
        pila.push(10);
        pila.push(20);
        
        // El último en entrar (20) tiene que salir primero
        int resultado = pila.pop();
        
        assertEquals(20, resultado);
    }

    @Test
    public void testIsEmpty() {
        // Prueba para verificar si detecta que está vacía
        StackVector<Integer> pila = new StackVector<>();
        assertTrue(pila.isEmpty()); // Debería ser verdadero
        
        pila.push(5);
        assertFalse(pila.isEmpty()); // Ahora debería ser falso
    }
    
    @Test
    public void testSize() {
        // Prueba sobre tamaño de pila
        StackVector<Integer> pila = new StackVector<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        assertEquals(3, pila.size());
    }
}