package ejercicios3;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double a=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));
    if(a>0) {
    	System.out.println("El número es positivo");
    }if(a==0) {
    	System.out.println("El número es 0");
    }if(a<0) {
    	System.out.println("El número es negativo");
    }
	}

}
