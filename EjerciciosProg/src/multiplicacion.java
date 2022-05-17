import java.util.Scanner;

public class multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		double x;
		double y;
		
		System.out.println("Introduce un número");
		x=entrada.nextDouble();
		System.out.println("Introduce el número");
		y=entrada.nextDouble();
		
		double resultado=x*y;
		System.out.println("El resultado es "+ resultado);

	}

}
