package anajulia;

public class Veiculo {

	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected boolean ligado;

	public Veiculo(String marca, String modelo, int anoFabricacao) {

		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.ligado = false;
	}

	public void ligar() {

		if (this.ligado == true) {
		
			System.out.println(this.marca + "  " + this.modelo + " já está ligado.");

		} else {
			
			this.ligado = true;
			System.out.println(this.marca + "  " + this.modelo + " ligou.");
		}
	}

	public void desligar() {
		
		if (this.ligado == true) {
		
			this.ligado = false;
			
			System.out.println(this.marca + "  " + this.modelo + " desligou.");
		
		} else {
			
			System.out.println(this.marca + "  " + this.modelo + " já está desligado.");
		}
	}
}
