package br.com.fiap.heranca.model;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return "Nome: " + nome.toUpperCase();
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade < 0) {
			System.out.println( "A idade não pode ser negativa. Assumirei o valor 0!");
			idade = 0;
		} else {
			idade = novaIdade;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("--------------------------------");
	}

}
