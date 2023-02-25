package Triqui;

public class Casilla {
	private int posicion;
	private char simbolo;
	
	public void marcar(String simbolo){
		throw new RuntimeException("NO es posible volver a marcar. Ya existe en esta casilla el simbolo" + getSimbolo());
	}
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public char getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

}
