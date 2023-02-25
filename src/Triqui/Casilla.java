package Triqui;

public class Casilla {
	private byte posicion;
	private String simbolo;
	
	public void marcar(String simbolo){
		throw new RuntimeException("NO es posible volver a marcar. Ya existe en esta casilla el simbolo" + getSimbolo());
	}
	
	private boolean cadenaEsNulaOVacia(String cadena) {
		return  (simbolo == null || "".intern() != simbolo.trim().intern());
	}
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

}
