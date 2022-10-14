package atividades.oop3;

public abstract class Quarto {
	
	private int precoBase;

	public int getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(int precoBase) {
		this.precoBase = precoBase;
	}
	
	public abstract double calculoPreco();

}
