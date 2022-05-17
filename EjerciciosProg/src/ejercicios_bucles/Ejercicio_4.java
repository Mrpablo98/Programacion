package ejercicios_bucles;
import java.util.*;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce el número: ");
    int x=entrada.nextInt();
    for (int i=0;i<11;i++)
    	System.out.println(x*i);
    entrada.close();
	}

}
