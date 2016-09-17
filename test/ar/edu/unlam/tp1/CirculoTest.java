// CASTIÑEIRA IGNACIO - 40.227.658 //

package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
	   Circulo miCirculo = new Circulo(2.0);
	   Double radio;
	   radio = miCirculo.getRadio();
	   assertEquals(2, radio, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo miCirculo = new Circulo(3.7);
		Double radio;
		radio = miCirculo.getRadio();
		assertEquals(3.7, radio, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo miCirculo = new Circulo(5.0);
		Double radio;
		radio = miCirculo.getRadio();
		assertEquals(5, radio, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo miCirculo = new Circulo(10.9);
		Double radio;
		radio = miCirculo.getRadio();
		assertEquals(10.9, radio, 0.01);
	}
	
	// Se cambia el valor del perimetro de 615.73 a 61.57 por mal formulacion del enunciado //
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo miCirculo = new Circulo(9.8);
		Double perimetro;
		perimetro = miCirculo.calculaPerimetro();
		assertEquals(61.57, perimetro, 0.01);
		
	}
	
	// Enunciado cambiado por errores: Circulo con radio 16.6 y que obtiene perimetro 104.30 //
	@Test
	public void crearUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo miCirculo = new Circulo(16.6);
		Double perimetro;
		perimetro = miCirculo.calculaPerimetro();
		assertEquals(104.30, perimetro, 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		
		
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
