import java.util.*;
public class devuelve_resto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    double x;
    double y;
    System.out.println("Introduce un número");
    x=entrada.nextDouble();
    System.out.println("Introduce un número");
    y=entrada.nextDouble();
    
    double resto=x%y;
    System.out.println("El resto es " + resto);
	}

}
