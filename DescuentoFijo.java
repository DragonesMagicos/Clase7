package IntroJavaClase1;

public class DescuentoFijo extends Decuento{

	public DescuentoFijo(float valor) {
	
		super (valor);
	}

	@Override
	public float descon(float valorInicial) {
		
		return valorInicial-super.getTotaldes();
	}
	
}
