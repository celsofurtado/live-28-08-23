package br.com.fiap.heranca.model;

public class Cliente extends Pessoa {
	
	
	
	@Override
	public void exibirDados() {
		System.out.println("C L I E N T E");
		System.out.println(super.getNome());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("--------------------------------");
	}
	
	
	
}
