package ejercicios_bucles;
import java.util.*;
public class Ejercicio_13 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int[] sueldo=new int[12];
		int suma=0;
		
		for(int i=0;i<12;i++) {
			System.out.println("Introduce el sueldo de los empleados");
			sueldo[i]=entrada.nextInt();
			suma=suma+sueldo[i];
			
			
		}
	System.out.println("La media de los sueldos es: " + suma/12);
	int mayor=sueldo[0];
	
	for(int i=1;i<12;i++) {
		
		int num_actual=sueldo[i];
		if(num_actual>mayor) {
			mayor=num_actual;
		}
		
	}System.out.println("Mayor: " + mayor);
	
	int menor=sueldo[0];
	
	for(int x=1;x<12;x++) {
		
		int num_actual=sueldo[x];
		if(num_actual < menor) {
			menor=num_actual;
		}
	
	}System.out.println("Menor: " + menor);
	
	entrada.close();
	}

}
