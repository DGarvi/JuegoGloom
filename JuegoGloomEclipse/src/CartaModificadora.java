
public class CartaModificadora {
	
    
    private boolean muerto; 
	private int puntosAltos;
	private int puntosMedios;
	private int puntosBajos;
	
	public CartaModificadora(boolean muerto, int puntosAltos, int puntosMedios, int puntosBajos) {

		this.muerto = muerto;
		this.puntosAltos = puntosAltos;
		this.puntosMedios = puntosMedios;
		this.puntosBajos = puntosBajos;
		
	}
	
	public boolean estaMuerto() {
		return muerto;
	}

	public int getPuntosAltos() {
		return puntosAltos;
	}

	public int getPuntosMedios() {
		return puntosMedios;
	}

	public int getPuntosBajos() {
		return puntosBajos;
	}

	public String toString(){
		
		String toret = "";
		if(muerto == true){
                    toret += "Carta Muerte Prematura:";
                }else{
                    toret += "Carta Modificadora:";
                }
		toret += " Puntos Altos: " + puntosAltos + " Puntos Medios: " + puntosMedios + " Puntos Bajos: " + puntosBajos + "\n";
		return toret;
		
	}
	
	
	
	
	

}


