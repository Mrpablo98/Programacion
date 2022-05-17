package ejercicio2;

import java.time.LocalDate;

public enum PartidoPolitico {
PSOE("PSOE", new Persona("123456789A", "Cristina", "Narbona"), UtilidadesFechas.String_a_LocalDate("02/05/1879"), 181000),
PP("PP", new Persona("123456789B", "Alberto", "Nunhez Feijoo"), UtilidadesFechas.String_a_LocalDate("20/01/1989"), 869535),
PODEMOS("PODEMOS", new Persona("123456789C", "Ione", "Belarra"), UtilidadesFechas.String_a_LocalDate("17/01/2014"), 516023),
BNG("BNG", new Persona("12345678D", "Ana", "Ponton"), UtilidadesFechas.String_a_LocalDate("25/06/1982"), 9000),
BILDU("BILDU", new Persona("12345678E", "Pello", "Urizar"), UtilidadesFechas.String_a_LocalDate("03/04/2011"), 13000),
ERC("ERC", new Persona("12345678F", "Oriol", "Junqueras"), UtilidadesFechas.String_a_LocalDate("19/03/1931"), 10000),
TeruelExiste("Teruel Existe", new Persona("12345678G", "Tomas", "Guitarte"), UtilidadesFechas.String_a_LocalDate("02/11/1999"), 1100),
VOX("VOX", new Persona("12345678H", "Santiago", "Abascal"), UtilidadesFechas.String_a_LocalDate("17/12/2013"), 65000);
	private String nombre;
	private Persona presidente;
	private LocalDate FechaFundacion;
	private int NumeroMilitantes;
	
	private PartidoPolitico(String nombre, Persona presidente, LocalDate FechaFundacion, int NumeroMilitantes) {
		this.FechaFundacion=FechaFundacion;
		this.nombre=nombre;
		this.presidente=presidente;
		this.NumeroMilitantes=NumeroMilitantes;
	}
	
	
	public int Antigüedad() {
		
		return (int) UtilidadesFechas.anhos_hasta_hoy(FechaFundacion);
	}
}
