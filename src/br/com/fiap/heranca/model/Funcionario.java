package br.com.fiap.heranca.model;

public class Funcionario extends Pessoa {
	
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public void exibirDados() {
		System.out.println(super.getNome());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("Cargo: " + this.cargo);
		System.out.println("--------------------------------");
	}

}
