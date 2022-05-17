package ejercicios_bucles;
import java.util.*;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce un número");
    int n=entrada.nextInt();
    for(int i=1;i<n;i++)
    	System.out.println(i+(i-1));
    
	}

}
