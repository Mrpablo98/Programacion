package ejercicios_if_switch3;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);

		System.out.print("Introduce x ");
		double x=entrada.nextDouble();
		System.out.print("Introduce y ");
		double y=entrada.nextDouble();
		double resultado=0;
		
		if (y==0) {
			resultado=30+x;
		}
		else if(x!=0) {
			resultado=(6*x)/y;
		}
		
		else {
			resultado=3/y;
		}
		
		System.out.println("Resultado: "+resultado);
	}

}
