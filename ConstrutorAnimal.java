package Atividade11_09;

public class ConstrutorAnimal {

		public static void main(String[] args) {

		Animal animal = new Animal ("preto", 30);
		Animal animal2 = new Animal ("preto"); 
		Animal animal3 = new Animal (30);

		System.out.println(" Idade: " + animal.getCor());
		System.out.println(" Nome: " + animal.getTamanho());

		System.out.println(" Nome do motorista 2: " + animal2.getCor());

		System.out.println(" Idade do motorista 3: " + animal3.getTamanho());

		}

}
