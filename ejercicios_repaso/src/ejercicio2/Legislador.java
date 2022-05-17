package ejercicio2;

import java.time.LocalDate;
public abstract class Legislador extends Persona{

	private Provincia provincia;
	private PartidoPolitico partido;
	private LocalDate FechaElegido;
	
	public Legislador(String dni, String nombre, String apellidos, Provincia provincia, PartidoPolitico partido, LocalDate FechaElegido) {
		
		super(dni, nombre, apellidos);
		this.provincia=provincia;
		this.partido=partido;
		this.FechaElegido=FechaElegido;
	}
	
	public int DiasRestanMandato() {
		
		int dias=(int) (1460-UtilidadesFechas.dias_hasta_hoy(FechaElegido));
		return dias;
	}
	public abstract String getCamaraEnQueTrabaja();

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public PartidoPolitico getPartido() {
		return partido;
	}

	public void setPartido(PartidoPolitico partido) {
		this.partido = partido;
	}

	public LocalDate getFechaElegido() {
		return FechaElegido;
	}

	public void setFechaElegido(LocalDate fechaElegido) {
		FechaElegido = fechaElegido;
	}

	
	
	
	
}
