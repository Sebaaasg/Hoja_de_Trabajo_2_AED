public class PostfixCalculator implements IPostfixCalculator {

    private IStack<Integer> stack;

    public PostfixCalculator(IStack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public int evaluate(String expression) throws Exception {

        // Limpia la pila antes de evaluar
        stack.clear();

        // Separa la expresión por espacios
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            // Si es un número, se hace push
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }
            // Si es operador
            else if (isOperator(token)) {

                // Valida que existan suficientes operandos
                if (stack.size() < 2) {
                    throw new Exception("Error: operandos insuficientes");
                }

                int operandoB = stack.pop();
                int operandoA = stack.pop();

                int resultado = operate(operandoA, operandoB, token);
                stack.push(resultado);
            }
            else {
                throw new Exception("Error: token inválido -> " + token);
            }
        }

        // Al final solo debe quedar un resultado
        if (stack.size() != 1) {
            throw new Exception("Error: expresión inválida");
        }

        return stack.pop();
    }

    // Verifica si el token es un número entero positivo
    private boolean isNumber(String token) {
        return token.matches("\\d+");
    }

    // Verifica si es un operador válido
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/") ||
               token.equals("%");
    }

    // Realiza la operación aritmética
    private int operate(int a, int b, String operator) throws Exception {

        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new Exception("Error: división entre cero");
                }
                return a / b;
            case "%":
                if (b == 0) {
                    throw new Exception("Error: módulo entre cero");
                }
                return a % b;
            default:
                throw new Exception("Operador no válido");
        }
    }
}
