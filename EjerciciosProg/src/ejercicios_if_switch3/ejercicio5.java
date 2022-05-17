package ejercicios_if_switch3;
import java.util.*;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int añonacimiento;
    int mesnacimiento;
    int dianacimiento;
    int año;
    int mes;
    int dia;
    double precio;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce el año actual");
    año=entrada.nextInt();
    System.out.println("Introduce el mes actual");
    mes=entrada.nextInt();
    System.out.println("Introduce el dia actual");
    dia=entrada.nextInt();
    System.out.println("Introduce el año de nacimiento");
    añonacimiento=entrada.nextInt();
    System.out.println("Introduce el mes de nacimiento");
    mesnacimiento=entrada.nextInt();
    System.out.println("Introduce el dia de nacimiento");
    dianacimiento=entrada.nextInt();
    System.out.println("Introduce el precio del producto");
    precio=entrada.nextInt();
    int edad=año-añonacimiento;
    
    if(mesnacimiento>mes||mesnacimiento==mes&dianacimiento>dia) {
    	edad=edad-1;
    	
    }
    if(edad>65) {
    	precio=precio-precio*0.15;
    }else if(edad<25) {
    	precio=precio-precio*0.10;
    }
    
    System.out.println("El precio del producto es " + precio);
    
	}

}
