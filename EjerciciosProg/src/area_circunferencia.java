import java.util.*;
public class area_circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.1416;
		double p;
		double r;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el perímetro de la circunferencia");
		p=entrada.nextDouble();
		System.out.println("Introduce el radio de la circunferencia");
		r=entrada.nextDouble();
		
		double area=p*pi*r;
		System.out.println("El área de la circunferencia es "+ area);

	}

}
