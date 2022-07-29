package anajulia;

public class Caminhao extends Veiculo {

	private int capacidadeMax;
	private int quantidade;
	private boolean transporte;

	public Caminhao(String marca, String modelo, int anoFabricacao, int capacidadeMax) {
		
		super(marca, modelo, anoFabricacao);
		this.capacidadeMax = capacidadeMax;
		this.quantidade = 0;
		this.transporte = false;
	}

	public void carregarCacamba(int quantidade) {

		if (this.quantidade + quantidade <= this.capacidadeMax) {

			this.quantidade = this.quantidade + quantidade;

		} else {

			this.quantidade = this.capacidadeMax;
		}
		
		System.out.println("Carga Atual: " + this.quantidade + "t");
	}

	private void esvaziarCacamba() {
		
		if (this.transporte == true) {
		
			this.quantidade = 0;
			this.transporte = false;
			System.out.println("Esvaziando caçamba. Carga Atual: " + this.quantidade + "t");
		}
	}

	public void realizarTransporte() {
		
		if (this.ligado == true && this.quantidade > 0 && this.transporte == false) {
		
			this.transporte = true;
			System.out.println("O caminhão realizou o transporte.");
			
			this.esvaziarCacamba();
		
		} else {
			
			System.out.println("Transporte não realizado");
		}
	}
}
