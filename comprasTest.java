package IntroJavaClase1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class comprasTest {

	@Test
	void testCostoFinalDF() {
		Producto producto1=new Producto("arroz","hteg2",2500);
		Producto producto2=new Producto("fideos","hteg02",2500);
		Producto producto3=new Producto("mani","hteg22",2500);
		Carrito carrito = new Carrito(producto1,producto2,producto3,LocalDateTime.parse("2023-10-22T11:12:00"));
		Decuento desFijo=new DescuentoFijo(2500);
        float resultado=carrito.costoFinal(desFijo);
        
        assertEquals(resultado,5000);
        

		
	}
	@Test
	void testCostoFinalDP() {
		Producto producto1=new Producto("arroz","hteg2",4000);
		Producto producto2=new Producto("fideos","hteg02",4000);
		Producto producto3=new Producto("mani","hteg22",2000);
		Carrito carrito = new Carrito(producto1,producto2,producto3,LocalDateTime.parse("2023-10-22T11:12:00"));
		Decuento desP=new DescuentoPorcentaje(0.5f);
		desP.setTotaldes(0.20f);
        float resultado=carrito.costoFinal(desP);
        
        assertEquals(resultado,8000);
        

		
	}

}
