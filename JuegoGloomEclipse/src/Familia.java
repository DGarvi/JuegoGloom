
public class Familia {
	
	private CartaPersonaje[] familia;     /*Familia del jugador*/
	private String nombre;                /*Nombre del jugador*/
	
	
	public Familia(String nombre,CartaPersonaje[] familia){
		
		this.nombre = nombre;
		this.familia = familia;
	}
	
	public String getNombreFamilia(){
		return nombre;
	}
	
	public boolean estadoFamilia(){
		for(int i = 0;i < 5;i++){
			if(!familia[i].esEstaMuerto()){ 
			return false;
		}
	}
	return true;
	}
	
	public boolean estaPersonaje(String nombre){		
	for(int i = 0;i < 5;i++){	
		if(familia[i].getNombre().equals(nombre)){
				return true;
				}
		}
		return false;
	}
	
        public CartaPersonaje getPj(int a){
  
        return familia[a];
        }
        
	public CartaPersonaje getPersonaje(String nombre){		
	for(int i = 0;i < 5;i++){
		if(familia[i].getNombre().equals(nombre)){
				return familia[i];
                                }
		}
		return null;
        }
	public String toString(){
		String toret = "";
		toret += nombre + ": \n";
	for(int i = 0; i < 5; i++){
		toret += familia[i].toString() + "\n";
		}
        return toret;
	}
	
	
	
}