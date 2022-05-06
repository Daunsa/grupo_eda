public class Ejemplo_iteracion_array {
    public static void main(String[] args) {
        System.out.println("Ejemplo de iteracion de array:");
        String[] animales = {"perro", "gato", "canario"};
        for (int i = 0; i <= animales.length; i += 1) {
            System.out.println("Iteracion numero " + i + " animal: " + animales[i]);
        }
    }
}
