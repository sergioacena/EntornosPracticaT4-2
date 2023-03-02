package paquete1;

public class Personaje {

	//EDIT - CAMBIO PARA GITHUB 2
	
	private int vida;
	private int danio;
	
	/**
	 * Clase para crear un personaje introduciendo vida y daño por parámetros.
	 * @param vida
	 * @param danio
	 */
	public Personaje(int vida, int danio) {
		this.vida = vida;
		this.danio = danio;
	}
	
	/**
	 * Método para obtener el daño del personaje
	 * @return
	 */
	public int getDanio() {
		return danio;
	}

	/**
	 * METODO DE QUITAR VIDA - CAMBIO1
	 * @param danio
	 */
	public void quitarVida(int danio) {
		vida = vida - danio;
	}
	
}
