package ejercicios2;
import javax.swing.*;


public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        String genero=JOptionPane.showInputDialog("Introduce tu sexo H/M");
        double LorentzH=altura-100-((altura-150)/4);
        double LorentzM=altura-100-((altura-150)/2.5);
        double Perroult=altura-100+((edad/10)*0.9);
        double Brocca=altura-100;
        double MLIC=50+0.75*(altura-150);
        if(genero.equalsIgnoreCase("H")==true) {
        	
        	System.out.println("Tu peso ideal es segun la fórmula Lorentz es " + LorentzH);
        }
        if(genero.equalsIgnoreCase("M")==true);{
        	System.out.println("Tu peso ideal es segun la fórmula Lorentz es " + LorentzM);
        }
        
        System.out.println("Tu peso ideal es segun la fórmula Perroult es " + Perroult);
        System.out.println("Tu peso ideal es segun la fórmula Brocca es " + Brocca);
        System.out.println("Tu peso ideal es segun la fórmula Metropolitan Life Insurance Company es " + MLIC);
        
	}

}
