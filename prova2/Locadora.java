package prova2;
	
import java.util.Scanner;

public class Locadora {

	
		private String modelo;
		private String marca;
		private String placa;
		private int valorDiaria;
		private String cliente;
		private Boolean alugado = false;
		private int dias = 2;
		
		
		
		public Locadora(String modelo, String marca, String placa, int valorDiaria, String cliente) {
			
			this.modelo = modelo;
			this.marca = marca;
			this.placa = placa;
			this.valorDiaria = valorDiaria;
			this.cliente = cliente;
			
		}
		
		public void locacao(String modelo, String marca, String placa, int valorDiaria, String cliente) {
			Scanner entradateclado = new Scanner(System.in);
			
			if (this.alugado == true) {
				System.out.println("Esse carro já foi alugado.");
			}
			else{
				
				//System.out.println("Informe o nome do cliente: ");
				//this.cliente = entradateclado.next();
				this.alugado = true; 
				System.out.println("Carro " + this.getModelo() +  " alugado.");
				
				
			}
			
			entradateclado.close();
		}
		
		public void devolucao(String modelo, int valorDiaria, String cliente) {
			//Scanner entradateclado = new Scanner(System.in);
			
			if (this.alugado = false) {
				System.out.println("Esse carro não foi alugado, portanto não pode ser devolvido.");
			}
			
			else {
				Scanner entradateclado = new Scanner(System.in);
				
				System.out.println( this.getCliente() + " escolheu devolver o carro: " + this.getMarca() + " " + this.getModelo());
				System.out.println("O carro ficou alugado por 2 dias.");
				//System.out.println("Por quantos dias o carro ficou alugado?");
				//this.dias = entradateclado.nextInt();
				System.out.println("Carro " + this.getModelo() +  " devolvido.");
				
			
				this.valorDiaria = valorDiaria * this.dias;
				
				System.out.println("O valor da diária desse carro é de: " + valorDiaria);
				System.out.println("O valor total é de: " +this.getValorDiaria() + " reais.");
				this.alugado = true;
				entradateclado.close();
			}
			
			
		}

		
		
		

		public String getModelo() {
			return modelo;
		}

		
		public String getMarca() {
			return marca;
		}


		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getValorDiaria() {
			return valorDiaria;
		}

		public void setValorDiaria(int valorDiaria) {
			this.valorDiaria = valorDiaria;
		}

		public String getCliente() {
			return cliente;
		}

		public Boolean getAlugado() {
			return alugado;
		}

		public int getDias() {
			return dias;
		}

		@Override
		public String toString() {
			return "Locadora [modelo=" + modelo + ", marca=" + marca + ", placa=" + placa + ", valorDiaria=" + valorDiaria
					+ ", cliente=" + cliente + ", alugado=" + alugado + ", dias=" + dias + "]";
		}
		
}
