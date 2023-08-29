package br.com.fiap.heranca;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.fiap.heranca.model.Cliente;
import br.com.fiap.heranca.model.Funcionario;
import br.com.fiap.heranca.model.Tela;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro da Silva");
		f1.setIdade(-32);
		f1.setCargo("Desenvolvedor Java");
		f1.exibirDados();
		
		Cliente c1 = new Cliente(); // c1 é uma variável de referência
		c1.setNome("Maria");
		c1.setIdade(23);
		c1.exibirDados();
		
		
		
		

		
		Tela tela = new Tela();
		tela.setTitle("Minha tela");
		tela.setLayout(null);
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao = new JButton();	
		botao.setText("Clique aqui");
		botao.setBounds(20, 30, 200, 60);
		
		Font impact = new Font("Impact", Font.BOLD, 30);
		
		botao.setFont(impact);
		
		tela.getContentPane().add(botao);
		
		tela.setVisible(true);
		//System.out.println(tela);
		
//		Cliente teste = c1;
//		System.out.println("---------------------");
//		System.out.println(teste);
//		System.out.println(c1);
//		System.out.println(teste.getNome());
//		System.out.println(c1.getNome());
		

	}

}
