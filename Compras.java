package IntroJavaClase1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String archivo="compra.txt";
        
        try {
        	List<String> lista=Files.readAllLines(Paths.get(archivo));
        	String[] linea1=lista.get(1).split(" ");
        	String[] linea2=lista.get(2).split(" ");
        	String[] linea3=lista.get(3).split(" ");
        	
        	Producto producto1=new Producto(linea1[1],linea1[2],Float.parseFloat(linea1[0]));
        	Producto producto2=new Producto(linea2[1],linea2[2],Float.parseFloat(linea2[0]));
        	Producto producto3=new Producto(linea3[1],linea3[2],Float.parseFloat(linea3[0]));
        	
        	Carrito carrito = new Carrito(producto1,producto2,producto3,LocalDateTime.parse("2023-10-22T11:12:00"));
        	
        	Persona persona1=new Persona("Loca","re Loca",LocalDateTime.parse("1980-03-13T11:12:00"),carrito);
            Carrito miCarrito=persona1.getCarrito();
            
            Decuento desFijo=new DescuentoFijo(25);
            Decuento desPor=new DescuentoPorcentaje(0.20f);
            Decuento desPorTope= new DescuPorcConTope(0.30f);
            
            desPorTope.setTotaldes(0.2f);
            
            float resultado=miCarrito.costoFinal(desPorTope);
            
            System.out.println(resultado);
            
        }catch(IOException e) {
        	System.out.println("error");
        }
	}

}
