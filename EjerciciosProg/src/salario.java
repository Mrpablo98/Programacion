import java.util.*;
public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario_bruto;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el salario bruto");
		salario_bruto=entrada.nextDouble();
		
		double salario_neto=salario_bruto-(salario_bruto*0.12);
		System.out.println("El salario neto del empleado es " + salario_neto);

	}

}
