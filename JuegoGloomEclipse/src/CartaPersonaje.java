
public class CartaPersonaje {
	
                        
	private boolean estaMuerto; 
	private int puntosAltos;
	private int puntosMedios;
	private int puntosBajos;
	private String nombre;
	
	
	public CartaPersonaje(String nombre){
		
		this.nombre = nombre;
		puntosAltos = 0;
		puntosMedios = 0;
		puntosBajos = 0;
		estaMuerto = false;
		
	}
	public boolean esEstaMuerto() {
		return estaMuerto;
	}
	public int getPuntosAlto() {
		return puntosAltos;
	}
	public int getPuntosMedio() {
		return puntosMedios;
	}
	public int getPuntosBajo() {
		return puntosBajos;
	}
	public String getNombre() {
		return nombre;
	}	
	
	public int getAutoestimaTotal(){
		
        return puntosAltos + puntosMedios + puntosBajos;
		
        }
		
	
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public void setPuntosAltos(int puntosAlto) {
		this.puntosAltos = puntosAlto;
	}
	public void setPuntosMedios(int puntosMedio) {
		this.puntosMedios = puntosMedio;
	}
	public void setPuntosBajos(int puntosBajo) {
		this.puntosBajos = puntosBajo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString(){
		
		String toret = "";
		
		toret += "-" +nombre+"\n" + "(Muerto: " + estaMuerto + ")" + " PuntosAltos: " + puntosAltos 
				+ " PuntosMedios: " + puntosMedios + " PuntosBajos: " + puntosBajos;
		
		return toret;
	}
	
	
}
