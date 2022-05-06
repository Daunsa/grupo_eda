public class Ejemplo_break {
    public static void main(String[] args) {
        System.out.println("Ejemplo de uso de break:");
            for (int i = 0; i <= 10; i += 1) {
                if(i == 4){
                    System.out.println("Interrupcion");
                    break;
                }
                System.out.println("Iteracion numero " + i);
            }
    }
}
