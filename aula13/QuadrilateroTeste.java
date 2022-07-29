package aula13;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Quadrilatero quadrilatero = null;
		
		//quadrilatero = new Losango(4, 4);
		quadrilatero = new Quadrado(4);
		//quadrilatero = new Retangulo(5,2);
		
		quadrilatero.calcularArea();
	}
}
