package ejercicios3;
import javax.swing.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double a=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
    double b=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
    
    if(a+b>10) {
    	System.out.println("La suma de los números es mayor que 10");
    }else {
    	System.out.println("La suma de los números es menor que 10");
    }
	}

}
