package prova2;

import java.util.Scanner;

public class LocadoraTeste {
		public static void main(String[] args) {
			Scanner entradateclado = new Scanner(System.in);
			Locadora carro1 = new Locadora("Fiesta", "Ford", "bmx-1423", 65, "Ana Julia Ribeiro");
			Locadora carro2 = new Locadora("Focus", "Ford", "edh-1234", 70, "Alessandra");
			
			
			carro1.locacao("Fiesta", "Ford", "bmx-1423", 65, "Ana Julia Ribeiro");
			carro2.locacao("Focus", "Ford", "edh-1234", 70, "Alessandra");
			
			
			carro1.devolucao("Fiesta", 65, "Ana Julia Ribeiro");
			carro2.devolucao("Focus", 70, "Alessandra");
			
			
			entradateclado.close();
		}

}
