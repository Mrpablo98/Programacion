package ejercicios2;
import javax.swing.*;


public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double K=Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Kelvins"));
		double C=K-273;
		
        System.out.println(K + " ºK es igual a " + C + " ºC");
	}

}
