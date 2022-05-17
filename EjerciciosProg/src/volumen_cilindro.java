import java.util.*;
public class volumen_cilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura;
		double radio;
		double pi=3.1416;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la altura");
		altura=entrada.nextDouble();
		System.out.println("Introduce el radio");
		radio=entrada.nextDouble();
		
		double resultado=altura*(radio*radio)*pi;
		System.out.println("El volumen del cilíndro es " + resultado + "cm cúbicos");
				
				
				
				
				
		
	

	}

}
