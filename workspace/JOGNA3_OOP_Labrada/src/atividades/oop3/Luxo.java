package atividades.oop3;

public class Luxo extends Quarto{

	@Override
	public double calculoPreco() {
		return getPrecoBase() * 1.3;
	}	

}
