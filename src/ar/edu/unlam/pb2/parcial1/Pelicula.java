package ar.edu.unlam.pb2.parcial1;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Vendible{
	
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	List <Actor> listaActoresEsperados = new LinkedList<>();

	public Pelicula(Integer codigoEsperado, String descripcionEsperada, Genero genero,
			Integer anoDeEstreno, String director) {
		super(codigoEsperado, descripcionEsperada);
		this.genero=genero;
		this.anoDeEstreno=anoDeEstreno;
		this.director=director;
	}
	
	public void agregarActor(Actor actor) {
		this.listaActoresEsperados.add(actor);
		
	}
	

	public Boolean actua(Actor actorABuscar) {
		for (Actor actor : listaActoresEsperados) {
			if(actor.equals(actorABuscar)) {
				return true;
			}
		}
		return false;
	}
	
	

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
