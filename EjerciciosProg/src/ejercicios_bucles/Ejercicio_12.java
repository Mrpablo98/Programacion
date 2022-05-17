package ejercicios_bucles;
import javax.swing.*;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String salir="salir";
    String producto="producto";
    String resta="resta";
    String division="division";
    String i="";
    double x;
    double y;
   while(!i.equalsIgnoreCase("salir")) {
	   i=JOptionPane.showInputDialog("Introduce una acción SALIR/PRODUCTO/RESTA/DIVISION");
	  
	   if(i.equalsIgnoreCase("producto")) {
		   
		    	
	   x=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
	   y=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
	   System.out.println("El resultado es: " + x*y);
		   
		   
	   }else if(i.equalsIgnoreCase("resta")) {
		   
		   x=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
		   y=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
		   
		   System.out.println("El resultado es:" + (x-y));
	   }else if(i.equalsIgnoreCase("division")) {
		   x=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
		   y=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
		   System.out.println("El resultado es: " + x/y);
	   }
		  
	   
   }
    
	}

}
