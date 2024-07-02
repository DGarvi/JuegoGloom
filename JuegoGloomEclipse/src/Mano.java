
public class Mano {
	
	
	private CartaModificadora[] mano;    /*Cartas modificadoras en Mano*/
	private int numCartas;               /*Numero de cartas en la Mano*/
	
	
	public Mano(CartaModificadora[] mano){
		
    this.mano = new CartaModificadora[5];
	this.mano = mano;
	numCartas = 0;
		
		
	}

    public CartaModificadora[] getMano() {
        return mano;
    }
	
	public CartaModificadora getCarta(int pos){
		return mano[pos];
	}
	
	public void sacaCartaMano(int posicion){
		mano[posicion] = null;
		numCartas--;
		
	}
	

    public void cogerCartaMazo(CartaModificadora cartaNueva){
		
      for (int i = 0; i < getMano().length; i++){
                    
       if ( mano[i]== null){
            mano[i] = cartaNueva;
            numCartas++;
       }    
       }
}    

    public String toString() {
        String toret = "";
	for(int i = 0;i < 5 ;i++){
		if(mano[i] != null){
	toret += i + ": " + mano[i].toString();
}
}
	return toret;
    }
	
        
        
}	