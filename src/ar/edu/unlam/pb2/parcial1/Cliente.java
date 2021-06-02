package ar.edu.unlam.pb2.parcial1;

import java.util.LinkedList;
import java.util.List;


public class Cliente {
	
	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	
	List <Producto> productoTomado = new LinkedList<>();

	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		this.codigo=codigo;
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	public Boolean llevarProducto(Producto producto) {
		Integer cantidad = obtenerCantidadProductos();
		if(cantidad<2) {
			// El 2 es la posicion del array
			this.productoTomado.add(producto);
			return true;
		}
		return false;
		
	}

	private Integer obtenerCantidadProductos() {
		return productoTomado.size();
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
