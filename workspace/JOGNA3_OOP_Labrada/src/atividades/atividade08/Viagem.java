package atividades.atividade08;

public class Viagem {
	
	private int totalViajantes = 0;
	
	public Viagem(int n) {		
		FrotaTurismo.adicionarViajante(n);	
		totalViajantes += n;
	}
	
	@Override
	public boolean equals(Object obj) {
		Viagem viagem = (Viagem) obj;
		return totalViajantes == viagem.totalViajantes;
	}
}

