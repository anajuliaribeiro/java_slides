package aula14;

public abstract class Comissionado extends Funcionario {
	protected double totalVendas;
	protected double taxaComissao;
	
	
	public Comissionado(String nome, long cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
		
	}


	public Double  calcularSalario() {
		return this.getSalarioBase() + (this.getTotalVendas() * this.getTaxaComissao());
	}


	public double getTotalVendas() {
		return totalVendas;
	}


	public double getTaxaComissao() {
		return taxaComissao;
	}

	
}
