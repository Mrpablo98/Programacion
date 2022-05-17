package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n=entrada.nextInt();
		
		if(n>=1) {
			
			for(double i=1;i<=n;i++) {
				double x=1/i;
				suma=suma+x;
			}
			System.out.println("La suma es: " + suma);
		}
        entrada.close();
	}

}
