package aula15;

public class Sedex implements Frete{
	public double calcularFrete(int distancia) {
		
		return 15.00 + (distancia * 0.50);
	}
}
