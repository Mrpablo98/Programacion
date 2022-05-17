package practica05;

public class Fraccion {

	
	private int numerador;
	private int denominador;
	
	
	public Fraccion(int numerador, int denominador) {
		
		if(denominador==0) {
			System.out.println("El denominador no puede ser 0");
		}else {
			this.numerador=numerador;
			this.denominador=denominador;
			
		}
		
	}
	
	public Fraccion(int numerador) {
		
		this.numerador=numerador;
		this.denominador=1;
		
	}
	
	public Fraccion(double numerador) {
		
		
		this.denominador=1;
		double parteDecimal=numerador%1;
		
		
		while(parteDecimal>0) {
			parteDecimal=numerador%1;
			numerador=numerador*10;
			this.denominador=denominador*10;
			this.numerador=(int)(numerador);
		}
		
	}

	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		
		if(denominador==0) {
			System.out.println("El denominador no puede ser 0");
		}else {
			this.denominador = denominador;
		}
	}
	
	
	
	private int mcd(Fraccion fraccion) {
		
		int a=Math.max(fraccion.denominador, denominador);
		int b=Math.min(fraccion.denominador, denominador);
		int resultado=0;
		while(b!=0) {
			resultado=b;
			b=a%b;
			a=resultado;
		}
		
		return resultado;
	}
	
	private int mcm(Fraccion fraccion) {
		
		int a=Math.max(fraccion.denominador, denominador);
		int b=Math.min(fraccion.denominador, denominador);
		
		int resultado=(a/mcd(fraccion ))*b;
		
		
		return resultado;
	}
	public static int mcd2num(int num1, int num2) {
		int a=Math.max(num1, num2);
		int b=Math.min(num1, num2);
		int resultado=0;
		while(b!=0) {
			resultado=b;
			b=a%b;
			a=resultado;
		}
		return resultado;
	}

	
	public Fraccion Simplificar() {
		
		int mcd=Fraccion.mcd2num(numerador, denominador);
		numerador=numerador/mcd;
		denominador=denominador/mcd;
		
		Fraccion fraccion1=new Fraccion(numerador, denominador);
		
		return fraccion1;
		
		
	}

	@Override
	public String toString() {
		return "Fraccion [" + numerador + "/" + denominador + "]";
	}
	
	public double ValorDouble() {
		double resultado=numerador/denominador;
		
		return resultado;
	}
	
	public Fraccion suma(Fraccion fraccion) {
		
		int mcm=mcm(fraccion);
		fraccion.numerador=(mcm/fraccion.denominador)*fraccion.numerador;
		numerador=(mcm/denominador)*numerador;
		fraccion.denominador=mcm;
		denominador=mcm;
		Fraccion resultFraccion=new Fraccion((fraccion.numerador+numerador), denominador);
		
		return resultFraccion;
	}
	
	public Fraccion resta(Fraccion fraccion) {
		
		int mcd=mcd(fraccion);
		fraccion.numerador=(mcd/fraccion.denominador)*fraccion.numerador;
		numerador=(mcd/denominador)*numerador;
		fraccion.denominador=mcd;
		denominador=mcd;
		Fraccion resultFraccion=new Fraccion((numerador-fraccion.numerador), denominador);
		
		return resultFraccion;
	}
	public Fraccion multiplicacion(Fraccion fraccion ) {
		
		int numerador=fraccion.numerador*this.numerador;
		int denominador=fraccion.denominador*this.denominador;
		
		Fraccion resultFraccion=new Fraccion(numerador, denominador);
		return resultFraccion;
	}
	
	public Fraccion division(Fraccion fraccion) {
		
		int numerador=this.numerador*fraccion.denominador;
		int denominador=this.denominador*fraccion.numerador;
		Fraccion resultFraccion= new Fraccion(numerador, denominador);
		
		return resultFraccion;
	}
	
	public String igual(Fraccion fraccion) {
		
		double rfraccion=fraccion.numerador/fraccion.denominador;
		double rfraccion1=numerador/denominador;
		if(rfraccion==rfraccion1) {
			return "Las fracciones son iguales";
		}else {
			return "Las fracciones no son iguales";
		}
		
		
	}
	
	public String menor(Fraccion fraccion) {
		
		double rfraccion1=fraccion.numerador/fraccion.denominador;
		double rfraccion=numerador/denominador;
		if(rfraccion<rfraccion1) {
			return "Las fracción 1 es menor que la fracción 2";
		}else {
			return "La fracción 1 no es menor que la fracción 2";
		}
		
	}
	
	public String mayor(Fraccion fraccion) {
		
		double rfraccion1=fraccion.numerador/fraccion.denominador;
		double rfraccion=numerador/denominador;
		if(rfraccion>rfraccion1) {
			return "Las fracción 1 es mayor que la fracción 2";
		}else {
			return "La fracción 1 es menor que la fracción 2";
		}
		
	}
	
	
public String distinto(Fraccion fraccion) {
		
		double rfraccion=fraccion.numerador/fraccion.denominador;
		double rfraccion1=numerador/denominador;
		if(rfraccion==rfraccion1) {
			return "Las fracciones no son distintas";
		}else {
			return "Las fracciones son distintas";
		}
		
		
	}
	
	
	
}
