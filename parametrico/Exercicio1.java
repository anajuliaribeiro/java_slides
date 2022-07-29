package parametrico;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
	public List <Integer> numero;
	private int soma;
	private double media;
	
	public Exercicio1() {
		this.numero = new ArrayList <Integer>();
		this.soma = 0;
		this.media = 0;
		
	}
	
	public void somarNumeros() {
		for (Integer n : numero) {
			this.soma += n;		
		}
		
		System.out.println("Soma de todos os números: " + this.soma);
	}
	
	public void fazerMediaNumeros() {
		for (Integer soma : numero) {
			this.media = this.soma/5;
			System.out.println("Média aritmética: " + this.media);
		}
	}
	
}
