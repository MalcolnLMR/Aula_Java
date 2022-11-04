package atividades.oop5;

public class ModeloDeCarro implements Comparable<ModeloDeCarro> {
	
	private int potencia, aerodinamica, tipoDePneu;
	private String nome;
	
	public ModeloDeCarro(String nome, int potencia, int aerodinamica, int tipoDePneu) {
		setNome(nome);		
		setPotencia(potencia);
		setAerodinamica(aerodinamica);		
		setTipoDePneu(tipoDePneu);	
	}

	@Override
	public int compareTo(ModeloDeCarro o) {
		
		if(this.getAerodinamica() > o.getAerodinamica()) System.out.println(this.getNome() + " - Tem Mais Aerodinânica");
		if(this.getAerodinamica() == o.getAerodinamica()) System.out.println(this.getNome() + " - Tem a mesma Aerodinânica de " + o.getNome());
		if(this.getAerodinamica() < o.getAerodinamica()) System.out.println(this.getNome() + " - Tem Menos Aerodinânica");
		
		if(this.getPotencia() > o.getPotencia()) System.out.println(this.getNome() + " - Tem Mais Potência");
		if(this.getPotencia() == o.getPotencia()) System.out.println(this.getNome() + " - Tem a mesma Potência de " + o.getNome());
		if(this.getPotencia() < o.getPotencia()) System.out.println(this.getNome() + " - Tem Menos Potência");
		
		if(this.getTipoDePneu() > o.getTipoDePneu()) System.out.println(this.getNome() + " - Tem Mais Tipo de Pneu");
		if(this.getTipoDePneu() == o.getTipoDePneu()) System.out.println(this.getNome() + " - Tem o mesmo Tipo de Pneu de " + o.getNome());
		if(this.getTipoDePneu() < o.getTipoDePneu()) System.out.println(this.getNome() + " - Tem Menos Tipo de Pneu");		
		
		return 0;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAerodinamica() {
		return aerodinamica;
	}

	public void setAerodinamica(int aerodinamica) {
		this.aerodinamica = aerodinamica;
	}

	public int getTipoDePneu() {
		return tipoDePneu;
	}

	public void setTipoDePneu(int tipoDePneu) {
		this.tipoDePneu = tipoDePneu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
