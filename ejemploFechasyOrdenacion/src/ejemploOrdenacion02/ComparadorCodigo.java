package ejemploOrdenacion02;

import java.util.Comparator;

public class ComparadorCodigo implements Comparator<Articulo>{

	@Override
	public int compare(Articulo articulo1, Articulo articulo2) {
		int codigo1=articulo1.getCodigo();
		int codigo2=articulo2.getCodigo();
		if (codigo1==codigo2) return 0;
		else if (codigo1>codigo2) return 1;
		else return -1;
	}

}
