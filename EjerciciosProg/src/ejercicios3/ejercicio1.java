package ejercicios3;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int año;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce un año");
    año=entrada.nextInt();
    
    if(año%4==0) {
    	System.out.println(año + " Es un año bisiesto");
    }else {
    	System.out.println(año + " No es un año bisiesto");
    }
    
    
	}

}
