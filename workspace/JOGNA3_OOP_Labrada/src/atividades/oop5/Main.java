package atividades.oop5;

public class Main {

	public static void main(String[] args) {
		ModeloDeCarro carro1 = new ModeloDeCarro("Subaru", 1, 2, 13);
		ModeloDeCarro carro2 = new ModeloDeCarro("Opala", 2, 1, 2);
		
		carro1.compareTo(carro2);
		carro2.compareTo(carro1);
	}

}
