public class Ejemplo_array_multidimensional {
    public static void main(String[] args) {
        System.out.println("Ejemplo de iteracion de array:");
        String[][] animales ={{"perro1", "gato1", "canario1" }, {"perro2", "gato2", "canario2" }, {"perro3", "gato3", "canario3" }};
        for (int i = 0; i < animales.length; i ++) {
            for (int j = 0; j < animales[i].length; j++) {
                System.out.println(animales[i][j]);
            }
        }
    }
}
