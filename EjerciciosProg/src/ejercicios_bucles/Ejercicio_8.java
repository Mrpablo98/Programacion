package ejercicios_bucles;
import java.util.*;
public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce un número");
    int N=entrada.nextInt();
    int i=4;
    for(i=4;i<N;i++)
    if(i%4==0) {
    	System.out.println(i);
    }
    	
	}

}
