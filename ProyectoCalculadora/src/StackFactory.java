public class StackFactory {
    
    public static <T> IStack<T> createStack(String tipo){

        // se compara si el tipo de de stack a crear tiene el mismo contenido que "Vector"
        if (tipo.equals("Vector")) {

            // Se instancia un vector porque ese el tipo seleccionado
            IStack<T> miVector = new StackVector<>();
            return miVector;
        }
        else{
            return null;
        }
    }
}
