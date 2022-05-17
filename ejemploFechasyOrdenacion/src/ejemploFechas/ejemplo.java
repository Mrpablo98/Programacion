package ejemploFechas;

import java.time.LocalDate;
import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		LocalDate fechaNacimiento;
				
		System.out.print("Dime fecha nacimiento: ");
		String fechaNacimientoString=entrada.nextLine();
		
		fechaNacimiento=UtilidadesFechas.String_a_LocalDate(fechaNacimientoString);
	
		int años=(int) UtilidadesFechas.anhos_hasta_hoy(fechaNacimiento);
		
		System.out.println("Años: "+años);
		
		entrada.close();

	}

}
