import java.util.*;
public class ejemplo_IfElse {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double m=0;
		if(numero1<numero2) {
			m=numero2;
		}
		else {
			m=numero1;
		}
		System.out.println("El numero mayor es: " + m);
	}
}
