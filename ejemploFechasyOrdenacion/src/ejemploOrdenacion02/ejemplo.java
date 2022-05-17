package ejemploOrdenacion02;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo {

	public static void main(String[] args) {
		
		ArrayList<Articulo> articulos=new ArrayList<Articulo>();
		
		articulos.add(new Articulo(3, "BBB", 10));
		articulos.add(new Articulo(2, "AAA", 30));
		articulos.add(new Articulo(1, "CCC", 15));
		
		System.out.println("ARTICULOS SIN ORDENAR:");
		for (int i = 0; i < articulos.size(); i++) System.out.println(articulos.get(i));
		
		ComparadorPrecio comparador1=new ComparadorPrecio();
		Collections.sort(articulos,comparador1);
		
		System.out.println("ARTICULOS ORDENADOS POR PRECIO:");
		for (int i = 0; i < articulos.size(); i++) System.out.println(articulos.get(i));

		ComparadorCodigo comparador2=new ComparadorCodigo();
		Collections.sort(articulos,comparador2);
		
		System.out.println("ARTICULOS ORDENADOS POR CODIGO:");
		for (int i = 0; i < articulos.size(); i++) System.out.println(articulos.get(i));
		
		ComparadorDescripcion comparador3=new ComparadorDescripcion();
		Collections.sort(articulos,comparador3);
		
		System.out.println("ARTICULOS ORDENADOS POR DESCRIPCION:");
		for (int i = 0; i < articulos.size(); i++) System.out.println(articulos.get(i));
	}

}
