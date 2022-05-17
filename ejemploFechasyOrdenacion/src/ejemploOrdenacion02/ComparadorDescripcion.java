package ejemploOrdenacion02;

import java.util.Comparator;

public class ComparadorDescripcion implements Comparator<Articulo>{

	@Override
	public int compare(Articulo articulo1, Articulo articulo2) {
		String descripcion1=articulo1.getDescripcion();
		String descripcion2=articulo2.getDescripcion();
		return descripcion1.compareTo(descripcion2);
	}

}
