package ar.edu.unlam.pb2.parcial1;

public class Alquilable extends Producto{
	
	private Double precioAlquiler;

	public Alquilable(Integer codigoEsperado, String descripcionEsperada) {
		super(codigoEsperado, descripcionEsperada);
	}
	
	public Alquilable(Integer codigoEsperado, String descripcionEsperada, Double precioAlquiler) {
		super(codigoEsperado, descripcionEsperada);
		this.precioAlquiler=precioAlquiler;
	}

	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
}
