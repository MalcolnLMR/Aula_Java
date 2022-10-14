package atividades.atividade08;

public class FrotaTurismo {
	
	private static int TodosViajantes = 0;
	
	public static void adicionarViajante(int n) {
		FrotaTurismo.TodosViajantes += n;
		System.out.println(
				"Quantidade Total de Viajantes: " 
				+ Integer.toString(FrotaTurismo.TodosViajantes));
		System.out.println(
				"Viajantes Adicionados: " 
				+ Integer.toString(n));
	}
	
	public static void zerarViajantes() {
		FrotaTurismo.TodosViajantes = 0;
	}

}

