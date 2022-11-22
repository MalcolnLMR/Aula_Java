package atividades.oop6;

public class Main {

	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Marcelo", 1, 2, 3);
		Lutador lutador2 = new Lutador("Adriano", 3, 2, 1);
		
		lutador1.compareTo(lutador2);
	}

}

