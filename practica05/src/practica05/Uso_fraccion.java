package practica05;

public class Uso_fraccion {

	public static void main(String[] args) {
		
		System.out.println("Prueba Constructores\n");
		Fraccion fraccion =new Fraccion(4, 2);
		System.out.println("Prueba Constructor 1: " + fraccion.toString());
		Fraccion fraccion1 =new Fraccion(5);
		System.out.println("Prueba Constructores 2: " + fraccion1.toString());
		Fraccion fraccion2 =new Fraccion(1.7);
		System.out.println("Prueba constructor 3: " + fraccion2.toString());
		
		
		
		
		System.out.println("\nPrueba simplificar");
		System.out.println("Antes de simplificar: " + fraccion2.toString());
		fraccion2.Simplificar();
		System.out.println("Después de simplificar: " + fraccion2.toString());
		
		
		
		System.out.println("\n Prueba Valor");
		System.out.println("Valor fraccion " + fraccion.toString() + "=" + fraccion.ValorDouble());
		
		
		
		System.out.println("\nPrueba Operaciones");
		System.out.println(fraccion.toString() + "+" + fraccion2.toString() + "="  + fraccion.suma(fraccion2));
		System.out.println(fraccion.toString() + "-" + fraccion2.toString() + "="  + fraccion.resta(fraccion2));
		System.out.println(fraccion.toString() + "*" + fraccion2.toString() + "="  + fraccion.multiplicacion(fraccion2));
		System.out.println(fraccion.toString() + "/" + fraccion2.toString() + "="  + fraccion.division(fraccion2));
		
		
		System.out.println("\nPrueba Operadores Logicos");
		System.out.println(fraccion.toString() + " igual a " + fraccion2.toString() + ":"  + fraccion.igual(fraccion2));
		System.out.println(fraccion.toString() + " distinto de " + fraccion2.toString() + ":"  + fraccion.distinto(fraccion2));
		System.out.println(fraccion.toString() + " mayor que " + fraccion2.toString() + ":"  + fraccion.mayor(fraccion2));
		System.out.println(fraccion.toString() + " menor que " + fraccion2.toString() + ":"  + fraccion.menor(fraccion2));
		
		
	}

}
