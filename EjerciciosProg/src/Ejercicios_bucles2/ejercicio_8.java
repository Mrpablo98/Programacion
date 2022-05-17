package Ejercicios_bucles2;
import javax.swing.*;
public class ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="";
		x=JOptionPane.showInputDialog("Introduce el tipo de números que quieres Pares/Impares");
		
		if(x.equalsIgnoreCase("pares")) {
			for(int i=0; i<10;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			
		}if(x.equalsIgnoreCase("impares")) {
			for(int i=0;i<10;i++) {
				if(i%2!=0) {
					System.out.println(i);
					
				}
			}
			
		}
			
		
		
       
	}

}
