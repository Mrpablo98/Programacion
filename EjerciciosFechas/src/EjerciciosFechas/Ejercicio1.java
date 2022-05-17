package EjerciciosFechas;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("introduce la primera fecha: (dd/MM/yyyy)");
		String fecha=entrada.nextLine();
		LocalDate Fecha1=LocalDate.parse(fecha, formateador);
		System.out.println("introduce la segunda fecha: (dd/MM/yyyy)");
		String fecha2=entrada.nextLine();
		LocalDate Fecha2=LocalDate.parse(fecha2, formateador);
		LocalDate invierno=LocalDate.of(Fecha1.getYear(), 3, 21);
		LocalDate otonho=LocalDate.of(Fecha1.getYear(), 12, 21);
		LocalDate primavera=LocalDate.of(Fecha1.getYear(), 6, 21);
		LocalDate verano=LocalDate.of(Fecha1.getYear(), 9, 23);
		
		
		if((Fecha1.compareTo(invierno)<0 && Fecha1.compareTo(otonho.minusYears(1))>0) || Fecha1.compareTo(otonho.minusYears(1))==0 ) {
			
			System.out.println(Fecha1.format(formateador) + " es una fecha invernal");
		}
		else if((Fecha1.compareTo(primavera)<0 && Fecha1.compareTo(invierno.minusYears(1))>0) || Fecha1.compareTo(invierno.minusYears(1))==0) {
			
			System.out.println( Fecha1.format(formateador) + " es una fecha primaveral");
			
		}
		else if((Fecha1.compareTo(verano)<0 && Fecha1.compareTo(primavera)>0) || Fecha1.compareTo(primavera)==0) {
			
			System.out.println( Fecha1.format(formateador) + " es una fecha veraniega");
			
		}
		else if((Fecha1.compareTo(otonho)<0 && Fecha1.compareTo(verano)>0) || Fecha1.compareTo(verano)==0) {
			
			System.out.println( Fecha1.format(formateador) + " es una fecha oto�al");
		}
		
		
		 invierno=LocalDate.of(Fecha2.getYear(), 3, 21);
		 otonho=LocalDate.of(Fecha2.getYear(), 12, 21);
		 primavera=LocalDate.of(Fecha2.getYear(), 6, 21);
		 verano=LocalDate.of(Fecha2.getYear(), 9, 23);
		 
		if((Fecha2.compareTo(invierno)<0 && Fecha2.compareTo(otonho.minusYears(1))>0) || Fecha2.compareTo(otonho.minusYears(1))==0 ) {
			
			System.out.println( Fecha2.format(formateador) + " es una fecha invernal");
			
		}else if((Fecha2.compareTo(primavera)<0 && Fecha2.compareTo(invierno.minusYears(1))>0) || Fecha2.compareTo(invierno.minusYears(1))==0) {
			
			System.out.println( Fecha2.format(formateador) + " es una fecha primaveral");
			
		}else if((Fecha2.compareTo(verano)<0 && Fecha2.compareTo(primavera)>0) || Fecha2.compareTo(primavera)==0) {
			
			System.out.println( Fecha2.format(formateador) + " es una fecha veraniega");
			
		}else if((Fecha2.compareTo(otonho)<0 && Fecha2.compareTo(verano)>0) || Fecha2.compareTo(verano)==0) {
			
			System.out.println( Fecha2.format(formateador) + " es una fecha oto�al");
		}
		
		LocalDate temp=Fecha1;
		LocalDate temp1=Fecha2;
		int contador=0;
		if(Fecha1.compareTo(Fecha2)<0) {
			
			while(temp.equals(Fecha2)==false) {
				DayOfWeek domingos=temp.getDayOfWeek();
				if(domingos.equals(DayOfWeek.SUNDAY)) contador++;
				temp=temp.plusDays(1);
			}		
			
		}else {
			
			while(temp1.equals(Fecha1)==false) {
				DayOfWeek domingos=temp1.getDayOfWeek();
				if(domingos.equals(DayOfWeek.SUNDAY)) contador++;
				temp1=temp1.plusDays(1);
			}		
			
		}
		System.out.println("El numero de domingos entre las 2 fechas es: " + contador);
		
		LocalDate equinocio1=LocalDate.of(Fecha1.getYear(), 6, 21);
		LocalDate equinocio2=LocalDate.of(Fecha2.getYear(), 6, 21);
		
		if(Fecha1.compareTo(equinocio1)>0) {
			
			System.out.println("Dias que faltan desde la fecha 1 hasta el equinocio de veranos: " + ChronoUnit.DAYS.between(Fecha1, equinocio1.plusYears(1)));
			
		}else if(Fecha1.compareTo(equinocio1)<0){
			
			System.out.println("Dias que faltan desde la fecha 1 hasta el equinocio de verano: " + ChronoUnit.DAYS.between(Fecha1, equinocio1));
		}
		if(Fecha2.compareTo(equinocio2)>0) {
			
			System.out.println("Dias que faltan desde la fecha 2 hasta el equinocio de verano: " + ChronoUnit.DAYS.between(Fecha2, equinocio2.plusYears(1)));
			
		}else if(Fecha2.compareTo(equinocio2)<0){
			
			System.out.println("Dias que faltan desde la fecha 2 hasta el equinocio de verano: " + ChronoUnit.DAYS.between(Fecha2, equinocio2));
		}
		
		
		entrada.close();
	
	}

}
