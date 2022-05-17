import java.util.*;
public class ecuación_segundogrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		int a;
		int c; 
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce 'a'");
		a=entrada.nextInt();
		System.out.println("Introduce 'b'");
		b=entrada.nextInt();
		System.out.println("Introduce 'c'");
		c=entrada.nextInt();
		
		double resultado=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("El resultado de la ecuación es " + resultado);
		
		double resultado1=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("El resultado de la ecuación es " + resultado1);
		
		
		
 
	}

}
