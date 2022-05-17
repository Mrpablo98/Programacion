package ejemploOrdenacion02;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Articulo>{

	@Override
	public int compare(Articulo articulo1, Articulo articulo2) {
		double precio1=articulo1.getPrecio();
		double precio2=articulo2.getPrecio();
		if (precio1==precio2) return 0;
		else if (precio1>precio2) return 1;
		else return -1;
	}

}
