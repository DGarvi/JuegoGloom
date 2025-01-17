import java.util.Random;

public class Mazo {
	
	public static final int CARTAS_MAZO = 78;
	private static CartaModificadora [] mazoCartas;
    private static int numCartas;
	private Random numeroAleatorio;

    public static CartaModificadora[] getMazoCartas() {
        return mazoCartas;
    }
	
	public Mazo()
	{
		mazoCartas = new CartaModificadora[CARTAS_MAZO];
		numCartas = 78;
		
		//crear 17 cartas de muerte prematura
		
		int i = 0;
		for(int j = 0; j < 17; j++){
			mazoCartas[i++] = new CartaModificadora(true,0,0,0);
		}
		
		//crear 3 cartas de muerte prematura
		
		mazoCartas[i++] = new CartaModificadora(true,-15,0,0);
		mazoCartas[i++] = new CartaModificadora(true,0,0,-15);
		mazoCartas[i++] = new CartaModificadora(true,-1,-1,-1);
		
		//crear las 58 cartas de modificadores
		//las que restan puntos
		
		for(int j = 1; j <= 5; j++){
			mazoCartas[i++] = new CartaModificadora(false,-10,0,0);
		}
		for(int j = 1; j <= 5; j++){
			mazoCartas[i++] = new CartaModificadora(false,-15,0,0);
		}
		for(int j = 1; j <= 6; j++){
			mazoCartas[i++] = new CartaModificadora(false,-20,0,0);
		}	
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,0,-10,0);
		}
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,0,-15,0);
		}
		for(int j = 1; j <= 3; j++){
			mazoCartas[i++] = new CartaModificadora(false,0,-20,0);
		}
		
		mazoCartas[i++] = new CartaModificadora(false,0,-25,0);
		mazoCartas[i++] = new CartaModificadora(false,0,0,-10);
		mazoCartas[i++] = new CartaModificadora(false,0,0,-15);
		mazoCartas[i++] = new CartaModificadora(false,0,0,-25);
		mazoCartas[i++] = new CartaModificadora(false, -5,-5,0);
		mazoCartas[i++] = new CartaModificadora(false,-10,-5,0);
		mazoCartas[i++] = new CartaModificadora(false,-10,-10,0);
		mazoCartas[i++] = new CartaModificadora(false,-10,-10,0);
		mazoCartas[i++] = new CartaModificadora(false,-15,-10,0);
		mazoCartas[i++] = new CartaModificadora(false,-15,-15,0);
		mazoCartas[i++] = new CartaModificadora(false,-15,-15,0);
		mazoCartas[i++] = new CartaModificadora(false,-20,-10,0);
		mazoCartas[i++] = new CartaModificadora(false,0,-10,-10);
		mazoCartas[i++] = new CartaModificadora(false,0,-15,-20);
		mazoCartas[i++] = new CartaModificadora(false,0,-20,-20);
		mazoCartas[i++] = new CartaModificadora(false,-10,0,-15);
		mazoCartas[i++] = new CartaModificadora(false,-15,0,-10);
		mazoCartas[i++] = new CartaModificadora(false,-10,0,-20);
		
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,-15,0,-15);
		}
		
		mazoCartas[i++] = new CartaModificadora(false,-15,-15,-15);
		
		//crear las que suman puntos
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,10,0,0);
		}
		mazoCartas[i++] = new CartaModificadora(false,15,0,0);
		mazoCartas[i++] = new CartaModificadora(false,0,10,0);
		mazoCartas[i++] = new CartaModificadora(false,0,15,0);
		mazoCartas[i++] = new CartaModificadora(false,10,5,0);
		mazoCartas[i++] = new CartaModificadora(false,10,-1,0);
		
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,-1,0,15);
		}
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,-1,0,20);
		}
		mazoCartas[i++] = new CartaModificadora(false,-1,10,0);
		for(int j = 1; j <= 2; j++){
			mazoCartas[i++] = new CartaModificadora(false,-1,15,0);
		}
		
		barajar();
	}
	
	private void barajar()
	{
		int k;
        CartaModificadora t;
		numeroAleatorio = new Random(System.currentTimeMillis());
		for(int i = 0;i < CARTAS_MAZO;i++){
		k = numeroAleatorio.nextInt(CARTAS_MAZO);
        t = mazoCartas[i];
        mazoCartas[i] = mazoCartas[k];
        mazoCartas[k] = t;
		                  
	}
}
        
	public int getNumCartas(){
		return numCartas;
	}
	public static CartaModificadora repartirCarta(){
		
		if(numCartas > 0){
			
		return mazoCartas[--numCartas];
		
		}else return null;
		
	}
	
}
