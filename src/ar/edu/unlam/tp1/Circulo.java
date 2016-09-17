// CASTIÑEIRA IGNACIO - 40.227.658 //

package ar.edu.unlam.tp1;

public class Circulo 

{
	private Double radio;
	
	public Circulo(Double radio)
	{
		this.radio = radio;
	}
	
	public Double getRadio() //getter del radio//
	{
		return radio;
	}
	
	public void setRadio(Double radio) //setter del radio//
	{
		this.radio = radio;
	}
	
	public Double calculaPerimetro()   //• método para calcular Perimetro
	{
		Double perimetro;
		perimetro = (radio * 2 * Math.PI);
		return perimetro;
	}
	
	public Double calculaArea()       //• método para calcular Area
	{
		Double area;
		area = Math.pow(radio * Math.PI, 2);
		return area;
	}
	
}
