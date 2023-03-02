package paquete2;

import paquete1.Personaje;

public class Pelea {

	private Personaje personaje1;
	private Personaje personaje2;
	
	public Pelea(Personaje personaje1, Personaje personaje2) {
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;
	}
	
	public void pelea() {
		
		personaje2.quitarVida(personaje1.getDanio());
		personaje1.quitarVida(personaje2.getDanio());
		
	}
	
	
}
