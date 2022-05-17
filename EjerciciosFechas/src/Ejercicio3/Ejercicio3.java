package Ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Factura> facturas=new ArrayList<Factura>();
		Factura factura1=new Factura("12345678A", 123.42, 0.25, LocalDate.of(2022, 5, 12), 30);
		Factura factura2=new Factura("12345678B", 1110.99, 0.35, LocalDate.of(2022, 3, 25), 30);
		Factura factura3=new Factura("12345678C", 14.99, 0.65, LocalDate.of(2022, 5, 2), 30);
		Factura factura4=new Factura("12345678D", 55, 0.15, LocalDate.of(2022, 4, 20), 30);
		Factura factura5=new Factura("12345678E", 2300, 0.05, LocalDate.of(2022, 1, 14), 30);
		Factura factura6=new Factura("12345678F", 32.99, 0.25, LocalDate.of(2022, 5, 1), 18);
		facturas.add(factura1);
		facturas.add(factura2);
		facturas.add(factura3);
		facturas.add(factura4);
		facturas.add(factura5);
		facturas.add(factura6);
		
		System.out.println( "\n" + "Facturas con menos de 5 dias para vencimiento:");
		
		for(int i=0;i<facturas.size();i++) {
			
			if(facturas.get(i).DiasPago()<5 && facturas.get(i).DiasPago()>0) {
				
				System.out.println(facturas.get(i));
			}
		}
		
		System.out.println("\n" + "Facturas vencidas:");
		
		for(int i=0;i<facturas.size();i++) {
			
			if(facturas.get(i).DiasPago()==-1) {
			
				System.out.println(facturas.get(i));
				
			}
			
		}
		
		System.out.println( "\n" + "Facturas vencidas por mas de 30 dias:");
		
		for(int i=0;i<facturas.size();i++) {
			
			if(ChronoUnit.DAYS.between(facturas.get(i).FechaVencimiento(), LocalDate.now())>30) {
				
				System.out.println(facturas.get(i));
				
			}

		}
		
		
			double Total=0;
		for(int i=0;i<facturas.size();i++) {
			if(facturas.get(i).DiasPago()==-1) {
			Total=Total+facturas.get(i).Total();
			}
		}
		System.out.println("La suma del total de las facturas vencidas es: " + Total);
	}

}
