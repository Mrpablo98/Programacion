package ejercicios_if_switch3;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		
		Scanner entrada=new Scanner(System.in);

		System.out.print("Introduce un número ");
		a=entrada.nextDouble();
		
		System.out.print("Introduce un número ");
	    b=entrada.nextDouble();
		
		System.out.print("Introduce un operador (+,-,*,/): ");
		entrada.nextLine();
		char operador=entrada.nextLine().charAt(0);
		
		switch(operador) {
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		default:
			System.out.println("Operador no reconocido");
		}
		
		
	}


	

}
