package aula13;

public class Losango extends Quadrilatero{
	protected double diagonalMenor;
	protected double diagonalMaior;
 
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	
		
	}
	
	public void calcularArea() {
		
		System.out.println("A �rea do /losango � = " + (this.diagonalMaior * this.diagonalMenor)/2);
	}
}
