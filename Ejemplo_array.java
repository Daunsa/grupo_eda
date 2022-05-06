public class Ejemplo_array {
    public static void main(String[] args) {
        System.out.println("Ejemplo de uso de array:");
        String[] animales = {"perro", "gato", "canario"};
        System.out.println(animales[0]);
        animales[0] = "perrote";
        System.out.println("Cambiando variable");
        System.out.println(animales[0]);
        System.out.println("Largo del array: " + animales.length);
    }
}
