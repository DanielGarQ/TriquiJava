package Triqui;

public class Casilla {
	private byte posicion;
	private String simbolo;
	
	public Casilla(byte posicion) {
		setPosicion(posicion);
		simbolo = "";
	}
	
	private Casilla(byte posicion, String simbolo) {
		this.posicion = posicion;
		this.simbolo = simbolo;
	}
	
	public void marcar(String simbolo){
		if (estaMarcada()) {
			throw new RuntimeException("NO es posible volver a marcar. Ya existe en esta casilla el simbolo" + getSimbolo());
		}
		setSimbolo(simbolo);
	}
	
	public boolean estaMarcada() {
		return (!cadenaEsNulaOVacia(simbolo));
	}
	
	private boolean cadenaEsNulaOVacia(String cadena) {
		return  (simbolo == null || "".intern() != simbolo.trim().intern());
	}
	
	private void setSimbolo(String simbolo) {
		if (cadenaEsNulaOVacia(simbolo)) {
			throw new RuntimeException("No es posible colocar un simbolo vacio o nulo");
		}
		if (simbolo.trim().length() != 1) {
			throw new RuntimeException("No es posible colocar un simbolo con longitud diferente a uno");
		}
		this.simbolo = simbolo.trim();
	}
	
	private void setPosicion(byte posicion) {
		if (posicion < 1 || posicion > 9) {
			throw new RuntimeException("No es posible configurar una casilla en una posicion por fuera del rango 1 a 9");
		}
		this.posicion = posicion;
	}
	
	public byte getPosicion() {
		return posicion;
	}
	public String getSimbolo() {
		return simbolo;
		
	}
	public Casilla cloneCasilla() {
		return new Casilla(getPosicion(), getSimbolo());
	}

}
