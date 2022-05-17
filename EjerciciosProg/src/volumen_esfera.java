import java.util.*;
public class volumen_esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		double pi=3.1416;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el radio de la esfera");
		radio=entrada.nextDouble();
		
		double resultado=(4*pi*Math.pow(radio, 3))/3;
		System.out.println("El volumen de la esfera es " + resultado);
				

	}

}
