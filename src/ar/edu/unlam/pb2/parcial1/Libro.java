package ar.edu.unlam.pb2.parcial1;

import java.util.LinkedList;
import java.util.List;

public class Libro extends Producto{
	
	private String autor;
	private String editorial;
	

	public Libro(Integer codigoEsperado, String descripcionEsperada, String autor, String editorial) {
		super(codigoEsperado, descripcionEsperada);
		this.autor=autor;
		this.editorial=editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	

}
