package aula14;

public abstract class Funcionario {
	protected String nome;
	protected long cpf;
	protected double salarioBase;
	
	
	public Funcionario(String nome, long cpf, double salarioBase) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}



	public Double calcularSalario() {
		
		return null;
	}



	public String getNome() {
		return nome;
	}



	public long getCpf() {
		return cpf;
	}



	public double getSalarioBase() {
		return salarioBase;
	}
	
	
}
