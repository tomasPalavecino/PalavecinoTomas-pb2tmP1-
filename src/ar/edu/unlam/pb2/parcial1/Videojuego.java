package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Alquilable{
	
	private TipoDeConsola consola;

	public Videojuego(Integer codigoEsperado, String descripcionEsperada, TipoDeConsola consola) {
		super(codigoEsperado, descripcionEsperada);
		this.consola=consola;
	}

	public TipoDeConsola getTipo() {
		return consola;
	}

	public void setTipo(TipoDeConsola tipo) {
		this.consola = tipo;
	}
	
	

	

}
