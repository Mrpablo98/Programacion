package practica02;
import java.util.*;


public class Practica02 {

	public static void main(String[] args) {
		
		boolean salir=false;
		int menu;
		String tipoanimal="";
		String microchip="";
		String nombre="";
		String fechaNacimiento;
		double peso;
		RazaPerro razaperro = null;
		RazaGato razagato=null;
		EspeciePajaro especiepajaro=null;
		EspecieReptil especiereptil=null;
		boolean cantor=false;
		boolean veneno=false;
		String bool;
		String tiporaza;
		String comentario;
		ClinicaVeterinaria clinica=new ClinicaVeterinaria();
		
		Scanner entrada=new Scanner(System.in);
		
		while(salir==false) {
			
			System.out.println("Escocge la accion a realizar: ");
			System.out.println("1. Insertar animal");
			System.out.println("2. Modificar comentarios");
			System.out.println("3. Mostrar lista de animales");
			System.out.println("4. Salir.");
			menu=entrada.nextInt();
			
			switch(menu) {
				
			case 1:System.out.println("Que tipo de animal quieres insertar? Perro, Gato, Reptilo o Pajaro");
					tipoanimal=entrada.next();
					if(tipoanimal.equalsIgnoreCase("perro")) {
						System.out.println("Introduce el microchip del perro: ");
						microchip=entrada.next();
						System.out.println("Introduce el nombre del perro");
						nombre=entrada.next();
						System.out.println("Introduce la fecha de nacimiento: ");
						fechaNacimiento=entrada.next();
						System.out.println("Introduce la raza del perro: PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo"); 
						tiporaza=entrada.next();
						if(tiporaza.equalsIgnoreCase("pastoraleman")) {
							razaperro=razaperro.PastorAleman;
						}else if(tiporaza.equalsIgnoreCase("Husky")) {
							razaperro=razaperro.Husky;
						}else if(tiporaza.equalsIgnoreCase("FoxTerrier")) {
							razaperro=razaperro.FoxTerrier;
						}else if(tiporaza.equalsIgnoreCase("Dalmata")) {
							razaperro=razaperro.Dalmata;
						}else if(tiporaza.equalsIgnoreCase("SanBernardo")) {
							razaperro=razaperro.SanBernardo;
						}
						System.out.println("Introduce el peso: ");
						peso=entrada.nextDouble();
						Perro perro=new Perro(nombre, razaperro, fechaNacimiento, peso, microchip);
						clinica.InsertaAnimal(perro);
						
						}
					if(tipoanimal.equalsIgnoreCase("gato")) {
						System.out.println("Introduce el microchip del gato: ");
						microchip=entrada.next();
						System.out.println("Introduce el nombre del gato:");
						nombre=entrada.next();
						System.out.println("Introduce la fecha de nacimiento: ");
						fechaNacimiento=entrada.next();
						System.out.println("Introduce la raza del gato: Comun, Siames, Persa, Angora, ScottishFold"); 
						tiporaza=entrada.next();
						if(tiporaza.equalsIgnoreCase("comun")) {
							razagato=razagato.Comun;
						}else if(tiporaza.equalsIgnoreCase("Siames")) {
							razagato=razagato.Siames;
						}else if(tiporaza.equalsIgnoreCase("Persa")) {
							razagato=razagato.Persa;
						}else if(tiporaza.equalsIgnoreCase("Angora")) {
							razagato=razagato.Angora;
						}else if(tiporaza.equalsIgnoreCase("ScottishFold")) {
							razagato=razagato.ScottishFold;
						}
						System.out.println("Introduce el peso: ");
						peso=entrada.nextDouble();
						Gato gato=new Gato(nombre, razagato, fechaNacimiento, peso, microchip);
						clinica.InsertaAnimal(gato);
						}
					if(tipoanimal.equalsIgnoreCase("Pajaro")) {
						System.out.println("Indica si el p�jaro es cantor: s/n ");
						bool=entrada.next();
						if(bool.equalsIgnoreCase("s")) {
							cantor=true;
						}else {
							cantor=false;
						}
						System.out.println("Introduce el nombre del pajaro:");
						nombre=entrada.next();
						System.out.println("Introduce la fecha de nacimiento: ");
						fechaNacimiento=entrada.next();
						System.out.println("Introduce la especie del p�jaro: Canario, Periquito, Agapornis"); 
						tiporaza=entrada.next();
						if(tiporaza.equalsIgnoreCase("canario")) {
							especiepajaro=especiepajaro.Canario;
						}else if(tiporaza.equalsIgnoreCase("periquito")) {
							especiepajaro=especiepajaro.Periquito;
						}else if(tiporaza.equalsIgnoreCase("Agapornis")) {
							especiepajaro=especiepajaro.Agapornis;
						}
						System.out.println("Introduce el peso: ");
						peso=entrada.nextDouble();
						Pajaro pajaro=new Pajaro(nombre, fechaNacimiento, peso, especiepajaro, cantor);
						clinica.InsertaAnimal(pajaro);
						}
					if(tipoanimal.equalsIgnoreCase("Reptil")) {
						System.out.println("Indica si el r�ptil es venenoso: s/n ");
						bool=entrada.next();
						if(bool.equalsIgnoreCase("s")) {
							veneno=true;
						}else {
							veneno=false;
						}
						System.out.println("Introduce el nombre del r�ptil:");
						nombre=entrada.next();
						System.out.println("Introduce la fecha de nacimiento: ");
						fechaNacimiento=entrada.next();
						System.out.println("Introduce la especie del r�ptil: Tortuga, Iguana, DragonDeComodo"); 
						tiporaza=entrada.next();
						if(tiporaza.equalsIgnoreCase("tortuga")) {
							especiereptil=especiereptil.Tortuga;
						}else if(tiporaza.equalsIgnoreCase("iguana")) {
							especiereptil=especiereptil.Iguana;
						}else if(tiporaza.equalsIgnoreCase("dragondecomodo")) {
							especiereptil=especiereptil.DragonDeComodo;
						}
						System.out.println("Introduce el peso: ");
						peso=entrada.nextDouble();
						Reptil reptil=new Reptil(nombre, fechaNacimiento, peso, especiereptil, veneno);
						clinica.InsertaAnimal(reptil);
						}break;
					
			case 2:System.out.println("Introduce el nombre del animal al que cambiar el comentario");
					nombre=entrada.next();
					System.out.println("Escribe el comentario: ");
					comentario=entrada.next();
					clinica.ModificaComentarioAnimal(nombre, comentario);
					break;
					
					
			case 3: System.out.println(clinica);break;
			
			case 4: System.out.println("Programa finalizado");
					salir=true;
			}
			
			
		}
		
		

	}

}
