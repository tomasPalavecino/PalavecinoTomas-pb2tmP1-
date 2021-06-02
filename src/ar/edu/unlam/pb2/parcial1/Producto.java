package ar.edu.unlam.pb2.parcial1;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Producto {
	
	private Integer codigoEsperado;
	private String descripcionEsperada;
	private Estado estadoActual;
	
	List <Cliente> meTiene = new LinkedList<>();
	
	
	public Producto(Integer codigoEsperado, String descripcionEsperada) {
		this.codigoEsperado = codigoEsperado;
		this.descripcionEsperada = descripcionEsperada;
	}
	
	public Producto(Integer codigoEsperado, String descripcionEsperada, Estado estadoActual) {
		this.codigoEsperado = codigoEsperado;
		this.descripcionEsperada = descripcionEsperada;
		this.estadoActual=estadoActual;
	}


	public Integer getCodigo() {
		return codigoEsperado;
	}


	public void setCodigoEsperado(Integer codigoEsperado) {
		this.codigoEsperado = codigoEsperado;
	}


	public String getDescripcion() {
		return descripcionEsperada;
	}


	public void setDescripcionEsperada(String descripcionEsperada) {
		this.descripcionEsperada = descripcionEsperada;
	}


	public Estado getEstadoActual() {
		return this.estadoActual;
	}
	
	public Estado setEstadoActual(Estado estado) {
		return this.estadoActual = estado;
	}
	
	public Cliente getQuienPoseeElProducto() {
		for (Cliente cliente : meTiene) {
			return cliente;
		}
		return null;
	}

	public Boolean meLlevo(Cliente cliente) {
		return this.meTiene.add(cliente);
		
	}

	
	
	

}
