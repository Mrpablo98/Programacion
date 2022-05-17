package ejercicios_bucles;
import java.util.*;
public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int media=0;
	int pares=0;
	System.out.println("Introduce un número");
    Scanner entrada=new Scanner(System.in);
    int N=entrada.nextInt();
    for(int i=1;i<N;i++)
    	if(i%2==0) {
    		System.out.println(i);
    		pares++;
    		media=media+i;
    	}
    System.out.println("Hay " + pares + " números pares");
    System.out.println("La media aritmética es: " + media/pares);
	}

}
