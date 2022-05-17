package Ejercicio2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

	private String DNI;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String DNI, String nombre, LocalDate fechaNacimiento) {
		
		this.DNI=DNI;
		this.fechaNacimiento=fechaNacimiento;
		this.nombre=nombre;
		
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int Edad() {
		
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
	}
	
	public int DiasVividos() {
		return (int) ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now());
		
	}
	
	public String Signo(){
		
	 LocalDate Aries= LocalDate.of(fechaNacimiento.getYear(), 3, 21);
	 LocalDate Tauro= LocalDate.of(fechaNacimiento.getYear(), 4, 20);
	 LocalDate Geminis= LocalDate.of(fechaNacimiento.getYear(), 5, 21);
	 LocalDate Cancer= LocalDate.of(fechaNacimiento.getYear(), 6, 21);
	 LocalDate Leo= LocalDate.of(fechaNacimiento.getYear(), 7, 23);
	 LocalDate Virgo= LocalDate.of(fechaNacimiento.getYear(), 8, 23);
	 LocalDate Libra= LocalDate.of(fechaNacimiento.getYear(), 9, 23);
	 LocalDate Escorpio= LocalDate.of(fechaNacimiento.getYear(), 10, 23);
	 LocalDate sagitario= LocalDate.of(fechaNacimiento.getYear(), 11, 22);
	 LocalDate Capricornio= LocalDate.of(fechaNacimiento.getYear(), 12, 22);
	 LocalDate Acuario= LocalDate.of(fechaNacimiento.getYear(), 1, 20);
	 LocalDate Piscis= LocalDate.of(fechaNacimiento.getYear(), 2, 19);
	 
	 if((fechaNacimiento.compareTo(Acuario)>0 && fechaNacimiento.compareTo(Piscis)<0) || fechaNacimiento.compareTo(Acuario)==0) {
		 
		 return "Acuario";
	 }else if((fechaNacimiento.compareTo(Piscis)>0 && fechaNacimiento.compareTo(Aries)<0) || fechaNacimiento.compareTo(Piscis)==0) {
		 
		 return "Piscis";
	 }if((fechaNacimiento.compareTo(Aries)>0 && fechaNacimiento.compareTo(Tauro)<0) || fechaNacimiento.compareTo(Aries)==0) {
		 
		 return "Aries";
	 }if((fechaNacimiento.compareTo(Tauro)>0 && fechaNacimiento.compareTo(Geminis)<0) || fechaNacimiento.compareTo(Tauro)==0) {
		 
		 return "Tauro";
	 }if((fechaNacimiento.compareTo(Geminis)>0 && fechaNacimiento.compareTo(Cancer)<0) || fechaNacimiento.compareTo(Geminis)==0) {
		 
		 return "Geminis";
	 }if((fechaNacimiento.compareTo(Cancer)>0 && fechaNacimiento.compareTo(Leo)<0) || fechaNacimiento.compareTo(Cancer)==0) {
		 
		 return "Cancer";
	 }if((fechaNacimiento.compareTo(Leo)>0 && fechaNacimiento.compareTo(Virgo)<0) || fechaNacimiento.compareTo(Leo)==0) {
		 
		 return "Leo";
	 }if((fechaNacimiento.compareTo(Virgo)>0 && fechaNacimiento.compareTo(Libra)<0) || fechaNacimiento.compareTo(Virgo)==0) {
		 
		 return "Virgo";
	 }if((fechaNacimiento.compareTo(Libra)>0 && fechaNacimiento.compareTo(Escorpio)<0) || fechaNacimiento.compareTo(Libra)==0) {
		 
		 return "Libra";
	 }if((fechaNacimiento.compareTo(Escorpio)>0 && fechaNacimiento.compareTo(sagitario)<0) || fechaNacimiento.compareTo(Escorpio)==0) {
		 
		 return "Escorpio";
	 }if((fechaNacimiento.compareTo(sagitario)>0 && fechaNacimiento.compareTo(Capricornio)<0) || fechaNacimiento.compareTo(sagitario)==0) {
		 
		 return "Sagitario";
	 }if((fechaNacimiento.compareTo(Capricornio)>0 && fechaNacimiento.compareTo(Acuario)<0) || fechaNacimiento.compareTo(Capricornio)==0) {
		 
		 return "Capricornio";
	 }else {
		 
		 return "No se ha posido determinar el signo";
	 }
	}
	
	public int DiasCumple() {
		LocalDate cumple=LocalDate.of(LocalDate.now().getYear(), fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth());
		
		if(LocalDate.now().compareTo(cumple)>0) {
			
			return (int) ChronoUnit.DAYS.between(LocalDate.now(), cumple.plusYears(1));
			
		}else {
		
		return (int) ChronoUnit.DAYS.between(LocalDate.now(), cumple);
		
		}

		

		
	}

	//crear funcion que devuelva los dias que faltan para tener 25 años
	public int Dias25(){

		return (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(fechaNacimiento.getYear()+25, fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth())); 

	}

	//crear funcion que devuelva los dias que faltan para tener 50 años

	public int Dias50(){

		return (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(fechaNacimiento.getYear()+50, fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth())); 

	}

}
