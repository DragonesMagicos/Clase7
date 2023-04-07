package IntroJavaClase1;

public abstract class Decuento {
	
	private float valor;

	
	public Decuento(float valor) {
		this.valor = valor;
	}

	public float getTotaldes() {
		return valor;
	}

	public void setTotaldes(float totaldes) {
		this.valor = totaldes;
	}
	
	public abstract float descon(float ValorInicial);

}
