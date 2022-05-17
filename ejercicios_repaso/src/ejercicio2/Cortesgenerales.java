package ejercicio2;
import java.util.Collections;
import java.util.LinkedList;

public class Cortesgenerales{

		LinkedList<Legislador> Legisladores=new LinkedList <Legislador>();
		
		public Cortesgenerales() {
			
			LinkedList<Legislador> Legisladores=new LinkedList <Legislador>();
		}
	public int NumeroRepresentantes(PartidoPolitico partido, String camara) {
		int numero=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido().equals(partido) && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numero++;
				
			}
		}
		return numero;
	}
	public PartidoPolitico PartidoMayoritario(String camara) {
		int numeroPP=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.PP && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroPP++;
				
			}
		}
		int numeroPsoe=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.PSOE && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroPsoe++;
				
			}
		}
		int numeroPodemos=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.PODEMOS && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroPodemos++;
				
			}
		}
		int numeroBNG=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.BNG && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroBNG++;
				
			}
		}
		int numeroBILDU=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.BILDU && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroBILDU++;
				
			}
		}
		int numeroERC=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.ERC && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroERC++;
				
			}
		}
		int numeroTeruel=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.TeruelExiste && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroTeruel++;
				
			}
		}
		int numeroVOX=0;
		for(int i=0;i<Legisladores.size();i++) {
			if(Legisladores.get(i).getPartido()==PartidoPolitico.VOX && Legisladores.get(i).getCamaraEnQueTrabaja().equalsIgnoreCase(camara)) {
				numeroVOX++;
				
			}
		}
		int [] representantes= {numeroPP, numeroPsoe, numeroPodemos, numeroBNG, numeroBILDU, numeroERC, numeroVOX, numeroTeruel};
			
		int maximo=representantes[0];
			for(int i=0;i<representantes.length;i++) {
				
				if(representantes[i]>maximo) {
					maximo=representantes[i];
				}
			}
			if (maximo==representantes[0]) {
				return PartidoPolitico.PP;
			}
			else if (maximo==representantes[1]) {
				return PartidoPolitico.PSOE;
			}
			if (maximo==representantes[2]) {
				return PartidoPolitico.PODEMOS;
			}
			if (maximo==representantes[3]) {
				return PartidoPolitico.BNG;
			}
			if (maximo==representantes[4]) {
				return PartidoPolitico.BILDU;
			}
			if (maximo==representantes[5]) {
				return PartidoPolitico.ERC;
			}
			if (maximo==representantes[6]) {
				return PartidoPolitico.VOX;
			}
			else {
				return PartidoPolitico.TeruelExiste;
			}
			
			
		
			
	}
	public void AnhadirRepresentantre(Legislador legislador) {
		Legisladores.add(legislador);
	}
	public void EliminarRepresentante(Legislador legislador) {
		Legisladores.remove(legislador);
	}
	public void OrdenarporProvincia() {
		OrdenarporProvincia comparador1=new OrdenarporProvincia();
		Collections.sort(Legisladores, comparador1);
	}
	public void OrdenarporPartido() {
		OrdenarporPartido comparador2=new OrdenarporPartido();
		Collections.sort(Legisladores, comparador2);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Cortesgenerales [Legisladores=" + Legisladores + "]";
	}
	
	
	
	
}
