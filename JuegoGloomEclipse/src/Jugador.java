
public class Jugador {
	
	
	private String nombre;       /*Nombre del jugador*/
	private Familia familia;     /*Familia del jugador*/ 
	private Mano mano;           /*Mano del jugador*/
	
	public Jugador(String nombre, Familia familia, Mano mano) {

		this.nombre = nombre;
		this.familia = familia;
		this.mano = mano;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Familia getFamilia() {
		return familia;
	}
	
	public Mano getMano(){
		return mano;
	}
	
	public String toString() {
		return "Nombre = " + nombre + "\nFamilia " + familia + "\n" + mano ;
	}
	
	

}
