public class Ejemplo_metodo_sobrecarga {
    public static void main(String[] args) {
        System.out.println(metodo(5, 10));
        System.out.println(metodo(2.3, 4.1));
    }
    
    static int metodo(int numero1, int numero2) {
       return numero1 * numero2;
    }
    static double metodo(double numero1, double numero2) {
        return numero1 / numero2;
     }
}
