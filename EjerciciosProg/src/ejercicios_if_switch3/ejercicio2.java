package ejercicios_if_switch3;
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce una puntuación del 1 al 5 ");
   
	int puntuacion=entrada.nextInt();
	
	switch(puntuacion) {
	
	case 1:
		System.out.println("La película es mala");
		break;
	case 2:
		System.out.println("La película es regular");
		break;
	case 3:
		System.out.println("La pelicula es buena");
		break;
	case 4:
		System.out.println("La película es excelente");
		break;
	case 5:
		System.out.println("La película es una obra maestra");
		break;
		default:
			System.out.println("La puntuación no es válida");
			
	}
	}

}
