package atividades.oop6;

public class Lutador implements Comparable<Lutador>{
	
	private int armadura;
	private int potencia;
	private int agilidade;
	private String nome;
	
	public Lutador(String nome, int armadura, int potencia, int agilidade) {
		this.nome = nome;
		this.armadura = armadura;
		this.potencia = potencia;
		this.agilidade = agilidade;		
	}

	@Override
	public int compareTo(Lutador o) {
		if (getArmadura() > o.getArmadura()) System.out.println("A armadura de " + this.getNome() + " é melhor!");
		else if (getArmadura() < o.getArmadura()) System.out.println("A armadura de " + o.getNome() + " é melhor!");
		else System.out.println("Empate de Armaduras");

		if (getPotencia() > o.getPotencia()) System.out.println("A força de " + this.getNome() + " é melhor!");
		else if (getPotencia() < o.getPotencia()) System.out.println("A força de " + o.getNome() + " é melhor!");
		else System.out.println("Empate de Potencia de socos");
		
		if (getAgilidade() > o.getAgilidade()) System.out.println("A velocidade de " + this.getNome() + " é melhor!");
		else if (getAgilidade() < o.getAgilidade()) System.out.println("A velocidade de " + o.getNome() + " é melhor!");
		else System.out.println("Empate de Agilidade");
		return 0;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
