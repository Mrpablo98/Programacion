package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Cortesgenerales Legisladores=new Cortesgenerales();
		Diputado diputado=new Diputado("12345678A", "Pedro", "Sanchez", Provincia.Acoruña, PartidoPolitico.PSOE, UtilidadesFechas.String_a_LocalDate("23/05/2020"));
		Diputado diputado1=new Diputado("12345678B", "Nestor", "Rego", Provincia.Pontevedra, PartidoPolitico.BNG, UtilidadesFechas.String_a_LocalDate("12/02/2020"));
		Diputado diputado2=new Diputado("12345678C", "Irene", "Monterp", Provincia.Lugo, PartidoPolitico.PODEMOS, UtilidadesFechas.String_a_LocalDate("21/07/2020"));
		Diputado diputado3=new Diputado("12345678D", "Jon", "Iñatirragu", Provincia.Ourense, PartidoPolitico.BILDU, UtilidadesFechas.String_a_LocalDate("03/01/2019"));
		Diputado diputado4=new Diputado("12345678E", "Gabriel", "Rufian", Provincia.Lugo, PartidoPolitico.ERC, UtilidadesFechas.String_a_LocalDate("02/04/2019"));
		Diputado diputado5=new Diputado("12345678F", "Jose", "Cervantes", Provincia.Pontevedra, PartidoPolitico.TeruelExiste, UtilidadesFechas.String_a_LocalDate("30/11/2020"));
		Diputado diputado6=new Diputado("12345678G", "Jose Maria", "Aznar", Provincia.Acoruña, PartidoPolitico.PP, UtilidadesFechas.String_a_LocalDate("14/04/2020"));
		Diputado diputado7=new Diputado("12345678H", "Macarena", "Olona", Provincia.Ourense, PartidoPolitico.VOX, UtilidadesFechas.String_a_LocalDate("22/06/2020"));
		Diputado diputado8=new Diputado("12345678I", "Miguel Anxo", "Bastos", Provincia.Acoruña, PartidoPolitico.BNG, UtilidadesFechas.String_a_LocalDate("13/02/2020"));
		Diputado diputado9=new Diputado("12345678J", "Ana", "Ponton", Provincia.Pontevedra, PartidoPolitico.BNG, UtilidadesFechas.String_a_LocalDate("11/08/2020"));
		
		
		Senador senador=new Senador("12345678K", "Mariano", "Rajoy", Provincia.Ourense, PartidoPolitico.PP, UtilidadesFechas.String_a_LocalDate("15/07/2020"));
		Senador senador1=new Senador("12345678L", "Manuel", "Fraga", Provincia.Pontevedra, PartidoPolitico.PP, UtilidadesFechas.String_a_LocalDate("12/11/2020"));
		Senador senador2=new Senador("12345678L", "Juan Carlos", "Monedero", Provincia.Acoruña, PartidoPolitico.PODEMOS, UtilidadesFechas.String_a_LocalDate("16/10/2020"));
		Senador senador3=new Senador("12345678L", "Felipe", "Gonzalez", Provincia.Ourense, PartidoPolitico.PSOE, UtilidadesFechas.String_a_LocalDate("14/12/2020"));
		Senador senador4=new Senador("12345678L", "Iñaki", "Gomez", Provincia.Lugo, PartidoPolitico.BILDU, UtilidadesFechas.String_a_LocalDate("02/04/2020"));
		Senador senador5=new Senador("12345678L", "Ceza", "Nerea", Provincia.Acoruña, PartidoPolitico.VOX, UtilidadesFechas.String_a_LocalDate("26/01/2020"));
		Senador senador6=new Senador("12345678L", "Xose Manuel", "Beiras", Provincia.Pontevedra, PartidoPolitico.BNG, UtilidadesFechas.String_a_LocalDate("27/02/2020"));
		Senador senador7=new Senador("12345678L", "Jordi", "Puyol", Provincia.Lugo, PartidoPolitico.ERC, UtilidadesFechas.String_a_LocalDate("01/08/2020"));
		Senador senador8=new Senador("12345678L", "Alfredo", "Rubalcaba", Provincia.Ourense, PartidoPolitico.PSOE, UtilidadesFechas.String_a_LocalDate("21/11/2020"));
		Senador senador9=new Senador("12345678L", "Esperanza", "Aguirre", Provincia.Acoruña, PartidoPolitico.PP, UtilidadesFechas.String_a_LocalDate("09/03/2020"));
		
		
		Legisladores.AnhadirRepresentantre(senador);
		Legisladores.AnhadirRepresentantre(senador1);
		Legisladores.AnhadirRepresentantre(senador2);
		Legisladores.AnhadirRepresentantre(senador3);
		Legisladores.AnhadirRepresentantre(senador4);
		Legisladores.AnhadirRepresentantre(senador5);
		Legisladores.AnhadirRepresentantre(senador6);
		Legisladores.AnhadirRepresentantre(senador7);
		Legisladores.AnhadirRepresentantre(senador8);
		Legisladores.AnhadirRepresentantre(senador9);
		Legisladores.AnhadirRepresentantre(diputado);
		Legisladores.AnhadirRepresentantre(diputado1);
		Legisladores.AnhadirRepresentantre(diputado2);
		Legisladores.AnhadirRepresentantre(diputado3);
		Legisladores.AnhadirRepresentantre(diputado4);
		Legisladores.AnhadirRepresentantre(diputado5);
		Legisladores.AnhadirRepresentantre(diputado6);
		Legisladores.AnhadirRepresentantre(diputado7);
		Legisladores.AnhadirRepresentantre(diputado8);
		Legisladores.AnhadirRepresentantre(diputado9);
		
		
		System.out.println("Lista sin ordenar:" + "\n");
		System.out.println(Legisladores + "\n");
		System.out.println("Lista ordenada por provincias:" + "\n");
		Legisladores.OrdenarporProvincia();
		System.out.println(Legisladores + "\n");
		System.out.println("Lista ordenada por partidos:" + "\n");
		Legisladores.OrdenarporPartido();
		System.out.println(Legisladores + "\n");
		
		
		System.out.println("Número representantes PSOE en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PSOE, "Congreso de los diputados"));
		System.out.println("Numero de representantes del PSOE en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PSOE, "Senado"));
		System.out.println("Numero de representantes totales del PSOE: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.PSOE, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.PSOE, "Senado")) + "\n");
		
		
		System.out.println("Número representantes PP en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PP, "Congreso de los diputados"));
		System.out.println("Numero de representantes del PP en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PP, "Senado"));
		System.out.println("Numero de representantes totales del PP: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.PP, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.PP, "Senado")) + "\n");
		
		
		System.out.println("Número representantes PODEMOS en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PODEMOS, "Congreso de los diputados"));
		System.out.println("Numero de representantes del PODEMOS en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.PODEMOS, "Senado"));
		System.out.println("Numero de representantes totales del PODEMOS: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.PODEMOS, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.PODEMOS, "Senado")) + "\n");
		
		
		System.out.println("Número representantes VOX en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.VOX, "Congreso de los diputados"));
		System.out.println("Numero de representantes del VOX en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.VOX, "Senado"));
		System.out.println("Numero de representantes totales del VOX: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.VOX, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.VOX, "Senado")) + "\n");
		
		
		System.out.println("Número representantes ERC en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.ERC, "Congreso de los diputados"));
		System.out.println("Numero de representantes del ERC en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.ERC, "Senado"));
		System.out.println("Numero de representantes totales del ERC: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.ERC, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.ERC, "Senado")) + "\n");
		
		
		System.out.println("Número representantes BNG en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.BNG, "Congreso de los diputados"));
		System.out.println("Numero de representantes del BNG en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.BNG, "Senado"));
		System.out.println("Numero de representantes totales del BNG: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.BNG, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.BNG, "Senado")) + "\n");
		
		
		System.out.println("Número representantes BILDU en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.BILDU, "Congreso de los diputados"));
		System.out.println("Numero de representantes del BILDU en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.BILDU, "Senado"));
		System.out.println("Numero de representantes totales del BILDU: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.BILDU, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.BILDU, "Senado")) + "\n");
		
		
		System.out.println("Número representantes Teruel Existe en el congreso de los diputados: " + Legisladores.NumeroRepresentantes(PartidoPolitico.TeruelExiste, "Congreso de los diputados"));
		System.out.println("Numero de representantes del Teruel Existe en el senado: " + Legisladores.NumeroRepresentantes(PartidoPolitico.TeruelExiste, "Senado"));
		System.out.println("Numero de representantes totales del Teruel Existe: "  + (Legisladores.NumeroRepresentantes(PartidoPolitico.TeruelExiste, "Congreso de los diputados")+Legisladores.NumeroRepresentantes(PartidoPolitico.TeruelExiste, "Senado" )) + "\n");
		
		
		System.out.println("El partido mayoritario en el congreso de los diputados es: " + Legisladores.PartidoMayoritario("Congreso de los diputados"));
		System.out.println("El partido mayoritario en el senado es: " + Legisladores.PartidoMayoritario("Senado"));
		
		
		
	}

}
