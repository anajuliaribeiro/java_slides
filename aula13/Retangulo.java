package aula13;

public class Retangulo extends Quadrilatero{
	protected double base;
	protected double altura;

	
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public void calcularArea() {
		
		System.out.println("A área do retângulo é = " + this.base*this.altura);
	}
}
