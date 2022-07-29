
package aula13;

public class Quadrado extends Quadrilatero{
	protected double lado;
	

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	
	}
	
	public void calcularArea() {
		
	
		System.out.println("A área do quadrado é = " + (this.lado * this.lado));
	}
	
}
