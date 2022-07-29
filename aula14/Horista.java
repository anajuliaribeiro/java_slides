package aula14;

public abstract class Horista extends Funcionario {
	protected double precoHora;
	protected double horasTrabalhadas;
	
	
	


	public Horista(String nome, long cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
		
	}


	public Double calcularSalario() {
		return (this.getHorasTrabalhadas() * this.getPrecoHora()) + this.getSalarioBase();
	}


	public double getPrecoHora() {
		return precoHora;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	
}
