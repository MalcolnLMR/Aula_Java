package atividades.oop4;

public class Main {

	public static void main(String[] args) {
		Pousada pousada = new Pousada(5, 12, 350);
		
		System.out.println("Bebidas: " + pousada.bebidas(2, 1));
		System.out.print("Diarias: " + pousada.refeicoes(1, 1));
		
	}

}
