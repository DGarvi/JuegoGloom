import java.util.Scanner;

public class Principal {
    
public static String mostrarEstadoFamilia(Jugador[] players,int turno){				/*Muestra el estado de las familias de los rivales en el turno*/
  
  String toret = "";
  
  for(int i = 0; i < players.length; i++){
  if(turno != i){
  toret += "Familia de: " + players[i].getNombre()+"\n";
  toret += players[i].getFamilia();
  toret += "\n";
  }
  }
  return toret;
 }    

public static void Turno (Jugador[] players, int turno){
    
    Scanner jugarOpasar= new Scanner(System.in);
    
    String opcion ="";
    int cartaEscogida = 0;
    boolean verdadero = false;
    CartaPersonaje cartaPlayer= null;
    int m = 1;																			/*Controla la jugada dentro del turno*/
    System.out.println(players[turno].getFamilia());                                    /*Muestra por pantalla la familia del jugador*/
    System.out.println(players[turno].getMano().toString());							/*Muestra por pantalla la mano del jugador*/
    
    
    do{																					/*Bucle que realiza las jugadas de cada turno*/
        System.out.println("Comienza la jugada " +m + "\n" );
        System.out.println("Tu mano:");
        System.out.println(players[turno].getMano().toString());
    do{
    int d= 0;
     
        verdadero=false;                                                                 /*Cuando verdadero = true significa que hubo un problema en la jugada y se repite el bucle de esa jugada*/
        System.out.println("Elige jugar o pasar (j/p)");
        opcion= jugarOpasar.nextLine();
         
        
        
        if(opcion.trim().toLowerCase().equals("j")){
     
            do{  System.out.println("Elige la carta");
            	
            try {	
            		
            	cartaEscogida = Integer.parseInt( jugarOpasar.nextLine() );
            	if(cartaEscogida<0 || cartaEscogida>4 || players[turno].getMano().getCarta(cartaEscogida)==null){
                    System.out.println("Carta invalida");
            	      
            	
            	
            }
            } catch (NumberFormatException exc) {
                }	
            	
            }while(cartaEscogida<0 || cartaEscogida>4 ||  players[turno].getMano().getCarta(cartaEscogida)==null);
            
            System.out.println("Carta escogida: \n\n"+"-" +players[turno].getMano().getCarta(cartaEscogida).toString());
           
            do{
                if(verdadero){
                    System.out.println("Personaje incorrecto.");
                    }
                verdadero=true;
            System.out.println("Familia de: "+players[turno].getNombre());
            System.out.println(players[turno].getFamilia());
            System.out.println(mostrarEstadoFamilia(players ,turno));
            System.out.println("Selecciona un personaje.");
            opcion= jugarOpasar.nextLine();
            
            for(int i=0; i< players.length; i++){
            if(players[i].getFamilia().estaPersonaje(opcion) && 
                        !players[i].getFamilia().getPersonaje(opcion).esEstaMuerto()){
                    verdadero = false;
                    cartaPlayer = players[i].getFamilia().getPersonaje(opcion);
                
            }
            }
            }while(verdadero);
        
            
        
        
           
System.out.println("----------------------------------------------------------------------------------------------");
        

    
if(players[turno].getMano().getCarta(cartaEscogida).estaMuerto())
      {
	if(players[turno].getMano().getCarta(cartaEscogida)== null){
		System.out.println("Carta ya usada");
		verdadero=true;
	}
	
    if(m>1){
    
    System.out.println("NO PUEDES JUGAR CARTAS DE MUERTE EN LA 2� JUGADA \n");
    
    System.out.println(players[turno].getFamilia());
    System.out.println(players[turno].getMano().toString());
    d++;
    verdadero= true;
}
      if(cartaPlayer.getAutoestimaTotal() >= 0)
      {
      System.out.println("No se puede matar si tiene la autoestima alta");
      System.out.println(players[turno].getFamilia());
      System.out.println(players[turno].getMano().toString());
      verdadero = true;
      
      }else{																			/*Diferentes condiciones para aplicar las cartas modificadoras que se elijan*/
      if(d==0){  
      cartaPlayer.setEstaMuerto(true);
          
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() > 0 || players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() < -1){
      cartaPlayer.setPuntosAltos(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos());       
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() == -1){      
      cartaPlayer.setPuntosAltos(0);
      }
      }
       
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() > 0 || players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() < -1){
      cartaPlayer.setPuntosMedios(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios()); 
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() == -1){        
      cartaPlayer.setPuntosMedios(0);
      }
      }
        
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() > 0 ||players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() < -1){       
      cartaPlayer.setPuntosBajos(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos());         
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() == -1){        
      cartaPlayer.setPuntosBajos(0);     
      }
      }
      verdadero = false;
      }
      }
      }else{
                                            
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() > 0 || players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() < -1){
      cartaPlayer.setPuntosAltos(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos());       
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosAltos() == -1){      
       cartaPlayer.setPuntosAltos(0);
      }
      }
       
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() > 0 || players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() < -1){
      cartaPlayer.setPuntosMedios(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios()); 
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosMedios() == -1){        
      cartaPlayer.setPuntosMedios(0);
      }
      }

      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() > 0 || players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() < -1){       
      cartaPlayer.setPuntosBajos(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos());         
      }else{
      if(players[turno].getMano().getCarta(cartaEscogida).getPuntosBajos() == -1){        
      cartaPlayer.setPuntosBajos(0);     
      }
      }
      	verdadero = false;
      }
      
      players[turno].getMano().sacaCartaMano(cartaEscogida);
      if(m > 1){
      players[turno].getMano().cogerCartaMazo(Mazo.getMazoCartas()[turno]);                                   
      
      
      }
      }else if(opcion.trim().toLowerCase().equals("p")){
    	  if(m > 1){
    	      players[turno].getMano().cogerCartaMazo(Mazo.getMazoCartas()[turno]);                                   
    	  }    
    	   verdadero = false;
    	  
    	   verdadero = false;
      }else if(opcion.trim().toLowerCase().equals("e")) {
    	  
    	  System.out.println("Gracias por jugar");
    	  System.exit(0);
    	  
      }else{
          
    	  System.out.println("Intoduce una j o una p");												/*Si se introduce un caracter distinto se repite el bucle*/
            verdadero = true;
        }
     
     }while(verdadero);
    
     if(cartaPlayer!= null){ 																			/*Para que no se muestre null al pasar turno*/
    
    	System.out.println(cartaPlayer);
    
    }m++;
    
   
    
    System.out.println("----------------------------------------------------------------------------------------------");
    }while(m < 3);
 }

