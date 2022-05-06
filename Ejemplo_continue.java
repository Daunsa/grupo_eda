public class Ejemplo_continue {
    public static void main(String[] args) {
        System.out.println("Ejemplo de uso de continue:");
        int i = 0;
        while (i < 7) {
            if (i == 4) {
                System.out.println("Interrupcion");
                i++;
                continue;
            }
            System.out.println("Iteracion numero " + i);
            i++;
        }
    }
}
