package anajulia;

public class VeiculoTeste {
	public static void main(String[] args) {
		
		Caminhao caminhao1 = new Caminhao("Mercedes", "1512", 1990, 30);
		caminhao1.ligar();
		caminhao1.carregarCacamba(20);
		caminhao1.carregarCacamba(11);
		
		caminhao1.realizarTransporte();
		caminhao1.desligar();
		
		System.out.println("================================================================================");
		
		Onibus onibus1 = new Onibus("Mercedes", "Modelo y", 2010, 46);
		onibus1.ligar();
		onibus1.inserirPassageiros(30);
		onibus1.inserirPassageiros(20);
		onibus1.realizarTransporte();
		onibus1.retirarPassageiros(4);
		onibus1.realizarTransporte();
		onibus1.desligar();
	}
}
