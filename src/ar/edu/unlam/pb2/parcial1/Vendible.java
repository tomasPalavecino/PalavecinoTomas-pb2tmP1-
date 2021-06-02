package ar.edu.unlam.pb2.parcial1;

public class Vendible extends Producto{
	
	private Double precioVenta;

	public Vendible(Integer codigoEsperado, String descripcionEsperada) {
		super(codigoEsperado, descripcionEsperada);
	}
	
	public Vendible(Integer codigoEsperado, String descripcionEsperada, Double precioVenta) {
		super(codigoEsperado, descripcionEsperada);
		this.precioVenta=precioVenta;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

}
