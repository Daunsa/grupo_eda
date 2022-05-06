public class Ejemplo_alcance {
    public static void main(String[] args) {
        {
            int variable = 12;
            System.out.println(variable);
        }
        //System.out.println(variable);        Este codigo no sirve debido a que esta en un bloque de codigo diferente
    }
}
