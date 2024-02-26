package application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do funcionario: ");
		String nome = sc.nextLine();
		System.out.println("Digite o salario bruto: ");
		double salario = sc.nextDouble();
		System.out.println("Digite a taxa combrada: ");
		double taxa = sc.nextDouble();
		
		funcionario fun = new funcionario(nome, salario, taxa);
		
		System.out.println("Funcionario: " + fun.getNome() + " $" + fun.salarioBruto());
		
		System.out.println("Digite qual a porcentagem de comissao: ");
		double porcentagem = sc.nextDouble();
		fun.incremetaSalario(porcentagem);
		
		System.out.println("Funcionario atualizado; " + fun);
		
		
		sc.close();

	}

}
