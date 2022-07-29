package aula14;

public abstract class Assalariado extends Funcionario {
	private double adicional;


	public Assalariado(String nome, long cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}


	@Override
	public  Double calcularSalario() {
		return this.getSalarioBase() + this.getAdicional();
	}


	public double getAdicional() {
		return adicional;
	}
	
	
}
