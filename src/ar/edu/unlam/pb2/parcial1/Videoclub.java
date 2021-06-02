package ar.edu.unlam.pb2.parcial1;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {
	
	private String nombre;
	List <Producto> listaProductosDisponibles = new LinkedList<>();
	List <Producto> listaProductosAlquilados = new LinkedList<>();
	List <Producto> listaProductosVendidos = new LinkedList<>();
	List <Cliente> listaClientes = new LinkedList<>();
	
	public Videoclub(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.listaProductosDisponibles.add(nuevoProducto);	
	}
	public void agregarCliente(Cliente nuevoCliente) {
		this.listaClientes.add(nuevoCliente);	
	}
	

	public Producto buscarProducto(Producto nuevoProducto) {
		for (Producto producto : listaProductosDisponibles) {
			if(producto.equals(nuevoProducto)) {
				producto.setEstadoActual(Estado.DISPONIBLE);
				return producto;
			}
		}
		for (Producto producto : listaProductosVendidos) {
			if(producto.equals(nuevoProducto)) {
				producto.setEstadoActual(Estado.VENDIDO);
				return producto;
			}
		}
		for (Producto producto : listaProductosAlquilados) {
			if(producto.equals(nuevoProducto)) {
				producto.setEstadoActual(Estado.ALQUILADO);
				return producto;
			}
		}
		return null;
	}
	public Cliente buscarCliente(Cliente nuevoCliente) {
		for (Cliente cliente : listaClientes) {
			if(cliente.equals(nuevoCliente)) {
				return cliente;
			}
		}
		return null;
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto producto = this.buscarProducto(nuevoProducto);
		Cliente cliente = this.buscarCliente(nuevoCliente);
		
		if(producto.getEstadoActual().equals(Estado.DISPONIBLE)) {
			this.buscarCliente(nuevoCliente).llevarProducto(producto);
			this.buscarProducto(nuevoProducto).meLlevo(cliente);
			producto.setEstadoActual(Estado.VENDIDO);
			this.listaProductosDisponibles.remove(producto);
			this.listaProductosVendidos.add(producto);
			System.out.println("hola");
			return true;
		}
		
		return false;
	}

	public Boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto producto = this.buscarProducto(nuevoProducto);
		Cliente cliente = this.buscarCliente(nuevoCliente);
		
		if(producto.getEstadoActual().equals(Estado.VENDIDO)) {
			this.buscarCliente(nuevoCliente).llevarProducto(producto);
			this.buscarProducto(nuevoProducto).meLlevo(cliente);
			producto.setEstadoActual(Estado.ALQUILADO);
			this.listaProductosDisponibles.remove(producto);
			this.listaProductosVendidos.remove(producto);
			this.listaProductosAlquilados.add(producto);
			return true;
		}
		
		return false;
	}
	
	

}
