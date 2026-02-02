public interface IPostfixCalculator {

    /**
     * Evalúa una expresión en notación Postfix
     * @param expression expresión postfix (ej: "1 2 + 4 * 3 +")
     * @return resultado entero de la expresión
     * @throws Exception si la expresión es inválida
     */
    public int evaluate(String expression) throws Exception;
}
