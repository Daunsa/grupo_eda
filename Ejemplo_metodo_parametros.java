public class Ejemplo_metodo_parametros {
    public static void main(String[] args) {
        metodo("pollo frito");
        metodo("ensalada");
        metodo("pan");
    }
    
    static void metodo(String comida) {
        System.out.println("Hola mi comida favorita es " + comida);
    }
}
