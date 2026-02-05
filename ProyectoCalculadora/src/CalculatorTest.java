import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

        @Test
public void testSumaSimple() throws Exception {

        // se crea el escenario para la prueba
        IStack<Integer> stack = new StackVector<>();
        PostfixCalculator calc = new PostfixCalculator(stack);

        int resultado = calc.evaluate("1 2 +");
        assertEquals(3, resultado);
        
        }

        @Test
        public void testEjemploHojaTrabajo() throws Exception {

        // El ejemplo de la ht2 ((1+2)*4)+3
        IStack<Integer> stack = new StackVector<>();
        PostfixCalculator calc = new PostfixCalculator(stack);

        int resultado = calc.evaluate("1 2 + 4 * 3 +");

        // Debería dar 15
        assertEquals(15, resultado);

        }

}