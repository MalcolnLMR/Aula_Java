package atividades.atividade08;

public class Main {

	public static void main(String[] args) {
		Viagem viagem1 = new Viagem(5);
		Viagem viagem2 = new Viagem(5);
		Viagem viagem3 = new Viagem(8);
		
		System.out.println("Viagem 1 e 2: " + viagem1.equals(viagem2));
		System.out.println("Viagem 1 e 3: " + viagem1.equals(viagem3));
		
	}
}
