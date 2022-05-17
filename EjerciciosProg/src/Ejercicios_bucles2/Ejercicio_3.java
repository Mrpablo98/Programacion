package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n=entrada.nextInt();
		int producto=n;
		if(n>0) {
			for(int i=1;i<n;i++) {
				int x=n-i;
				producto=producto*x;
			}
			System.out.println("El factorial de n es: " + producto);
		}else {
			System.out.println("El número introducido no es válido");
		}
        
	}

}
