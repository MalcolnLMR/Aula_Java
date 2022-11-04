package atividades.oop4;

public class Pousada implements Restaurante{
	
	private int precoAgua, precoCerveja, diaria;
	
	public Pousada(int precoAgua, int precoCerveja, int diaria) {
		setPrecoAgua(precoAgua);
		setPrecoCerveja(precoCerveja);
		setDiaria(diaria);
	}

	@Override
	public float bebidas(int aguaRefrig, int cerveja) {		
		return getPrecoAgua() * aguaRefrig + getPrecoCerveja() * cerveja;
	}

	@Override
	public float refeicoes(int adulto, int crianca) {		
		return getDiaria() * adulto * (crianca / 2);
	}

	public int getPrecoAgua() {
		return precoAgua;
	}

	public void setPrecoAgua(int precoAgia) {
		this.precoAgua = precoAgia;
	}

	public int getPrecoCerveja() {
		return precoCerveja;
	}

	public void setPrecoCerveja(int precoCerveja) {
		this.precoCerveja = precoCerveja;
	}

	public int getDiaria() {
		return diaria;
	}

	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}

}