public static void main (String [] args){		
        
System.out.println("GLOOM \n");
System.out.println("\nGLOOM es un juego de cartas en el que el objetivo es conseguir la menor autoestima posible \n"
		+ 					"en los personajes de la familia que escoges. Puedes incluso matarlos si tienen baja autoestima \n"
		+ 					"para no poder modificarlos. Cada jugador tiene 5 cartas y en cada turno se pueden hacer hasta  \n"
		+ 					"2 jugadas, aunque en la 2� jugada no se puede matar. (si la autoestima en la carta es 0        \n"
		+ 					"significa que es *transparente* mientras que si es -1 la autoestima superpone un 0 en el valor) \n"
		+					"Puedes SALIR del juego en tu turno escribiendo 'e' \n");
        Scanner numeroj = new Scanner (System.in);	
        Mazo mazo;
        mazo = new Mazo();
     
        int opcion = 0;
        int turno = 0;
System.out.println("Cuantos jugadores van a jugar (2...4) :");
    
    do {																			/*Se piden el numero de jugadores y se comprueba que se introduce un numero correcto*/
        

        try {
             opcion = Integer.parseInt( numeroj.nextLine() );
             if( opcion>4 || opcion < 2){
                 System.out.println("Introduzca un numero correcto");
             }
        } catch (NumberFormatException exc) {
        }   
     } while(opcion>4 || opcion<2);
     Jugador[] players = new Jugador[opcion];
    
    
    System.out.println("----------------------------------------------------------------------------------------------");
    
           Scanner ac = new Scanner(System.in);
           Scanner dc = new Scanner(System.in);
            
           boolean[] escogidas = new boolean[5];
  
  
   for(int i = 0;i < players.length; i++){                                	/*Se introducen los nombres de los jugadores*/
   
   System.out.println("----------------------------------------------------------------------------------------------");
   
   String nombre = "";
   int familiaescogida;
   
   CartaModificadora[] manoJugador = new CartaModificadora[5];
   
   System.out.println("Introduce tus datos Jugador " + (i+1));
   
   
   System.out.println("Nombre: ");
   nombre = ac.nextLine();
   do{																		/*Cada jugador elige una familia que no este escogida*/
   
   System.out.println("Las familias que puedes escoger son: ");
   System.out.println(FamiliasDelJuego.mostrarFamilia());

   familiaescogida = Integer.parseInt( dc.next() );
   
   if(escogidas[familiaescogida] == true){
        System.out.println("Familia ya escogida, escoge otra: ");
        }
   
   }while(familiaescogida < 0 || familiaescogida > 4 || escogidas[familiaescogida] == true);
   
   
   for(int j = 0; j < 5; j++){												/*Se reparte la mano inicial*/
    
   manoJugador[j] = Mazo.repartirCarta();
    
   }
   escogidas[familiaescogida] = true;
   players[i]=new Jugador (nombre,FamiliasDelJuego.getFamilia(familiaescogida-1),new Mano(manoJugador));
   }
   do{																		/*Bucle del juego que termina al acabar la partida*/
   
   System.out.println("----------------------------------------------------------------------------------------------");
   System.out.println("Turno de: " + players[turno].getNombre()+"\n");
   Turno(players,turno);
   turno++;
   if(turno == players.length){
    turno = 0;
   }
   }while(mazo.getNumCartas() > 0 && !familiasViva(players)); 

   																			/*Se comparan las puntuaciones y se obtiene el ganador, que se imprime por pantalla con su puntuacion*/
   int cont[] = new int [players.length];
   int contator[] = new int [players.length];
   for(int i = 0;i < players.length; i++){ 
   for(int a = 0; a < 5 ; a++){
    
   cont[i]+=players[i].getFamilia().getPj(a).getAutoestimaTotal();
   contator[i]+=players[i].getFamilia().getPj(a).getAutoestimaTotal();
  
  }
  }
   
   
   
   for(int i = 0;i < players.length; i++){
	   for(int j=i+1;j<players.length;j++){
       if(cont[i]<cont[j]){
           int variableauxiliar=cont[i];
           cont[i]=cont[j];
           cont[j]=variableauxiliar;
           }
   }
   
   
   }
  int p= 0;
   for(int d= 0 ; d<players.length; d++ ){
	   if(cont[0] == contator[d]){
		p=d;
	   }
	   
   }
   
   
   System.out.println("FIN DEL JUEGO");
   System.out.println("Ganador: "+players[p].getNombre());
   System.out.println("Puntuacion" + cont[0]);
   System.out.println("----------------------------------------------------------------------------------------------");
   for(int j = 0;j < players.length; j++){

    System.out.println(players[j].getNombre());
    System.out.println(cont[j]);
     
   }
 
}
                	
public static boolean familiasViva(Jugador[] jugadores){   								/*Esta funcion nos devuelve un true si todas las familias estan muertas, por lo que acaba la partida*/
  
  for(int i = 0;i < jugadores.length;i++){
   
  if(!jugadores[i].getFamilia().estadoFamilia()){
  return false;
  	}
  }
  return true;
  }

}