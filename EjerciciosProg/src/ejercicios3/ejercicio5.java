package ejercicios3;
import javax.swing.*;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
    if(a%2==0) {
    	System.out.println("El número es par");
    }else {
    	System.out.println("El número es impar");
    }
	}

}
