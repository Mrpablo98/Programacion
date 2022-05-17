package ejercicios_if_switch3;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
	
    System.out.println("Introduce un número");
    int x=entrada.nextInt();
    
    if(x>=0) {
    	System.out.println("El valor absoluto de x es " + x);
    
    }else {
    	System.out.println("El valor absoluto de x es " + -x);
    }
	}

}
