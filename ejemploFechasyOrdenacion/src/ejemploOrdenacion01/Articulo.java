package ejemploOrdenacion01;

public class Articulo implements Comparable<Articulo>{

	private int codigo;
	private String descripcion;
	private double precio;
	
	public Articulo(int codigo, String descripcion, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Articulo articuloaComparar) {
		// Devolver 0 si los precios son iguales
		// devolver +1 si el precio del articulo es mayor que el precio del articulo a comparar
		// devolver -1 si el precio del articulo es menor que el precio del articulo a comparar
		double precio1=this.precio;
		double precio2=articuloaComparar.getPrecio();
		if (precio1==precio2) return 0;
		else if (precio1>precio2) return 1;
		else return -1;
	}
	
	
	
}
