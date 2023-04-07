package IntroJavaClase1;

public class DescuentoPorcentaje extends Decuento {
	
	public DescuentoPorcentaje(float valor) {
		
		super (valor);
	}

	@Override
	public float descon(float valorInicial) {
		
		return valorInicial-(valorInicial*super.getTotaldes());
	}
	

}
