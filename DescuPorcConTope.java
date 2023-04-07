package IntroJavaClase1;

public class DescuPorcConTope extends DescuentoPorcentaje{
	private float tope;
	
	
	public DescuPorcConTope(float tope) {
		super(0);
		this.tope=tope;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setTotaldes(float valor) {
		
		if (valor>this.tope)
		{
			super.setTotaldes(0);
			System.out.println("no se puede porque supero el valor maximo de descuento");
		}else super.setTotaldes(valor);
		
	}
	public float getTope() {
		return tope;
	}
	public void setTope(float tope) {
		this.tope = tope;
	}
	
	

}
