import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {

            // Crear la pila usando la fábrica
            IStack<Integer> stack = StackFactory.createStack("Vector");

            // Crea la calculadora postfix
            IPostfixCalculator calculator = new PostfixCalculator(stack);

            // Leer el archivo datos.txt
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    int result = calculator.evaluate(line);
                    System.out.println("Expresión: " + line);
                    System.out.println("Resultado: " + result);
                    System.out.println("----------------------");
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
