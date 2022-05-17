import java.util.*;
public class area_triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    double b;
    double a;
    System.out.println("Introduce la base del triángulo");
    b=entrada.nextDouble();
    System.out.println("Introduce la altura del triángulo");
    a=entrada.nextDouble();
    
    double area=b*a/2;
    System.out.println("El área del triángilo es " + area);
	}

}
