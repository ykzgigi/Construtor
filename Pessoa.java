package Atividade11_09;

public class Pessoa {
	private String nome;
	private int idade;
	
	//construtor padrão sem argumento é criado mesmo que não explicitado
	public Pessoa() {
		
	}
	
	
	//método construtor com 2 argumentos
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//construtor com 1 argumento
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
