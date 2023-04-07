package IntroJavaClase1;

import java.time.LocalDateTime;

public class Carrito {
	
	private Producto produc1;
	private Producto produc2;
	private Producto produc3;
	private LocalDateTime fechaCompra;
	
	
	
	public Carrito(Producto produc1, Producto produc2, Producto produc3, LocalDateTime fechaCompra) {
		this.produc1 = produc1;
		this.produc2 = produc2;
		this.produc3 = produc3;
		this.fechaCompra = fechaCompra;
	}



	public void setProduc1(Producto produc1) {
		this.produc1 = produc1;
	}



	public void setProduc2(Producto produc2) {
		this.produc2 = produc2;
	}



	public void setProduc3(Producto produc3) {
		this.produc3 = produc3;
	}



	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal(Decuento des) {
		
		float total=des.descon( this.produc1.getPrecio()+this.produc2.getPrecio()+this.produc3.getPrecio());
		return total;
	}
	
	




}

