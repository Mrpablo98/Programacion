package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilidadesFechas {

	private static DateTimeFormatter formateadorfecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static LocalDate String_a_LocalDate(String fecha) {
		return LocalDate.parse(fecha, formateadorfecha);
	}
	
	public static String LocalDate_a_String(LocalDate fecha) {
		return fecha.format(formateadorfecha);
	}
	
	public static double anhos_hasta_hoy(LocalDate fecha) {
		return ChronoUnit.YEARS.between(fecha, LocalDate.now());
	}
	
	public static double dias_hasta_hoy(LocalDate fecha) {
		return ChronoUnit.DAYS.between(fecha, LocalDate.now());
	}
	
}
