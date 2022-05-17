package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el número");
		
		int n=entrada.nextInt();
		
		for(int i=2;i<n;i++) {
			
			
			if(i>=1&&i!=n&&n%i==0) {
				System.out.println("El número introducido no es primo");
				break;
			}else{
				System.out.println("El número introducido es primo");
				break;
			}
			
		}

	}

}
