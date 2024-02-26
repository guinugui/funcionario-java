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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double salarioBruto() {
		return salario - taxa;
	}

	public void incremetaSalario(Double porcentagem) {
		salario += salario * (porcentagem / 100.0);
		
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioBruto());
		}

}
