package anajulia;

public class Onibus extends Veiculo {

	private int capacidadeMax;
	private int nPassageiros;

	public Onibus(String marca, String modelo, int anoFabricacao, int capacidadeMax) {

		super(marca, modelo, anoFabricacao);
		this.capacidadeMax = capacidadeMax;
		this.nPassageiros = 0;
	}

	public void inserirPassageiros(int nPassageiros) {
		
		System.out.println("O ônibus está recebendo os passageiros.");
		this.nPassageiros += nPassageiros;
		System.out.println("Quantidade de passageiros no ônibus: " + this.nPassageiros);
	}

	public void retirarPassageiros(int nPassageiros) {

		if (nPassageiros <= this.nPassageiros) {

			this.nPassageiros -= nPassageiros;
			System.out.println("Estão sendo retirados " + nPassageiros + " passageiros do onibus.");
			System.out.println("Quantidade passageiros: " + this.nPassageiros);
		}
	}

	public void realizarTransporte() {
		
		if (this.ligado == true && this.nPassageiros > 0 && this.nPassageiros <= this.capacidadeMax) {

			System.out.println("Realizando o transporte do onibus.");
		
		} else {
			
			System.out.println("Não foi possível realizar o transporte.");
		}
	}
}
