package entities;

public class funcionario {

	private String nome;
	private Double salario;
	private Double taxa;
	public funcionario(String nome, Double salario, Double taxa) {
		this.nome = nome;
		this.salario = salario;
		this.taxa = taxa;
	}
	
	public Double salarioBruto() {
		return salario - taxa;
	}
	public void incremetaSalario(Double porcentagem) {
		double soma = salario * (porcentagem / 100.0);
	}
	
	
}
