package ejemploOrdenacion01;

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
		
		Collections.sort(articulos);
		
		System.out.println("ARTICULOS ORDENADOS:");
		for (int i = 0; i < articulos.size(); i++) System.out.println(articulos.get(i));

	}

}
