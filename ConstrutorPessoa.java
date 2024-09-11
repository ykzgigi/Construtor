package Atividade11_09;

public class ConstrutorPessoa {

	public static void main(String[] args) {

		Pessoa jogador1 = new Pessoa();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~PESSOA 01~~~~~~~~~~~~~~~~~~~~~~~");

		jogador1.setNome("gigi");
		jogador1.setIdade(16);
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());


		System.out.println("~~~~~~~~~~~~~~~~~~~~~PESSOA 02~~~~~~~~~~~~~~~~~~~~~~~");


		Pessoa jogador2 = new Pessoa("Ana Julya", 17);

		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());


		//construtor em 1 argumento

		System.out.println("~~~~~~~~~~~~~~~~~~~~~PESSOA 03~~~~~~~~~~~~~~~~~~~~~~~");

		Pessoa jogador3 = new Pessoa("Rafaella");
		System.out.println(jogador3.getNome());


		System.out.println("~~~~~~~~~~~~~~~~~~~~~PESSOA 04~~~~~~~~~~~~~~~~~~~~~~~");

		Pessoa jogador4 = new Pessoa(22);
		System.out.println(jogador4.getIdade());



	}

}