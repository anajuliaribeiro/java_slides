package aula15;

public class CarrinhoCompra {
	
	private double valorProdutos;
	private int distancia;
	private Frete frete;
	
	
	public CarrinhoCompra(double valorProdutos, int distancia, Correios correios) {
		super();
		this.valorProdutos = valorProdutos;
		this.distancia = distancia;
		
	}
	
	public void realizarCompra() {
		
		double valorFrete = this.correios.calcularFrete(distancia);
		double valorTotalCompra = 0.00;
	
		valorTotalCompra = valorProdutos + this.correios.calcularFrete(this.distancia);
	 valorTotalCompra= this.valorProdutos + this.sedex.calcularFrete(this.distancia);
		
		System.out.println("Valor Total: R$" + valorTotalCompra);
	}


}
