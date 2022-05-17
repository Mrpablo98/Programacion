package ejercicios3;
import javax.swing.*;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double a=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
   
   if(a>=10&a<=100) {
	   System.out.println("El número se encuentra entre el 10 y el 100");
   }else {
	   System.out.println("El número no se encuentra entre el 10 y el 100");
   }
	}

}
