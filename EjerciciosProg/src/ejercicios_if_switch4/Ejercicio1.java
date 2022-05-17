package ejercicios_if_switch4;
import javax.swing.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		String presion=JOptionPane.showInputDialog("Introduce la presión ALTA/MEDIA/BAJA");
		String humedad=JOptionPane.showInputDialog("Introduce la humedad ALTA/MEDIA/BAJA");
		
		if(presion.equalsIgnoreCase("baja")&humedad.equalsIgnoreCase("alta")) {
			System.out.println("La probabilidad de lluvia es muy alta");
			System.out.println("La probabilidad de que ha sol es baja");
			System.out.println("La probabilidad de que haga frío es alta");
			
		}else if(presion.equalsIgnoreCase("baja")&humedad.equalsIgnoreCase("media")) {
			System.out.println("La probabilidad de lluvia es alta");
			System.out.println("La probabilidad de que haga sol es media");
			System.out.println("La probabilidad de que haga frío es alta;");
		}else if(presion.equalsIgnoreCase("baja")&humedad.equalsIgnoreCase("baja")){
		   
			System.out.println("La probabilidad de lluvia es media");
			System.out.println("La probabilidad de que haga sol es media");
			
		}else if(presion.equalsIgnoreCase("media")&humedad.equalsIgnoreCase("alta")) {
			
			System.out.println("La probabilidad de que haga frío es alta");
		}else if(presion.equalsIgnoreCase("media")&presion.equalsIgnoreCase("media")) {
			System.out.println("La probabilidad de lluvia es media");
			System.out.println("La probabilidad deque haga sol es media");
			System.out.println("La probabilidad de que haga frío es media");
		}else {
			System.out.println("La probabilidad de lluvia es baja");
			System.out.println("La probabilidad de que haga sol es alta");
			System.out.println("La probabilidad de que haga frío es baja");
		}
		}
	}


