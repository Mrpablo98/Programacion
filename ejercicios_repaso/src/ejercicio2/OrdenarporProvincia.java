package ejercicio2;

import java.util.Comparator;

public class OrdenarporProvincia implements Comparator<Legislador> {

	@Override
	public int compare(Legislador legislador1, Legislador legislador2) {
		
if(legislador1.getCamaraEnQueTrabaja().equals(legislador2.getCamaraEnQueTrabaja()) && legislador1.getProvincia().equals(legislador2.getProvincia()) && legislador1.getPartido().equals(legislador2.getPartido())){
			
			return legislador1.getApellidos().compareTo(legislador2.getApellidos());
			
				
			}else if(legislador1.getCamaraEnQueTrabaja().equals(legislador2.getCamaraEnQueTrabaja()) && legislador1.getProvincia().equals(legislador2.getProvincia())) {
				
				return legislador1.getPartido().compareTo(legislador2.getPartido());
				
			}else if(legislador1.getCamaraEnQueTrabaja().equals(legislador2.getCamaraEnQueTrabaja())) {
				return legislador1.getProvincia().compareTo(legislador2.getProvincia());
			}else {
				return legislador1.getCamaraEnQueTrabaja().compareTo(legislador2.getCamaraEnQueTrabaja());
			}
	}

}
