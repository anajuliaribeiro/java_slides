
package aula13;

public class Quadrado extends Quadrilatero{
	protected double lado;
	

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	
	}
	
	public void calcularArea() {
		
	
		System.out.println("A �rea do quadrado � = " + (this.lado * this.lado));
	}
	
}
